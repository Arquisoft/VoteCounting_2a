
//package es.uniovi.asw.service;

//import static org.junit.Assert.*;

//import java.util.List;

//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.IntegrationTest;
//import org.springframework.boot.test.SpringApplicationConfiguration;
//import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
//import org.springframework.test.context.web.WebAppConfiguration;

//import es.uniovi.asw.Application;
//import es.uniovi.asw.controller.exception.NotValidValueException;
//import es.uniovi.asw.model.Voto;
//import es.uniovi.asw.repository.RecuentoRepository;
//import es.uniovi.asw.repository.VotoRepository;

//@RunWith(SpringJUnit4ClassRunner.class)
//@SpringApplicationConfiguration(classes = Application.class)
//@WebAppConfiguration
//@IntegrationTest({ "server.port=0" })
//public class VotoServiceTest {
//	@Autowired
//	VotoService voto;

//	@Autowired
//	VotoRepository votos;

//	@Autowired
//	RecuentoRepository recuento;

//	@Test(expected = IllegalArgumentException.class)
//	public void realizarRecuento() {
//		if(voto != null)
//		voto.realizarRecuento(1).parseLong;
//	}

//	@Test(expected = NotValidValueException.class)
//	public void realizarRecuentoListaVaciaTest() {
//		voto.realizarRecuento(new Long(-1));
//	}

//	@Test(expected = NotValidValueException.class)
//	public void realizarRecuentoTest() {
//		int total = recuento.findAll().size();
//		List<Voto> temp = votos.findByIdEleccion(new Long(1));
//		if (temp.isEmpty())
//			throw new NotValidValueException();
//		voto.realizarRecuento(new Long(1));
//		assertTrue(total != recuento.findAll().size());
//	}

//}
