package es.uniovi.asw;

import static org.junit.Assert.*;

import org.junit.Test;

import es.uniovi.asw.model.ColegioElectoral;

public class ColegioElectoralTest {

	@Test
	public void test() {
		ColegioElectoral cE = new ColegioElectoral();
		cE.setNombre("Colegio1");
		assertTrue(cE.getNombre().equals("Colegio1"));
		cE.setNombre(null);
		assertFalse(cE.getNombre().equals(null));
		cE.setNombre("Colegio2");
		assertTrue(cE.getNombre().equals("Colegio2"));
		assertFalse(cE.getNombre().equals("Colegio3"));
		assertFalse(cE.getNombre() == null);
		cE.setNombre("");
		assertFalse(cE.getNombre().equals(""));
	}

}
