package es.uniovi.asw.repository.impl;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import es.uniovi.asw.model.Recuento;
import es.uniovi.asw.repository.RecuentoRepository;

public class RecuentoRepositoryImpl implements RecuentoRepository {

	@Override
	public void deleteAllInBatch() {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteInBatch(Iterable<Recuento> arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<Recuento> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Recuento> findAll(Sort arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Recuento> findAll(Iterable<Long> arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void flush() {
		// TODO Auto-generated method stub

	}

	@Override
	public Recuento getOne(Long arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Recuento> List<S> save(Iterable<S> arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Recuento> S saveAndFlush(S arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Page<Recuento> findAll(Pageable arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public long count() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void delete(Long arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(Recuento arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(Iterable<? extends Recuento> arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean exists(Long arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Recuento findOne(Long arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Recuento> S save(S arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Recuento> findByIdEleccion(Long idEleccion) {
		// TODO Auto-generated method stub
		return null;
	}

}
