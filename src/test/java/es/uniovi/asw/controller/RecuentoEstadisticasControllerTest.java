package es.uniovi.asw.controller;

import static org.junit.Assert.*;

import org.junit.Test;

public class RecuentoEstadisticasControllerTest {

	private RecuentoEstadisticasController r = new RecuentoEstadisticasController();

	@Test(expected = IllegalArgumentException.class)
	public void testRecuentoEstadisticas() {
		r.verEstadisticas(null); // Lanza excepción

		assertFalse(r.verEstadisticas(new Long(1)) == null);

	}

}
