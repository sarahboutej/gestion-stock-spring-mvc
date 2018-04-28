package com.gestion.stock.dao;

import java.util.List;

public interface IGenericDao<E> {

	public E save(E entity);

	public E update(E entity);

	public List<E> selectAll();

	public List<E> selectAll(String sortField, String field);

	public E getById(Long id);
	
	public void remove(Long id);
	
	public E findOne(String paramName , Object paramValue);
	
	public E findOne(String[] paramName , Object[] paramValue);
	
	public int findCountBy(String paramName, String paramValue);
	
	

}
