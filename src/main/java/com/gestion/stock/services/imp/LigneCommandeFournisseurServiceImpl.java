package com.gestion.stock.services.imp;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.gestion.stock.dao.ILigneCmdFrnDao;
import com.gestion.stock.entities.LigneCommandeFournisseur;
import com.gestion.stock.services.ILigneCommandeFournisseurService;

@Transactional
public class LigneCommandeFournisseurServiceImpl implements ILigneCommandeFournisseurService{

	private ILigneCmdFrnDao ligneCmdFournisseurDao;
	
	
	public void setLigneCmdFournisseurDao(ILigneCmdFrnDao ligneCmdFournisseurDao) {
		this.ligneCmdFournisseurDao = ligneCmdFournisseurDao;
	}

	@Override
	public LigneCommandeFournisseur save(LigneCommandeFournisseur entity) {
		
		return ligneCmdFournisseurDao.save(entity);
	}

	@Override
	public LigneCommandeFournisseur update(LigneCommandeFournisseur entity) {
		
		return ligneCmdFournisseurDao.update(entity);
	}

	@Override
	public List<LigneCommandeFournisseur> selectAll() {
		
		return ligneCmdFournisseurDao.selectAll();
	}

	@Override
	public List<LigneCommandeFournisseur> selectAll(String sortField, String sort) {
		
		return ligneCmdFournisseurDao.selectAll(sortField, sort);
	}

	@Override
	public void remove(Long id) {
		ligneCmdFournisseurDao.remove(id);
		
	}

	@Override
	public LigneCommandeFournisseur getById(Long id) {
		
		return ligneCmdFournisseurDao.getById(id);
	}

	@Override
	public LigneCommandeFournisseur findOne(String paramName, Object paramValue) {
		
		return ligneCmdFournisseurDao.findOne(paramName, paramValue);
	}

	@Override
	public LigneCommandeFournisseur findOne(String[] paramNames, Object[] paramValues) {
		
		return ligneCmdFournisseurDao.findOne(paramNames, paramValues);
	}

	@Override
	public int findCountBy(String paramName, String paramValue) {
		
		return ligneCmdFournisseurDao.findCountBy(paramName, paramValue);
	}

}
