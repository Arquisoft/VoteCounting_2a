package es.uniovi.asw.repository.impl;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import es.uniovi.asw.model.Recuento;
import es.uniovi.asw.repository.RecuentoRepository;

public class RecuentoRepositoryImpl implements RecuentoRepository {

    public List<Recuento> findAll() {
	// TODO Auto-generated method stub
	return null;
    }

    public List<Recuento> findAll(Sort sort) {
	// TODO Auto-generated method stub
	return null;
    }

    public List<Recuento> findAll(Iterable<Long> ids) {
	// TODO Auto-generated method stub
	return null;
    }

    public <S extends Recuento> List<S> save(Iterable<S> entities) {
	// TODO Auto-generated method stub
	return null;
    }

    public void flush() {
	// TODO Auto-generated method stub
	
    }

    public <S extends Recuento> S saveAndFlush(S entity) {
	// TODO Auto-generated method stub
	return null;
    }

    public void deleteInBatch(Iterable<Recuento> entities) {
	// TODO Auto-generated method stub
	
    }

    public void deleteAllInBatch() {
	// TODO Auto-generated method stub
	
    }

    public Recuento getOne(Long id) {
	// TODO Auto-generated method stub
	return null;
    }

    public Page<Recuento> findAll(Pageable pageable) {
	// TODO Auto-generated method stub
	return null;
    }

    public <S extends Recuento> S save(S entity) {
	// TODO Auto-generated method stub
	return null;
    }

    public Recuento findOne(Long id) {
	// TODO Auto-generated method stub
	return null;
    }

    public boolean exists(Long id) {
	// TODO Auto-generated method stub
	return false;
    }

    public long count() {
	// TODO Auto-generated method stub
	return 0;
    }

    public void delete(Long id) {
	// TODO Auto-generated method stub
	
    }

    public void delete(Recuento entity) {
	// TODO Auto-generated method stub
	
    }

    public void delete(Iterable<? extends Recuento> entities) {
	// TODO Auto-generated method stub
	
    }

    public void deleteAll() {
	// TODO Auto-generated method stub
	
    }

    public List<Recuento> findByIdEleccion(Long idEleccion) {
	// TODO Auto-generated method stub
	return null;
    }

	

}