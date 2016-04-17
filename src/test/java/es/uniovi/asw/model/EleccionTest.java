package es.uniovi.asw.model;

import static org.junit.Assert.*;

import org.junit.Test;

import es.uniovi.asw.model.Eleccion;

public class EleccionTest {
	
	
	private Eleccion e = new Eleccion();

	
	@Test
	public void testNombre() {
		
		e.setNombre("Eleccion3");
		assertTrue(e.getNombre().equals("Eleccion3"));
		
		e.setNombre(null);
		assertFalse(e.getNombre().equals(null));
		
		e.setNombre("Eleccion1");
		assertTrue(e.getNombre().equals("Eleccion1"));
		assertFalse(e.getNombre().equals("Eleccion3"));
		assertFalse(e.getNombre().equals(null));
		
		e.setNombre("");
		assertFalse(e.getNombre().equals(""));
		
	}

	
}
