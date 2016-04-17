package es.uniovi.asw.model;

import static org.junit.Assert.*;

import org.junit.Test;

import es.uniovi.asw.model.ColegioElectoral;

public class ColegioElectoralTest {
	
	private ColegioElectoral cE = new ColegioElectoral();

	@Test
	public void testNombre() {
		
		cE.setNombre("Colegio2");
		assertTrue(cE.getNombre().equals("Colegio2"));
		
		cE.setNombre(null);
		assertFalse(cE.getNombre().equals(null));
		
		cE.setNombre("Colegio8");
		assertTrue(cE.getNombre().equals("Colegio8"));
		assertFalse(cE.getNombre().equals("Colegio2"));
		assertFalse(cE.getNombre().equals(null));
		
		cE.setNombre("");
		assertFalse(cE.getNombre().equals(""));
		
	}

	
}
