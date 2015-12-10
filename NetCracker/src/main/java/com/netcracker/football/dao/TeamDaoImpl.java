package com.netcracker.football.dao;

import java.util.List;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;

import javax.persistence.TypedQuery;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.netcracker.football.entity.Team;

@Repository("teamDao")
public class TeamDaoImpl implements TeamDao {

	@Autowired
	private EntityManagerFactory entityManagerFactory;

	@Override
	public void addTeam(Team team) {
		entityManagerFactory.createEntityManager().persist(team);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Team> getTeams() {
		Query query = entityManagerFactory.createEntityManager().createQuery(
				"from Team t");
		return query.getResultList();
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Team> get30Teams() {
		Query query = entityManagerFactory.createEntityManager()
				.createQuery("from Team t order by t.rating desc")
				.setMaxResults(30);
		return query.getResultList();
	}

	@Override
	public Team getTeamById(String id) {
		TypedQuery<Team> query = entityManagerFactory.createEntityManager()
				.createQuery("from Team t where t.id=?1", Team.class);
		query.setParameter(1, id);
		return query.getSingleResult();
	}

	@Override
	public Team getTeamByName(String name) {
		TypedQuery<Team> query = entityManagerFactory.createEntityManager()
				.createQuery("from Team t where t.name=?1", Team.class);
		query.setParameter(1, name);
		return query.getSingleResult();
	}
}
