package es.uniovi.asw.repository;

import java.awt.print.Pageable;
import java.util.List;

import org.junit.Test;

import es.uniovi.asw.model.Recuento;
import es.uniovi.asw.repository.impl.RecuentoRepositoryImpl;

public class RecuentoRepositoryTest {

	private RecuentoRepository recuento = new RecuentoRepositoryImpl();

	@Test
	public List<Recuento> testFindAll() {
		assertFalse(recuento.findAll() == null);
	}

	@Test
	public List<Recuento> testFindAll(Sort sort) {
		if (sort == null)
			assertTrue(recuento.findAll(sort) == null);
		else
			assertFalse(recuento.findAll(sort) == null);
	}

	@Test
	public List<Recuento> testFindAll(Iterable<Long> ids) {
		if (ids == null)
			assertTrue(recuento.findAll(ids) == null);
		else
			assertFalse(recuento.findAll(ids) == null);
	}

	@Test
	public <S extends Recuento> List<S> testSave(Iterable<S> entities) {
		if (entities == null)
			assertTrue(recuento.save(entities) == null);
		else
			assertFalse(recuento.findAll(entities) == null);
	}

	@Test
	public <S extends Recuento> S testSaveAndFlush(S entity) {
		if (entity == null)
			assertTrue(recuento.saveAndFlush(entity) == null);
		else
			assertFalse(recuento.saveAndFlush(entity) == null);
	}

	@Test
	public Recuento testGetOne(Long id) {
		if (id == null)
			assertTrue(recuento.getOne(id) == null);
		else
			assertFalse(recuento.getOne(id) == null);
	}

	@Test
	public Page<Recuento> testFindAll(Pageable pageable) {
		if (pageable == null)
			assertTrue(recuento.findAll(pageable) == null);
		else
			assertFalse(recuento.findAll(pageable) == null);
	}

	@Test
	public <S extends Recuento> S testSave(S entity) {
		if (entity == null)
			assertTrue(recuento.save(entity) == null);
		else
			assertFalse(recuento.findAll(entity) == null);
	}

	@Test
	public Recuento testFindOne(Long id) {
		if (id == null)
			assertTrue(recuento.findOne(id) == null);
		else
			assertFalse(recuento.findOne(id) == null);
	}

	@Test
	public boolean testExists(Long id) {
		if (id == null)
			assertTrue(recuento.exists(id) == null);
		else
			assertFalse(recuento.exists(id) == null);
	}

	@Test
	public List<Recuento> testFindByIdEleccion(Long idEleccion) {
		if (idEleccion == null)
			assertTrue(recuento.findByIdEleccion(idEleccion) == null);
		else
			assertFalse(recuento.findByIdEleccion(idEleccion) == null);
	}

}
