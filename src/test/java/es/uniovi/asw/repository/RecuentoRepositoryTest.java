package es.uniovi.asw.repository;

import static org.junit.Assert.*;

import java.awt.print.Pageable;

import org.junit.Test;

import org.springframework.data.domain.Sort;

import es.uniovi.asw.model.Recuento;

import es.uniovi.asw.repository.impl.RecuentoRepositoryImpl;


public class RecuentoRepositoryTest {

	
	private RecuentoRepository recuento = new RecuentoRepositoryImpl();
	private Sort sort;
	private Iterable<Long> ids;
	private Long id;
	private Pageable page = null;
	private Long idEleccion;
	

	@Test
	public void testFindAll() {
		
		assertTrue(recuento.findAll() == null);
		
	}

	
	@Test
	public void testFindAllSort() {
		
		if(sort == null)
		   assertTrue(recuento.findAll(sort) == null);
		else
			assertFalse(recuento.findAll(sort) == null);
		
	}
	

	@Test
	public void testFindAllIds() {
		
		if(ids == null)
		  assertTrue(recuento.findAll(ids) == null);
		else
		  assertFalse(recuento.findAll(ids) == null);
		
	}
	

	@Test
	public <S extends Recuento> void testSaveIterable() {
		
		Iterable<S> entities = null;
		if(entities != null)
			assertFalse(recuento.save((Iterable<S>) entities) == null);
		else
		    assertTrue(recuento.save((Iterable<S>) entities) == null);
		
	}
	

	@Test
	public <S extends Recuento> void testSaveAndFlush() {
		
		S entity = null;
		if(entity != null)
		  assertFalse(recuento.saveAndFlush(entity) == null);
		else
		  assertTrue(recuento.saveAndFlush(entity) == null);
		
	}
	

	@Test
	public void testGetOne() {
		
		if(id == null)
			  assertTrue(recuento.getOne(id) == null);
		else
			  assertFalse(recuento.getOne(id) == null);
		
	}
	

	@Test
	public void testFindAllPage() {
		
		if(page == null)
		   assertTrue(recuento.findAll((Sort) page) == null);
		else
			assertFalse(recuento.findAll((Sort) page) == null);
		
	}
	
	
	@Test
	public <S extends Recuento> void testSaveS() {
		
		S entity = null;
		if(entity != null)
		  assertFalse(recuento.save(entity) == null);
		else
		  assertTrue(recuento.save(entity) == null);
		
	}
	

	@Test
	public void testFindOne() {
		
		if(id == null)
		   assertTrue(recuento.findOne(id) == null);
		else
		   assertFalse(recuento.findOne(id) == null);
		
	}
	

	@Test
	public void testExists() {
		
		if (id == null)
			assertFalse(recuento.exists(id));
		else
			assertTrue(recuento.exists(id));
		
	}
	
	
	@Test
	public void testCount() {
		
		assertEquals(recuento.count(),0);
		
	}
	

	@Test
	public void testFindByIdEleccion() {
		
		if(idEleccion == null)
		   assertTrue(recuento.findByIdEleccion(idEleccion) == null);
		else
		   assertFalse(recuento.findByIdEleccion(idEleccion) == null);
		
	}
	

}
