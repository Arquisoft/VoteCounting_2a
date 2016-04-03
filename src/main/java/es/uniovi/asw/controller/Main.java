package es.uniovi.asw.controller;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import es.uniovi.asw.rest.RecuentoRest;
import es.uniovi.asw.rest.VotoRest;

@RestController
//@controller
public class Main {

	private static final Logger LOG = LoggerFactory.getLogger(Main.class);


	@RequestMapping("/online")
	public List<VotoRest> verResultadosOnline(Long eleccionesId) {
		LOG.info("verResultadosOnline page access");

		List<VotoRest> vr = new ArrayList<VotoRest>();

		int total = aleatorio(1000);
		for (int i = 0; i < total; i++) {
			vr.add(crearVoto());
		}
		return vr;
	}


	@RequestMapping("/recuento")
	public List<RecuentoRest> realizarRecuento(Long idEleccion) {
		LOG.info("realizarRecuento page access");
		
		RecuentoRest rSi = new RecuentoRest();
		rSi.setEleccion("27N");
		rSi.setOpcion("Sí");
		rSi.setTotal(100L);
		
		RecuentoRest rNo = new RecuentoRest();
		rNo.setEleccion("27N");
		rNo.setOpcion("Sí");
		rNo.setTotal(100L);
		
		RecuentoRest r = new RecuentoRest();
		r.setEleccion("27N");
		r.setOpcion("Nulo");
		r.setTotal(100L);
		
		List<RecuentoRest> vr = new ArrayList<RecuentoRest>();
		vr.add(rSi);
		vr.add(rNo);
		vr.add(r);
		return vr;
	}

	public String generarCE() {
		String ces[] = { "Ciudad Naranco", "Corredoria", "Lugones" };

		return ces[aleatorio(3) - 1];
	}

	public boolean generarOnline() {
		return aleatorio(100) > 20;
	}
	
	

	private int aleatorio(int max) {
		return (int) Math.floor(Math.random() * max + 1);
	}

}