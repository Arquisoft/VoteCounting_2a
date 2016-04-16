package es.uniovi.asw.model;

import static org.junit.Assert.*;

import org.junit.Test;

import es.uniovi.asw.repository.*;

public class VotoRepositoryTest {

    private VotoRepository voto = new VotoRepositoryImpl();

    @Test
    public List<Voto> testFindAll() {
	assertFalse(voto.findAll() == null);
    }

    @Test
    public List<Voto> testFindAll(Sort sort) {
	if (sort == null)
	    assertTrue(voto.findAll(sort) == null);
	else
	    assertFalse(voto.findAll(sort) == null);
    }

    @Test
    public List<Voto> testFindAll(Iterable<Long> ids) {
	if (ids == null)
	    assertTrue(voto.findAll(ids) == null);
	else
	    assertFalse(voto.findAll(ids) == null);
    }

    @Test
    public <S extends Voto> List<S> testSave(Iterable<S> entities) {
	if (entities == null)
	    assertTrue(voto.save(entities) == null);
	else
	    assertFalse(voto.findAll(entities) == null);
    }

    @Test
    public <S extends Voto> S testSaveAndFlush(S entity) {
	if (entity == null)
	    assertTrue(voto.saveAndFlush(entity) == null);
	else
	    assertFalse(voto.saveAndFlush(entity) == null);
    }

    @Test
    public Voto testGetOne(Long id) {
	if (id == null)
	    assertTrue(voto.getOne(id) == null);
	else
	    assertFalse(voto.getOne(id) == null);
    }

    @Test
    public Page<Voto> testFindAll(Pageable pageable) {
	if (pageable == null)
	    assertTrue(voto.findAll(pageable) == null);
	else
	    assertFalse(voto.findAll(pageable) == null);
    }

    @Test
    public <S extends Voto> S testSave(S entity) {
	if (entity == null)
	    assertTrue(voto.save(entity) == null);
	else
	    assertFalse(voto.findAll(entity) == null);
    }

    @Test
    public Voto testFindOne(Long id) {
	if (id == null)
	    assertTrue(voto.findOne(id) == null);
	else
	    assertFalse(voto.findOne(id) == null);
    }

    @Test
    public boolean testExists(Long id) {
	if (id == null)
	    assertTrue(voto.exists(id) == null);
	else
	    assertFalse(voto.exists(id) == null);
    }

    @Test
    public List<Voto> testFindByIdEleccion(Long idEleccion) {
	if (idEleccion == null)
	    assertTrue(voto.findByIdEleccion(idEleccion) == null);
	else
	    assertFalse(voto.findByIdEleccion(idEleccion) == null);
    }

}
