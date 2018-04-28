package com.gestion.stock.services;

import java.util.List;

import com.gestion.stock.entities.MvtStock;

public interface IMvtStockService {
	
	public MvtStock save(MvtStock entity);

	public MvtStock update(MvtStock entity);

	public List<MvtStock> selectAll();

	public List<MvtStock> selectAll(String sortField, String sort);

	public void remove(Long id);

	public MvtStock getById(Long id);

	public MvtStock findOne(String paramName, Object paramValue);

	public MvtStock findOne(String[] paramNames, Object[] paramValues);

	public int findCountBy(String paramName, String paramValue);

}
