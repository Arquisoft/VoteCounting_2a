package es.uniovi.asw.rest;

import static org.junit.Assert.*;

import es.uniovi.asw.rest.RecuentoPieRest;

import org.junit.Test;

public class RecuentoPieRestTest {
	
	
	private RecuentoPieRest rpr = new RecuentoPieRest();

	
	@Test
	public void testValue() {
		
		rpr.setValue("Value1");
		assertTrue(rpr.getValue().equals("Value1"));
		
		rpr.setValue(null);
		assertFalse(rpr.getValue().equals(null));
		
		rpr.setValue("Value2");
		assertTrue(rpr.getValue().equals("Value2"));
		assertFalse(rpr.getValue().equals("Value4"));
		assertFalse(rpr.getValue() == null);
		
		rpr.setValue("");
		assertFalse(rpr.getValue().equals(""));
		
	}
	
	@Test
	public void testLabel() {
		
		rpr.setLabel("Label2");
		assertTrue(rpr.getLabel().equals("Label2"));
		
		rpr.setLabel(null);
		assertFalse(rpr.getLabel().equals(null));
		
		rpr.setLabel("Label4");
		assertTrue(rpr.getLabel().equals("Label4"));
		assertFalse(rpr.getLabel().equals("Label8"));
		assertFalse(rpr.getLabel() == null);
		
		rpr.setLabel("");
		assertFalse(rpr.getLabel().equals(""));
		
	}


}
