package es.uniovi.asw.rest;

import static org.junit.Assert.*;

import org.junit.Test;

import es.uniovi.asw.rest.RecuentoRest;

public class RecuentoRestTest {
	
	private RecuentoRest rr = new RecuentoRest();
	

	@Test
	public void testEleccion() {
		
		rr.setEleccion("Eleccion1");
		assertTrue(rr.getEleccion().equals("Eleccion1"));
		
		rr.setEleccion(null);
		assertFalse(rr.getEleccion().equals(null));
		
		rr.setEleccion("Eleccion7");
		assertTrue(rr.getEleccion().equals("Eleccion7"));
		assertFalse(rr.getEleccion().equals("Eleccion3"));
		assertFalse(rr.getEleccion() == null);
		
		rr.setEleccion("");
		assertFalse(rr.getEleccion().equals(""));
		
	}
	
	@Test
	public void testOpcion(){
		
		rr.setOpcion("Si");
		assertTrue(rr.getOpcion().equals("Si"));
		
		rr.setOpcion(null);
		assertFalse(rr.getOpcion().equals(null));
		
		rr.setOpcion("No");
		assertTrue(rr.getOpcion().equals("No"));
		assertFalse(rr.getOpcion().equals("Ns/Nc"));
		assertFalse(rr.getOpcion() == null);
		
		rr.setOpcion("");
		assertFalse(rr.getOpcion().equals(""));
		
	}

	@Test
	public void testTotal(){
		
		rr.setTotal((long)40);
		assertTrue(rr.getTotal().equals((long)40));
		assertFalse(rr.getTotal() == null);
		
		rr.setTotal((long)0);
		assertTrue(rr.getTotal().equals((long)0));
		
		rr.setTotal((long)-3);
		assertFalse(rr.getTotal().equals((long)-3));
		
		rr.setTotal(null);
		assertFalse(rr.getTotal().equals(null));
		
	}
	
}
