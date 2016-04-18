package es.uniovi.asw.repository;

import static org.junit.Assert.*;

import java.awt.print.Pageable;

import org.junit.Test;

import org.springframework.data.domain.Sort;

import es.uniovi.asw.model.Voto;

import es.uniovi.asw.repository.impl.VotoRepositoryImpl;


public class VotoRepositoryTest {
	

	private VotoRepository voto = new VotoRepositoryImpl();
	

	@Test
	public void testFindAll1() {
		
		assertTrue(voto.findAll() == null);
		
	}
	
	@Test
	public void testFindAll2() {
		
		Sort sort = null;
		assertTrue(voto.findAll(sort) == null);
		
	}
	
	@Test
	public void testFindAll3() {
		
		Iterable<Long> ids = null;
		assertTrue(voto.findAll(ids) == null);
		
	}
	

	@Test
	public <S extends Voto> void testSave() {
		
		Iterable<S> entities = null;
		assertTrue(voto.save((Iterable<S>) entities) == null);
		
	}
	

	@Test
	public <S extends Voto> void testSaveAndFlush() {
		
		S entity = null;
		assertTrue(voto.saveAndFlush(entity) == null);
		
	}
	

	@Test
	public void testGetOne() {
		
		Long id = null;
		assertTrue(voto.getOne(id) == null);
		
	}
	

	@Test
	public void testFindAll() {
		
		Pageable page = null;
		assertTrue(voto.findAll((Sort) page) == null);
		
	}
	

	@Test
	public void testFindOne() {
		
		Long id = null;
		assertTrue(voto.findOne(id) == null);
		
	}
	

	@Test
	public void testExists() {
		
		Long id = null;
		if (id == null)
			assertFalse(voto.exists(id));
		
	}
	

	@Test
	public void testFindByIdEleccion() {
		
		Long idEleccion = null;
		assertTrue(voto.findByIdEleccion(idEleccion) == null);
		
	}
	

}
