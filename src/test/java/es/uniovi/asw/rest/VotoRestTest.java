package es.uniovi.asw.rest;

import static org.junit.Assert.*;

import es.uniovi.asw.rest.VotoRest;

import org.junit.Test;

public class VotoRestTest {
	
	
	private VotoRest vr = new VotoRest();
	

	@Test
	public void testEleccion() {
		
		vr.setEleccion("Eleccion1");
		assertTrue(vr.getEleccion().equals("Eleccion1"));
		
		vr.setEleccion(null);
		assertFalse(vr.getEleccion().equals(null));
		
		vr.setEleccion("Eleccion7");
		assertTrue(vr.getEleccion().equals("Eleccion7"));
		assertFalse(vr.getEleccion().equals("Eleccion3"));
		assertFalse(vr.getEleccion() == null);
		
		vr.setEleccion("");
		assertFalse(vr.getEleccion().equals(""));
		
	}
	
	
	@Test
	public void testColegioElectoral() {
		
		vr.setColegioElectoral("Colegio1");
		assertTrue(vr.getColegioElectoral().equals("Colegio1"));
		
		vr.setColegioElectoral(null);
		assertFalse(vr.getColegioElectoral().equals(null));
		
		vr.setColegioElectoral("Colegio2");
		assertTrue(vr.getColegioElectoral().equals("Colegio2"));
		assertFalse(vr.getColegioElectoral().equals("Colegio3"));
		assertFalse(vr.getColegioElectoral() == null);
		
		vr.setColegioElectoral("");
		assertFalse(vr.getColegioElectoral().equals(""));
	}
	
	
	@Test
	public void testOpcion(){
		
		vr.setOpcion("No");
		assertTrue(vr.getOpcion().equals("No"));
		
		vr.setOpcion(null);
		assertFalse(vr.getOpcion().equals(null));
		
		vr.setOpcion("Si");
		assertTrue(vr.getOpcion().equals("Si"));
		assertFalse(vr.getOpcion().equals("Ns/Nc"));
		assertFalse(vr.getOpcion() == null);
		
		vr.setOpcion("");
		assertFalse(vr.getOpcion().equals(""));
		
	}

}
