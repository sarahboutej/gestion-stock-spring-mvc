package com.gestion.stock.services.imp;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.gestion.stock.dao.ICommandeFournisseurDao;
import com.gestion.stock.entities.CommandeClient;
import com.gestion.stock.entities.CommandeFournisseur;
import com.gestion.stock.services.ICommandeClientService;
import com.gestion.stock.services.ICommandeFournisseurService;
@Transactional
public class CommandeFournisseurServiceImpl implements ICommandeFournisseurService{

	private ICommandeFournisseurDao cmdFournisseurDao;
	
	
	public void setCmdFournisseurDao(ICommandeFournisseurDao cmdFournisseurDao) {
		this.cmdFournisseurDao = cmdFournisseurDao;
	}


	@Override
	public CommandeFournisseur save(CommandeFournisseur entity) {
		
		return cmdFournisseurDao.save(entity);
	}


	@Override
	public CommandeFournisseur update(CommandeFournisseur entity) {
		
		return cmdFournisseurDao.update(entity);
	}


	@Override
	public List<CommandeFournisseur> selectAll() {
		
		return cmdFournisseurDao.selectAll();
	}


	@Override
	public List<CommandeFournisseur> selectAll(String sortField, String sort) {
		
		return cmdFournisseurDao.selectAll(sortField, sort);
	}


	@Override
	public void remove(Long id) {
		cmdFournisseurDao.remove(id);
		
	}


	@Override
	public CommandeFournisseur getById(Long id) {
		
		return cmdFournisseurDao.getById(id);
	}


	@Override
	public CommandeFournisseur findOne(String paramName, Object paramValue) {
		
		return cmdFournisseurDao.findOne(paramName, paramValue);
	}


	@Override
	public CommandeFournisseur findOne(String[] paramNames, Object[] paramValues) {
		
		return cmdFournisseurDao.findOne(paramNames, paramValues);
	}


	@Override
	public int findCountBy(String paramName, String paramValue) {
		
		return cmdFournisseurDao.findCountBy(paramName, paramValue);
	}

	
}
