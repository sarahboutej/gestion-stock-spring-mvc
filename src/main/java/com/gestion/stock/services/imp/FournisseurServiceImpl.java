package com.gestion.stock.services.imp;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.gestion.stock.dao.IFournisseurDao;
import com.gestion.stock.entities.Fournisseur;
import com.gestion.stock.services.IFournisseurService;

@Transactional
public class FournisseurServiceImpl implements IFournisseurService{

	
	private IFournisseurDao fournisseurDao;
	
	
	public void setFournisseurDao(IFournisseurDao fournisseurDao) {
		this.fournisseurDao = fournisseurDao;
	}

	@Override
	public Fournisseur save(Fournisseur entity) {
		
		return fournisseurDao.save(entity);
	}

	@Override
	public Fournisseur update(Fournisseur entity) {
		
		return fournisseurDao.update(entity);
	}

	@Override
	public List<Fournisseur> selectAll() {
		
		return fournisseurDao.selectAll();
	}

	@Override
	public List<Fournisseur> selectAll(String sortField, String sort) {
		
		return fournisseurDao.selectAll(sortField, sort);
	}

	@Override
	public void remove(Long id) {
		fournisseurDao.remove(id);
		
	}

	@Override
	public Fournisseur getById(Long id) {
		
		return fournisseurDao.getById(id);
	}

	@Override
	public Fournisseur findOne(String paramName, Object paramValue) {
		
		return fournisseurDao.findOne(paramName, paramValue);
	}

	@Override
	public Fournisseur findOne(String[] paramNames, Object[] paramValues) {
		
		return fournisseurDao.findOne(paramNames, paramValues);
	}

	@Override
	public int findCountBy(String paramName, String paramValue) {
		
		return fournisseurDao.findCountBy(paramName, paramValue);
	}

}
