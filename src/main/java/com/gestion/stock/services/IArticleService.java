package com.gestion.stock.services;

import java.util.List;

import com.gestion.stock.entities.Article;

public interface IArticleService {

	public Article save(Article entity);

	public Article update(Article entity);

	public List<Article> selectAll();

	public List<Article> selectAll(String sortField, String sort);

	public void remove(Long id);

	public Article getById(Long id);

	public Article findOne(String paramName, Object paramValue);

	public Article findOne(String[] paramNames, Object[] paramValues);

	public int findCountBy(String paramName, String paramValue);

}
