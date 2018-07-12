package com.gestion.stock.services.imp;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.gestion.stock.dao.ICategoryDao;
import com.gestion.stock.entities.Category;
import com.gestion.stock.services.ICategoryService;

@Transactional
public class CategoryServiceImpl implements ICategoryService{

	private ICategoryDao catDao;
	
	public void setCatDao(ICategoryDao catDao) {
		this.catDao = catDao;
	}

	@Override
	public Category save(Category entity) {
		
		return catDao.save(entity);
	}

	@Override
	public Category update(Category entity) {
		
		return catDao.update(entity);
	}

	@Override
	public List<Category> selectAll() {
		return catDao.selectAll();
	}

	@Override
	public List<Category> selectAll(String sortField, String sort) {
		
		return catDao.selectAll(sortField, sort);
	}

	@Override
	public void remove(Long id) {
		catDao.remove(id);
		
	}

	@Override
	public Category getById(Long id) {
		
		return catDao.getById(id);
	}

	@Override
	public Category findOne(String paramName, Object paramValue) {
		
		return catDao.findOne(paramName, paramValue);
	}

	@Override
	public Category findOne(String[] paramNames, Object[] paramValues) {
		
		return catDao.findOne(paramNames, paramValues);
	}

	@Override
	public int findCountBy(String paramName, String paramValue) {
		
		return catDao.findCountBy(paramName, paramValue);
	}

}
