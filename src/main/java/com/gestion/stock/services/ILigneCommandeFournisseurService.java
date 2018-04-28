package com.gestion.stock.services;

import java.util.List;

import com.gestion.stock.entities.LigneCommandeFournisseur;

public interface ILigneCommandeFournisseurService {

	public LigneCommandeFournisseur save(LigneCommandeFournisseur entity);

	public LigneCommandeFournisseur update(LigneCommandeFournisseur entity);

	public List<LigneCommandeFournisseur> selectAll();

	public List<LigneCommandeFournisseur> selectAll(String sortField, String sort);

	public void remove(Long id);

	public LigneCommandeFournisseur getById(Long id);

	public LigneCommandeFournisseur findOne(String paramName, Object paramValue);

	public LigneCommandeFournisseur findOne(String[] paramNames, Object[] paramValues);

	public int findCountBy(String paramName, String paramValue);
}
