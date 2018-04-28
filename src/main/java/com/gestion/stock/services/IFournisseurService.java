package com.gestion.stock.services;

import java.util.List;

import com.gestion.stock.entities.Fournisseur;

public interface IFournisseurService {

	public Fournisseur save(Fournisseur entity);

	public Fournisseur update(Fournisseur entity);

	public List<Fournisseur> selectAll();

	public List<Fournisseur> selectAll(String sortField, String sort);

	public void remove(Long id);

	public Fournisseur getById(Long id);

	public Fournisseur findOne(String paramName, Object paramValue);

	public Fournisseur findOne(String[] paramNames, Object[] paramValues);

	public int findCountBy(String paramName, String paramValue);
	
}
