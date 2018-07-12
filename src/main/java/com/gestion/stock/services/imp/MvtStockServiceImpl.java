package com.gestion.stock.services.imp;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.gestion.stock.dao.IMvtStockDao;
import com.gestion.stock.entities.MvtStock;
import com.gestion.stock.services.IMvtStockService;

@Transactional
public class MvtStockServiceImpl implements IMvtStockService{

	private IMvtStockDao mvtStockDao;
	
	
	public void setMvtStockDao(IMvtStockDao mvtStockDao) {
		this.mvtStockDao = mvtStockDao;
	}

	@Override
	public MvtStock save(MvtStock entity) {
		
		return mvtStockDao.save(entity);
	}

	@Override
	public MvtStock update(MvtStock entity) {
		
		return mvtStockDao.update(entity);
	}

	@Override
	public List<MvtStock> selectAll() {
		
		return mvtStockDao.selectAll();
	}

	@Override
	public List<MvtStock> selectAll(String sortField, String sort) {
		
		return mvtStockDao.selectAll(sortField, sort);
	}

	@Override
	public void remove(Long id) {
		
		mvtStockDao.remove(id);
	}

	@Override
	public MvtStock getById(Long id) {
		
		return mvtStockDao.getById(id);
	}

	@Override
	public MvtStock findOne(String paramName, Object paramValue) {
		
		return mvtStockDao.findOne(paramName, paramValue);
	}

	@Override
	public MvtStock findOne(String[] paramNames, Object[] paramValues) {
		
		return mvtStockDao.findOne(paramNames, paramValues);
	}

	@Override
	public int findCountBy(String paramName, String paramValue) {
		
		return mvtStockDao.findCountBy(paramName, paramValue);
	}

}
