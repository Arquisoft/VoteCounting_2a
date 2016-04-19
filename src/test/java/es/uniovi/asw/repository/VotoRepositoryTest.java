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
import es.uniovi.asw.model.Voto;
import junit.framework.TestCase;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = Application.class)
@WebAppConfiguration
@IntegrationTest({ "server.port=0" })
public class VotoRepositoryTest {

	@Autowired
	private VotoRepository voto;
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

		if (sort == null)
			assertTrue(voto.findAll(sort) == null);
		else
			assertFalse(voto.findAll(sort) == null);

	}

	@Test
	public void testFindAllIds() {

		if (ids == null)
			assertTrue(voto.findAll(ids) == null);
		else
			assertFalse(voto.findAll(ids) == null);

	}

	@Test
	public <S extends Voto> void testSaveIterable() {

		Iterable<S> entities = null;
		assertTrue(voto.save((Iterable<S>) entities) == null);

	}



	@Test
	public void testGetOne() {

		if (id == null)
			assertTrue(voto.getOne(-1L) == null);
		else
			assertFalse(voto.getOne(id) == null);

	}

	@Test
	public void testFindAllPage() {

		if (page == null)
			assertTrue(voto.findAll((Sort) page) == null);
		else
			assertFalse(voto.findAll((Sort) page) == null);

	}

	@Test
	public <S extends Voto> void testSaveS() {

		Voto v = new Voto();
		v.setIdColegio(new Long (1));
		v.setIdEleccion(new Long(1));
		v.setOpcion("No");
		v = this.voto.save(v);
		
		TestCase.assertNotNull(v);

	}

	@Test
	public void testFindOne() {

		if (id == null)
			TestCase.assertNull(voto.findOne(-1L));
		else
			TestCase.assertNotNull(voto.findOne(id));

	}

	@Test
	public void testExists() {

		if (id == null)
			assertFalse(voto.exists(-1L));
		else
			assertTrue(voto.exists(id));

	}

	@Test
	public void testCount() {

		assertEquals(voto.count(), 0);

	}

	@Test
	public void testFindByIdEleccion() {

		if (idEleccion == null)
			assertTrue(voto.findByIdEleccion(idEleccion) == null);
		else
			assertFalse(voto.findByIdEleccion(idEleccion) == null);

	}

}
