
package es.uniovi.asw.service;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.IntegrationTest;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import es.uniovi.asw.Application;
import es.uniovi.asw.controller.exception.NotValidValueException;
import es.uniovi.asw.model.Recuento;
import es.uniovi.asw.model.Voto;
import es.uniovi.asw.repository.RecuentoRepository;
import es.uniovi.asw.repository.VotoRepository;
import es.uniovi.asw.repository.impl.RecuentoRepositoryImpl;
import es.uniovi.asw.repository.impl.VotoRepositoryImpl;
import es.uniovi.asw.service.impl.VotoServiceImpl;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = Application.class)
@WebAppConfiguration
@IntegrationTest({ "server.port=0" })
public class VotoServiceTest {
	
    //@Autowired
	VotoService voto;

	//@Autowired
	VotoRepository votos;

	//@Autowired
	RecuentoRepository recuento;
	
	private Long eleccionId = (long)1;
	
	
	@Test
	public void testObtenerVotos(){
		
		votos = new VotoRepositoryImpl();
		
		if(eleccionId == null)
			 throw new IllegalArgumentException("eleccionId no puede ser nulo");
		else
			votos.findByIdEleccion(eleccionId);
	}

	@Test
	public void testRealizarRecuento() {
		
		voto = new VotoServiceImpl();
		votos = new VotoRepositoryImpl();
		
		if(votos.findByIdEleccion(eleccionId) == null)
		   assertNull(votos.findByIdEleccion(new Long(1)));
		
		else if(votos.findByIdEleccion(eleccionId).isEmpty())
			 throw new NotValidValueException(
					    "La lista de votos no puede estar vacía");
		 	
		if(eleccionId == null)
			 throw new IllegalArgumentException("eleccionId no puede ser nulo");
		
		Map<String, Long> recuento = new HashMap<String, Long>();

		Recuento r = null;
		Iterator<Entry<String, Long>> it = recuento.entrySet().iterator();
		
		while (it.hasNext()) {
		    Entry<String, Long> e = it.next();
		    r = new Recuento();
		    r.setIdEleccion(eleccionId);
		    r.setOpcion(e.getKey());
		    r.setTotal(e.getValue());   
	}
		
  }

}
