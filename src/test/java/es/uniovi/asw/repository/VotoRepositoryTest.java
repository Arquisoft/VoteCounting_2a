package es.uniovi.asw.repository;

import static org.junit.Assert.*;

import java.awt.print.Pageable;

import org.junit.Test;
import org.springframework.data.domain.Sort;

import es.uniovi.asw.model.Recuento;
import es.uniovi.asw.model.Voto;
import es.uniovi.asw.repository.impl.VotoRepositoryImpl;


public class VotoRepositoryTest {
	

	private VotoRepository voto = new VotoRepositoryImpl();
	private Sort sort;
	private Iterable<Long> ids;
	private Long id;
	private Pageable page = null;
	private Long idEleccion;
	

	@Test
	public void testFindAll() {
		
		assertTrue(voto.findAll() == null);
		
	}
	
	
	@Test
	public void testFindAllSort() {
		
		if(sort == null)
			   assertTrue(voto.findAll(sort) == null);
		else
				assertFalse(voto.findAll(sort) == null);
		
	}
	
	
	@Test
	public void testFindAllIds() {
		
		if(ids == null)
		  assertTrue(voto.findAll(ids) == null);
		else
		  assertFalse(voto.findAll(ids) == null);
		
	}
	

	@Test
	public <S extends Voto> void testSaveIterable() {
		
		Iterable<S> entities = null;
		if(entities != null)
			assertFalse(voto.save((Iterable<S>) entities) == null);
		else
		    assertTrue(voto.save((Iterable<S>) entities) == null);
		
	}
	

	@Test
	public <S extends Voto> void testSaveAndFlush() {
		
		S entity = null;
		if(entity != null)
		  assertFalse(voto.saveAndFlush(entity) == null);
		else
		  assertTrue(voto.saveAndFlush(entity) == null);
		
	}
	

	@Test
	public void testGetOne() {
		
		if(id == null)
			  assertTrue(voto.getOne(id) == null);
		else
			  assertFalse(voto.getOne(id) == null);
		
	}
	

	@Test
	public void testFindAllPage() {
		
		if(page == null)
		   assertTrue(voto.findAll((Sort) page) == null);
		else
			assertFalse(voto.findAll((Sort) page) == null);
		
	}
	
	
	@Test
	public <S extends Voto> void testSaveS() {
		
		S entity = null;
		if(entity != null)
		  assertFalse(voto.save(entity) == null);
		else
		  assertTrue(voto.save(entity) == null);
		
	}
	

	@Test
	public void testFindOne() {
		
		if(id == null)
		   assertTrue(voto.findOne(id) == null);
		else
		   assertFalse(voto.findOne(id) == null);
		
	}
	

	@Test
	public void testExists() {
		
		if (id == null)
			assertFalse(voto.exists(id));
		else
			assertTrue(voto.exists(id));
		
	}
	
	
	@Test
	public void testCount() {
		
		assertEquals(voto.count(),0);
		
	}
	

	@Test
	public void testFindByIdEleccion() {
		
		if(idEleccion == null)
		   assertTrue(voto.findByIdEleccion(idEleccion) == null);
		else
		   assertFalse(voto.findByIdEleccion(idEleccion) == null);
		
	}
	

}
