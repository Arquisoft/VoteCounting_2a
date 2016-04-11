package es.uniovi.asw.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import es.uniovi.asw.model.Recuento;
import es.uniovi.asw.repository.RecuentoRepository;
import es.uniovi.asw.service.RecuentoService;

@Service
public class RecuentoServiceImpl implements RecuentoService {

    @Autowired
    private RecuentoRepository recuentoRepository;

    public List<Recuento> publicarRecuento(Long idEleccion) {
	if (idEleccion == null)
	    throw new IllegalArgumentException("idEleccion no puede ser nulo");

	return this.recuentoRepository.findByIdEleccion(idEleccion);
    }

}
