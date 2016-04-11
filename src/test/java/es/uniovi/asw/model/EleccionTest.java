package es.uniovi.asw;

import static org.junit.Assert.*;

import org.junit.Test;

import es.uniovi.asw.model.Eleccion;

public class EleccionTest {

	@Test
	public void test() {
		Eleccion e = new Eleccion();
		e.setNombre("Eleccion1");
		assertTrue(e.getNombre().equals("Eleccion1"));
		e.setNombre(null);
		assertFalse(e.getNombre().equals(null));
		e.setNombre("Eleccion2");
		assertTrue(e.getNombre().equals("Eleccion2"));
		assertFalse(e.getNombre().equals("Eleccion3"));
		assertFalse(e.getNombre() == null);
		e.setNombre("");
		assertFalse(e.getNombre().equals(""));
	}

}
