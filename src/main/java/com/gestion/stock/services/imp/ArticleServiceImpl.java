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

	IArticleDao articleDao=new ArticleDaoImpl();
	
	
	public void setArticleDao(IArticleDao articleDao) {
		this.articleDao = articleDao;
	}

	@Override
	public Article save(Article entity) {
		// TODO Auto-generated method stub
		return articleDao.save(entity);
	}

	@Override
	public Article update(Article entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Article> selectAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Article> selectAll(String sortField, String sort) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void remove(Long id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Article getById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Article findOne(String paramName, Object paramValue) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Article findOne(String[] paramNames, Object[] paramValues) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int findCountBy(String paramName, String paramValue) {
		// TODO Auto-generated method stub
		return 0;
	}

}
