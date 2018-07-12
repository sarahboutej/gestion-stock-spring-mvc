package com.gestion.stock.services.imp;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.gestion.stock.dao.IClientDao;
import com.gestion.stock.entities.Client;
import com.gestion.stock.services.IClientService;

@Transactional
public class ClientServiceImpl implements IClientService{

	private IClientDao clientDao;
	
	
	public void setClientDao(IClientDao clientDao) {
		this.clientDao = clientDao;
	}

	@Override
	public Client save(Client entity) {
		
		return clientDao.save(entity);
	}

	@Override
	public Client update(Client entity) {
		
		return clientDao.update(entity);
	}

	@Override
	public List<Client> selectAll() {
		
		return clientDao.selectAll();
	}

	@Override
	public List<Client> selectAll(String sortField, String sort) {
		
		return clientDao.selectAll(sortField, sort);
	}

	@Override
	public void remove(Long id) {
		clientDao.remove(id);
		
	}

	@Override
	public Client getById(Long id) {
		
		return clientDao.getById(id);
	}

	@Override
	public Client findOne(String paramName, Object paramValue) {
		
		return clientDao.findOne(paramName, paramValue);
	}

	@Override
	public Client findOne(String[] paramNames, Object[] paramValues) {
		
		return clientDao.findOne(paramNames, paramValues);
	}

	@Override
	public int findCountBy(String paramName, String paramValue) {
		
		return clientDao.findCountBy(paramName, paramValue);
	}

}
