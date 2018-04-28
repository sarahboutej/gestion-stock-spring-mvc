package com.gestion.stock.services;

import java.util.List;

import com.gestion.stock.entities.CommandeClient;

public interface ICommandeFournisseurService {

	
	public CommandeClient save(CommandeClient entity);

	public CommandeClient update(CommandeClient entity);

	public List<CommandeClient> selectAll();

	public List<CommandeClient> selectAll(String sortField, String sort);

	public void remove(Long id);

	public CommandeClient getById(Long id);

	public CommandeClient findOne(String paramName, Object paramValue);

	public CommandeClient findOne(String[] paramNames, Object[] paramValues);

	public int findCountBy(String paramName, String paramValue);
}
