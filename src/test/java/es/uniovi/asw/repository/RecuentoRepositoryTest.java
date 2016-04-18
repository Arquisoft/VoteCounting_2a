package es.uniovi.asw.repository;

import static org.junit.Assert.*;

import java.awt.print.Pageable;

import org.junit.Test;

import org.springframework.data.domain.Sort;

import es.uniovi.asw.model.Recuento;

import es.uniovi.asw.repository.impl.RecuentoRepositoryImpl;


public class RecuentoRepositoryTest {

	
	private RecuentoRepository recuento = new RecuentoRepositoryImpl();
	

	@Test
	public void testFindAll1() {
		
		assertTrue(recuento.findAll() == null);
		
	}

	
	@Test
	public void testFindAll2() {
		
		Sort sort = null;
		assertTrue(recuento.findAll(sort) == null);
		
	}
	

	@Test
	public void testFindAll3() {
		
		Iterable<Long> ids = null;
		assertTrue(recuento.findAll(ids) == null);
		
	}
	

	@Test
	public <S extends Recuento> void testSave() {
		
		Iterable<S> entities = null;
		assertTrue(recuento.save((Iterable<S>) entities) == null);
		
	}
	

	@Test
	public <S extends Recuento> void testSaveAndFlush() {
		
		S entity = null;
		assertTrue(recuento.saveAndFlush(entity) == null);
		
	}
	

	@Test
	public void testGetOne() {
		
		Long id = null;
		assertTrue(recuento.getOne(id) == null);
		
	}
	

	@Test
	public void testFindAll() {
		
		Pageable page = null;
		assertTrue(recuento.findAll((Sort) page) == null);
		
	}
	

	@Test
	public void testFindOne() {
		
		Long id = null;
		assertTrue(recuento.findOne(id) == null);
		
	}
	

	@Test
	public void testExists() {
		
		Long id = null;
		if (id == null)
			assertFalse(recuento.exists(id));
		
	}
	

	@Test
	public void testFindByIdEleccion() {
		
		Long idEleccion = null;
		assertTrue(recuento.findByIdEleccion(idEleccion) == null);
		
	}
	

}
