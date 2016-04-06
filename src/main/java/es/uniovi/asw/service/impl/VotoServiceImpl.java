package es.uniovi.asw.service.impl;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import es.uniovi.asw.model.Recuento;
import es.uniovi.asw.model.Voto;
import es.uniovi.asw.repository.RecuentoRepository;
import es.uniovi.asw.repository.VotoRepository;
import es.uniovi.asw.service.VotoService;

@Service
public class VotoServiceImpl implements VotoService {

	@Autowired
	private VotoRepository votoRepository;

	@Autowired
	private RecuentoRepository recuentoRepository;

	@Override
	public List<Voto> obtenerVotos(Long eleccionId) {
		if (eleccionId == null) {
			throw new IllegalArgumentException("eleccionId no puede ser nulo");
		}

		return this.votoRepository.findByIdEleccion(eleccionId);
	}

	@Override
	public void realizarRecuento(Long eleccionId) {
		if (eleccionId == null) {
			throw new IllegalArgumentException("eleccionId no puede ser nulo");
		}

		this.recuentoRepository.deleteAll();

		List<Voto> votos = this.votoRepository.findByIdEleccion(eleccionId);

		if (votos != null && !votos.isEmpty()) {
			Map<String, Long> recuento = new HashMap<String, Long>();
			String op = "";
			Long total = 0L;

			for (Voto v : votos) {
				op = v.getOpcion();
				total = recuento.get(op);
				
				if (total == null) {
					total = 0L;
				}
				
				recuento.put(op, total + 1);
			}

			Recuento r = null;
			Iterator<Entry<String, Long>> it = recuento.entrySet().iterator();
			while (it.hasNext()) {
				Entry<String, Long> e = it.next();
				r = new Recuento();
				r.setIdEleccion(eleccionId);
				r.setOpcion(e.getKey());
				r.setTotal(e.getValue());

				this.recuentoRepository.save(r);
				r = null;
			}
		}
	}

}
