package es.uniovi.asw.model;

import static org.junit.Assert.*;

import org.junit.Test;

import es.uniovi.asw.model.Voto;

public class VotoTest {
	
	
	private Voto v = new Voto();
	

	@Test
	public void testIdColegio() {
		
		v.setIdColegio((long)2);
		assertTrue(v.getIdColegio().equals((long)2));
		assertFalse(v.getIdColegio() == null);
		
		v.setIdColegio((long)0);
		assertFalse(v.getIdColegio().equals((long)0));
		
		v.setIdColegio((long)-10);
		assertFalse(v.getIdColegio().equals((long)-10));
		
		v.setIdColegio(null);
		assertFalse(v.getIdColegio().equals(null));
		
	}
	
	
	@Test
	public void testIdEleccion(){
		
		v.setIdEleccion((long)5);
		assertTrue(v.getIdEleccion().equals((long)5));
		assertFalse(v.getIdEleccion() == null);
		
		v.setIdEleccion((long)0);
		assertFalse(v.getIdEleccion().equals((long)0));
		
		v.setIdEleccion((long)-20);
		assertFalse(v.getIdEleccion().equals((long)-20));
		
		v.setIdEleccion(null);
		assertFalse(v.getIdEleccion().equals(null));
		
	}
	
	
	@Test
	public void testOpcion(){
		
		v.setOpcion("Si");
		assertTrue(v.getOpcion().equals("Si"));
		
		v.setOpcion(null);
		assertFalse(v.getOpcion().equals(null));
		
		v.setOpcion("No");
		assertTrue(v.getOpcion().equals("No"));
		assertFalse(v.getOpcion().equals("Ns/Nc"));
		assertFalse(v.getOpcion() == null);
		
		v.setOpcion("");
		assertFalse(v.getOpcion().equals(""));
		
	}

}
