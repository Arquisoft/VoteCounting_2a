package es.uniovi.asw;

import static org.junit.Assert.*;

import org.junit.Test;

import es.uniovi.asw.model.Recuento;

public class RecuentoTest {

	@Test
	public void test() {
		Recuento rec = new Recuento();
		rec.setIdEleccion((long) 1);
		assertTrue(rec.getIdEleccion().equals((long)1));
		assertFalse(rec.getIdEleccion() == null);
		rec.setIdEleccion((long) 0);
		assertFalse(rec.getIdEleccion().equals((long)0));
		rec.setIdEleccion((long) -7);
		assertFalse(rec.getIdEleccion().equals((long)-7));
		rec.setIdEleccion(null);
		assertFalse(rec.getIdEleccion().equals(null));
		
		rec.setOpcion("Si");
		assertTrue(rec.getOpcion().equals("Si"));
		rec.setOpcion(null);
		assertFalse(rec.getOpcion().equals(null));
		rec.setOpcion("No");
		assertTrue(rec.getOpcion().equals("No"));
		assertFalse(rec.getOpcion().equals("Ns/Nc"));
		assertFalse(rec.getOpcion() == null);
		rec.setOpcion("");
		assertFalse(rec.getOpcion().equals(""));
		
		rec.setTotal((long)80);
		assertTrue(rec.getTotal().equals((long)80));
		assertFalse(rec.getTotal() == null);
		rec.setTotal((long)0);
		assertTrue(rec.getTotal().equals((long)0));
		rec.setTotal((long) -3);
		assertFalse(rec.getTotal().equals((long)-3));
		rec.setTotal(null);
		assertFalse(rec.getTotal().equals(null));
		
	}

}
