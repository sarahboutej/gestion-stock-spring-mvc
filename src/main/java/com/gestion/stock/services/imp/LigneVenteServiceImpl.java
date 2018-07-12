package com.gestion.stock.services.imp;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.gestion.stock.dao.ILigneVenteDao;
import com.gestion.stock.entities.LigneVente;
import com.gestion.stock.services.ILigneVenteService;

@Transactional
public class LigneVenteServiceImpl implements ILigneVenteService{

	private ILigneVenteDao ligneVenteDao;
	
	
	public void setLigneVenteDao(ILigneVenteDao ligneVenteDao) {
		this.ligneVenteDao = ligneVenteDao;
	}

	@Override
	public LigneVente save(LigneVente entity) {
		
		return ligneVenteDao.save(entity);
	}

	@Override
	public LigneVente update(LigneVente entity) {
		
		return ligneVenteDao.update(entity);
	}

	@Override
	public List<LigneVente> selectAll() {
		return ligneVenteDao.selectAll();
	}

	@Override
	public List<LigneVente> selectAll(String sortField, String sort) {
		
		return ligneVenteDao.selectAll(sortField, sort);
	}

	@Override
	public void remove(Long id) {
		
		ligneVenteDao.remove(id);
	}

	@Override
	public LigneVente getById(Long id) {
		return ligneVenteDao.getById(id);
	}

	@Override
	public LigneVente findOne(String paramName, Object paramValue) {
		
		return ligneVenteDao.findOne(paramName, paramValue);
	}

	@Override
	public LigneVente findOne(String[] paramNames, Object[] paramValues) {
		
		return ligneVenteDao.findOne(paramNames, paramValues);
	}

	@Override
	public int findCountBy(String paramName, String paramValue) {
		
		return ligneVenteDao.findCountBy(paramName, paramValue);
	}

}
