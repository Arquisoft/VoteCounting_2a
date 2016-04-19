package es.uniovi.asw.repository;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.awt.print.Pageable;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.IntegrationTest;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.data.domain.Sort;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import es.uniovi.asw.Application;
import es.uniovi.asw.model.Recuento;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = Application.class)
@WebAppConfiguration
@IntegrationTest({ "server.port=0" })
public class RecuentoRepositoryTest {

	@Autowired
	private RecuentoRepository recuento;
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

		if (sort == null)
			assertTrue(recuento.findAll(sort) == null);
		else
			assertFalse(recuento.findAll(sort) == null);

	}

	@Test
	public void testFindAllIds() {

		if (ids == null)
			assertTrue(recuento.findAll(ids) == null);
		else
			assertFalse(recuento.findAll(ids) == null);

	}

	@Test
	public <S extends Recuento> void testSaveIterable() {

		Iterable<S> entities = null;
		assertTrue(recuento.save((Iterable<S>) entities) == null);

	}

	@Test
	public void testGetOne() {

		if (id == null)
			assertTrue(recuento.getOne(-1L) == null);
		else
			assertFalse(recuento.getOne(id) == null);

	}

	@Test
	public void testFindAllPage() {

		if (page == null)
			assertTrue(recuento.findAll((Sort) page) == null);
		else
			assertFalse(recuento.findAll((Sort) page) == null);

	}

	@Test
	public void testFindOne() {

		if (id == null)
			assertTrue(recuento.findOne(-1L) == null);
		else
			assertFalse(recuento.findOne(id) == null);

	}

	@Test
	public void testExists() {

		if (id == null)
			assertFalse(recuento.exists(-1L));
		else
			assertTrue(recuento.exists(id));

	}

	@Test
	public void testCount() {

		assertEquals(recuento.count(), 0);

	}

	@Test
	public void testFindByIdEleccion() {

		if (idEleccion == null)
			assertTrue(recuento.findByIdEleccion(idEleccion) == null);
		else
			assertFalse(recuento.findByIdEleccion(idEleccion) == null);

	}

}
