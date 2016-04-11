package es.uniovi.asw;

import static org.junit.Assert.*;

import org.junit.Test;

import es.uniovi.asw.model.Voto;

public class VotoTest {

	@Test
	public void test() {
		Voto v = new Voto();
		v.setIdColegio((long) 1);
		assertTrue(v.getIdColegio().equals((long)1));
		assertFalse(v.getIdColegio() == null);
		v.setIdColegio((long) 0);
		assertFalse(v.getIdColegio().equals((long)0));
		v.setIdColegio((long) -2);
		assertFalse(v.getIdColegio().equals((long)-2));
		v.setIdColegio(null);
		assertFalse(v.getIdColegio().equals(null));
		
		v.setIdEleccion((long) 12);
		assertTrue(v.getIdEleccion().equals((long)12));
		assertFalse(v.getIdEleccion() == null);
		v.setIdEleccion((long) 0);
		assertFalse(v.getIdEleccion().equals((long)0));
		v.setIdEleccion((long) -45);
		assertFalse(v.getIdEleccion().equals((long)-45));
		v.setIdEleccion(null);
		assertFalse(v.getIdEleccion().equals(null));
		
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
