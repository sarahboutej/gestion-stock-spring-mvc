package com.gestion.stock.services.imp;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.gestion.stock.dao.ICommandeClientDao;
import com.gestion.stock.entities.CommandeClient;
import com.gestion.stock.services.ICommandeClientService;

@Transactional
public class CommandeClientServiceImpl implements ICommandeClientService {

	private ICommandeClientDao cmdClientDao;

	public void setCmdClientDao(ICommandeClientDao cmdClientDao) {
		this.cmdClientDao = cmdClientDao;
	}

	@Override
	public CommandeClient save(CommandeClient entity) {
		
		return cmdClientDao.save(entity);
	}

	@Override
	public CommandeClient update(CommandeClient entity) {
		
		return cmdClientDao.update(entity);
	}

	@Override
	public List<CommandeClient> selectAll() {
		
		return cmdClientDao.selectAll();
	}

	@Override
	public List<CommandeClient> selectAll(String sortField, String sort) {
		
		return cmdClientDao.selectAll(sortField, sort);
	}

	@Override
	public void remove(Long id) {
		cmdClientDao.remove(id);

	}

	@Override
	public CommandeClient getById(Long id) {
		
		return cmdClientDao.getById(id);
	}

	@Override
	public CommandeClient findOne(String paramName, Object paramValue) {
		
		return cmdClientDao.findOne(paramName, paramValue);
	}

	@Override
	public CommandeClient findOne(String[] paramNames, Object[] paramValues) {
		
		return cmdClientDao.findOne(paramNames, paramValues);
	}

	@Override
	public int findCountBy(String paramName, String paramValue) {
		
		return cmdClientDao.findCountBy(paramName, paramValue);
	}

}
