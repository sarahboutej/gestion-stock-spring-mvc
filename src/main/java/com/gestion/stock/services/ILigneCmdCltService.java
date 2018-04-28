package com.gestion.stock.services;

import java.util.List;

import com.gestion.stock.entities.LigneCmdClt;

public interface ILigneCmdCltService {
	
	public LigneCmdClt save(LigneCmdClt entity);

	public LigneCmdClt update(LigneCmdClt entity);

	public List<LigneCmdClt> selectAll();

	public List<LigneCmdClt> selectAll(String sortField, String sort);

	public void remove(Long id);

	public LigneCmdClt getById(Long id);

	public LigneCmdClt findOne(String paramName, Object paramValue);

	public LigneCmdClt findOne(String[] paramNames, Object[] paramValues);

	public int findCountBy(String paramName, String paramValue);

}
