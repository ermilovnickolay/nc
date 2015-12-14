package com.netcracker.football.dao;

import java.io.Serializable;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.criteria.CriteriaBuilder;

public interface AbstractDao<PK extends Serializable, T> {

	EntityManager getEntityManager();

	T getById(PK id);

	void create(T entity);

	void update(T entity);

	void delete(T entity);

	CriteriaBuilder getCriteria();

	Query createQuery(String hsql);

}