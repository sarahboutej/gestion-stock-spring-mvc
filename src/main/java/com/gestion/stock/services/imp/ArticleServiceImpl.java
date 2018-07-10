package com.gestion.stock.services.imp;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.gestion.stock.dao.IArticleDao;
import com.gestion.stock.dao.impl.ArticleDaoImpl;
import com.gestion.stock.entities.Article;
import com.gestion.stock.services.IArticleService;
//L'annotation transactionnel pour dire que la classe contient des méthode de transaction avec la base de données
@Transactional
public class ArticleServiceImpl implements IArticleService{

	private IArticleDao articleDao;
	
	
	public void setArticleDao(IArticleDao articleDao) {
		this.articleDao = articleDao;
	}

	@Override
	public Article save(Article entity) {
		
		return articleDao.save(entity);
	}

	@Override
	public Article update(Article entity) {
		
		return articleDao.update(entity);
	}

	@Override
	public List<Article> selectAll() {
		
		return articleDao.selectAll();
	}

	@Override
	public List<Article> selectAll(String sortField, String sort) {
		
		return articleDao.selectAll(sortField, sort);
	}

	@Override
	public void remove(Long id) {
		articleDao.remove(id);
		
	}

	@Override
	public Article getById(Long id) {
		
		return articleDao.getById(id);
	}

	@Override
	public Article findOne(String paramName, Object paramValue) {
		
		return articleDao.findOne(paramName, paramValue);
	}

	@Override
	public Article findOne(String[] paramNames, Object[] paramValues) {
		
		return articleDao.findOne(paramNames, paramValues);
	}

	@Override
	public int findCountBy(String paramName, String paramValue) {
		return articleDao.findCountBy(paramName, paramValue);
	}

}
