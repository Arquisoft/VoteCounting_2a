package es.uniovi.asw.repository.impl;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import es.uniovi.asw.model.Voto;
import es.uniovi.asw.repository.VotoRepository;

public class VotoRepositoryImpl implements VotoRepository {

    public List<Voto> findAll() {
	// TODO Auto-generated method stub
	return null;
    }

    public List<Voto> findAll(Sort sort) {
	if (sort == null)
	    return null;
	// TODO
	return null;
    }

    public List<Voto> findAll(Iterable<Long> ids) {
	if (ids == null)
	    return null;
	// TODO
	return null;
    }

    public <S extends Voto> List<S> save(Iterable<S> entities) {
	if (entities == null)
	    return null;

	// TODO
	return null;

    }

    public void flush() {
	// TODO Auto-generated method stub

    }

    public <S extends Voto> S saveAndFlush(S entity) {
	if (entity == null)
	    return null;
	// TODO
	return null;
    }

    public void deleteInBatch(Iterable<Voto> entities) {
	// TODO Auto-generated method stub

    }

    public void deleteAllInBatch() {
	// TODO Auto-generated method stub

    }

    public Voto getOne(Long id) {
	if (id == null)
	    return null;
	// TODO Auto-generated method stub
	return null;
    }

    public Page<Voto> findAll(Pageable pageable) {
	if (pageable == null)
	    return null;
	return null;
    }

    public <S extends Voto> S save(S entity) {
	if (entity == null)
	    return null;
	return null;
    }

    public Voto findOne(Long id) {
	if(id == null)
	    return null;
	return null;
    }

    public boolean exists(Long id) {
	if(id == null)
	    return null;
	return false;
    }

    public long count() {
	// TODO Auto-generated method stub
	return 0;
    }

    public void delete(Long id) {
	// TODO Auto-generated method stub

    }

    public void delete(Voto entity) {
	// TODO Auto-generated method stub

    }

    public void delete(Iterable<? extends Voto> entities) {
	// TODO Auto-generated method stub

    }

    public void deleteAll() {
	// TODO Auto-generated method stub

    }

    public List<Voto> findByIdEleccion(Long idEleccion) {
	if(idEleccion == null)
	    return null;
	return null;
    }

}
