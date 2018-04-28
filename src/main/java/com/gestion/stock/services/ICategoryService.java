package com.gestion.stock.services;

import java.util.List;

import com.gestion.stock.entities.Category;

public interface ICategoryService {
	
	public Category save(Category entity);

	public Category update(Category entity);

	public List<Category> selectAll();

	public List<Category> selectAll(String sortField, String sort);

	public void remove(Long id);

	public Category getById(Long id);

	public Category findOne(String paramName, Object paramValue);

	public Category findOne(String[] paramNames, Object[] paramValues);

	public int findCountBy(String paramName, String paramValue);

}
