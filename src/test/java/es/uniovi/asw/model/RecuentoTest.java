package es.uniovi.asw.model;

import static org.junit.Assert.*;

import org.junit.Test;

import es.uniovi.asw.model.Recuento;

public class RecuentoTest {
	
	
	private Recuento rec = new Recuento();
	

	@Test
	public void testIdEleccion() {
		
		rec.setIdEleccion((long)3);
		assertTrue(rec.getIdEleccion().equals((long)3));
		assertFalse(rec.getIdEleccion() == null);
		
		rec.setIdEleccion((long)0);
		assertFalse(rec.getIdEleccion().equals((long)0));
		
		rec.setIdEleccion((long) -1);
		assertFalse(rec.getIdEleccion().equals((long)-1));
		
		rec.setIdEleccion(null);
		assertFalse(rec.getIdEleccion().equals(null));
		
	}
	
	
	@Test
	public void testOpcion(){
		
		rec.setOpcion("No");
		assertTrue(rec.getOpcion().equals("No"));
		
		rec.setOpcion(null);
		assertFalse(rec.getOpcion().equals(null));
		
		rec.setOpcion("Si");
		assertTrue(rec.getOpcion().equals("Si"));
		assertFalse(rec.getOpcion().equals("Ns/Nc"));
		assertFalse(rec.getOpcion() == null);
		
		rec.setOpcion("");
		assertFalse(rec.getOpcion().equals(""));
		
	}
	
	
	@Test
	public void testTotal(){
		
		rec.setTotal((long)60);
		assertTrue(rec.getTotal().equals((long)60));
		assertFalse(rec.getTotal() == null);
		
		rec.setTotal((long)0);
		assertTrue(rec.getTotal().equals((long)0));
		
		rec.setTotal((long)-5);
		assertFalse(rec.getTotal().equals((long)-5));
		
		rec.setTotal(null);
		assertFalse(rec.getTotal().equals(null));
		
	}

}
