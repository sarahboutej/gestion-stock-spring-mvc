package com.gestion.stock.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import com.gestion.stock.dao.IGenericDao;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

@SuppressWarnings("unchecked")
public class GenericDaoImpl<E> implements IGenericDao<E>
{
   
	@PersistenceContext
	EntityManager em;
	
	private Class<E> type;
	
	
	public GenericDaoImpl() {
		
		Type t =getClass().getGenericSuperclass();
		ParameterizedType pt=(ParameterizedType)t;
		type=(Class<E>) pt.getActualTypeArguments()[0];
	}

	@Override
	public E save(E entity) {
		em.persist(entity);
		return entity;
	}

	@Override
	public E update(E entity) {
		em.merge(entity);
		return entity;
	}

	@Override
	public List<E> selectAll() {
		Query query=em.createQuery("select t from " + type.getSimpleName() + "t");
		return query.getResultList();
		}

	@Override
	public List<E> selectAll(String sortField, String field) {
		Query query=em.createQuery("select t from " + type.getSimpleName() + "t order by" + sortField + "" + field);
		return query.getResultList();
	}

	@Override
	public E getById(Long id) {
		return em.find(type, id);
	}

	@Override
	public void remove(Long id) {
		E tab=em.getReference(type, id);
		em.remove(tab);
		
	}

	@Override
	public E findOne(String paramName, Object paramValue) {
		Query query=em.createQuery("select t from " + type.getSimpleName() + "t where " + paramName + " =:x ");
		query.setParameter(paramName, paramValue);
		return query.getResultList().size() > 0 ? (E) query.getResultList().get(0) : null;
		
		/*
		 if(query.getResultList().size() > 0)
		 {
		 return (E) query.getResultList().get(0);
		 }
		 else
		 return null;
		 * */
	}

	@Override
	public E findOne(String[] paramName, Object[] paramValue) {
		
		if(paramName.length != paramValue.length)
		{
			return null;
		}
		
		String requete="select t from" + type.getSimpleName() + "e where ";
		int longeur = paramName.length;
		
		for(int i=0; i<longeur; i++)
		{
			requete+="e." + paramName[i] + " =: x" + i;
			
			if(i+1< longeur) 
			{
				requete+= " and ";
			}
		}
		
		Query query=em.createQuery(requete);
		for(int i=0;i<longeur;i++)
		{
			query.setParameter("x"+i, paramValue[i]);
		}
		
		return query.getResultList().size() > 0 ? (E) query.getResultList().get(0) : null;
	}

	public Class<E> getType() {
		return type;
	}

	@Override
	public int findCountBy(String paramName, String paramValue) {
		Query query=em.createQuery("select t from " +type.getSimpleName() + " t where " + paramName + ":= x ");
		query.setParameter(paramName, paramValue);
		return query.getResultList().size() > 0 ? ((Long) query.getSingleResult()).intValue() : 0;
	}
	
	

	
}
