package com.gestion.stock.services.imp;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.gestion.stock.dao.IVenteDao;
import com.gestion.stock.entities.Vente;
import com.gestion.stock.services.IVenteService;

@Transactional
public class VenteServiceImpl implements IVenteService {

	private IVenteDao venteDao;

	public void setVenteDao(IVenteDao venteDao) {
		this.venteDao = venteDao;
	}

	@Override
	public Vente save(Vente entity) {
		
		return venteDao.save(entity);
	}

	@Override
	public Vente update(Vente entity) {
		
		return venteDao.update(entity);
	}

	@Override
	public List<Vente> selectAll() {
		return venteDao.selectAll();
	}

	@Override
	public List<Vente> selectAll(String sortField, String sort) {
		
		return venteDao.selectAll();
	}

	@Override
	public void remove(Long id) {
		
		venteDao.remove(id);
	}

	@Override
	public Vente getById(Long id) {
	
		return venteDao.getById(id);
	}

	@Override
	public Vente findOne(String paramName, Object paramValue) {
		
		return venteDao.findOne(paramName, paramValue);
	}

	@Override
	public Vente findOne(String[] paramNames, Object[] paramValues) {
		
		return venteDao.findOne(paramNames, paramValues);
	}

	@Override
	public int findCountBy(String paramName, String paramValue) {
		
		return venteDao.findCountBy(paramName, paramValue);
	}

}
