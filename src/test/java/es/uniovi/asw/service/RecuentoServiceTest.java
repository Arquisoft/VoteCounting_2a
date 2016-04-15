
package es.uniovi.asw.service;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.IntegrationTest;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import es.uniovi.asw.Application;
import es.uniovi.asw.controller.exception.NotValidValueException;
import es.uniovi.asw.repository.RecuentoRepository;
import es.uniovi.asw.service.impl.RecuentoServiceImpl;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = { Application.class,
	RecuentoServiceImpl.class })
@WebAppConfiguration
@IntegrationTest({ "server.port=0" })
public class RecuentoServiceTest {
    @Autowired
    RecuentoService recuento;
    @Autowired
    RecuentoRepository repRec;
    //Eleccion idEleccion = 1;

    @Test(expected = IllegalArgumentException.class)
    public void realizarRecuentoNuloTest() {
	if(recuento != null){
	   recuento.publicarRecuento(new Long(1));
	}

    }

    @Test(expected = NotValidValueException.class)
    public void realizarRecuentoTest() {
	assertEquals(repRec.findByIdEleccion(new Long(1)),
		recuento.publicarRecuento(new Long(1)));

    }
}
