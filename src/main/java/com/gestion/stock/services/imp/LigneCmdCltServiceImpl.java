package com.gestion.stock.services.imp;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.gestion.stock.dao.ILigneCmdCltDao;
import com.gestion.stock.entities.LigneCmdClt;
import com.gestion.stock.services.ILigneCmdCltService;
@Transactional
public class LigneCmdCltServiceImpl implements ILigneCmdCltService{

	private ILigneCmdCltDao ligneCmdClientDao;
	
	public void setLigneCmdDao(ILigneCmdCltDao ligneCmdClientDao) {
		this.ligneCmdClientDao = ligneCmdClientDao;
	}

	@Override
	public LigneCmdClt save(LigneCmdClt entity) {
		
		return ligneCmdClientDao.save(entity);
	}

	@Override
	public LigneCmdClt update(LigneCmdClt entity) {
		
		return ligneCmdClientDao.update(entity);
	}

	@Override
	public List<LigneCmdClt> selectAll() {
		
		return ligneCmdClientDao.selectAll();
	}

	@Override
	public List<LigneCmdClt> selectAll(String sortField, String sort) {
		
		return ligneCmdClientDao.selectAll(sortField, sort);
	}

	@Override
	public void remove(Long id) {
		ligneCmdClientDao.remove(id);
		
	}

	@Override
	public LigneCmdClt getById(Long id) {
		
		return ligneCmdClientDao.getById(id);
	}

	@Override
	public LigneCmdClt findOne(String paramName, Object paramValue) {
		
		return ligneCmdClientDao.findOne(paramName, paramValue);
	}

	@Override
	public LigneCmdClt findOne(String[] paramNames, Object[] paramValues) {
		
		return ligneCmdClientDao.findOne(paramNames, paramValues);
	}

	@Override
	public int findCountBy(String paramName, String paramValue) {
		
		return ligneCmdClientDao.findCountBy(paramName, paramValue);
	}

}
