package com.gestion.stock.services.imp;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.gestion.stock.entities.Category;
import com.gestion.stock.services.ICategoryService;

@Transactional
public class CategoryServiceImpl implements ICategoryService{

	@Override
	public Category save(Category entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Category update(Category entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Category> selectAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Category> selectAll(String sortField, String sort) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void remove(Long id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Category getById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Category findOne(String paramName, Object paramValue) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Category findOne(String[] paramNames, Object[] paramValues) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int findCountBy(String paramName, String paramValue) {
		// TODO Auto-generated method stub
		return 0;
	}

}
