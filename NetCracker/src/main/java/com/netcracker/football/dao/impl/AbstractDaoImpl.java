package com.netcracker.football.dao.impl;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;

import org.springframework.beans.factory.annotation.Autowired;

import com.netcracker.football.dao.AbstractDao;

public abstract class AbstractDaoImpl<PK extends Serializable, T> implements
		AbstractDao<PK, T> {
	private final Class<T> persistentClass;

	@SuppressWarnings("unchecked")
	public AbstractDaoImpl() {
		this.persistentClass = (Class<T>) ((ParameterizedType) this.getClass()
				.getGenericSuperclass()).getActualTypeArguments()[1];
	}

	@Autowired
	private EntityManagerFactory entityManagerFactory;

	public EntityManager getEntityManager() {
		return entityManagerFactory.createEntityManager();
	}

	@SuppressWarnings("unchecked")
	public T getById(PK id) {
		return (T) getEntityManager().find(persistentClass, id);
	}

	public void create(T entity) {
		getEntityManager().persist(entity);
	}

	public void update(T entity) {
		getEntityManager().merge(entity);
	}

	public void delete(T entity) {
		getEntityManager().remove(entity);
	}

	public CriteriaBuilder getCriteria() {
		return getEntityManager().getCriteriaBuilder();
	}

	public Query createQuery(String hsql) {
		return getEntityManager().createQuery(hsql);
	}

	public TypedQuery<T> createTypedQuery(String hsql) {
		return getEntityManager().createQuery(hsql, persistentClass);
	}
}
