package com.netcracker.football.dao;

import java.util.List;

import javax.persistence.Query;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.netcracker.football.entity.Team;

@Repository("teamDao")
public class TeamDaoImpl extends AbstractDaoImpl<String, Team> implements
		TeamDao {

	@Override
	public void addTeam(Team team) {
		create(team);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Team> getTeams() {
		Query query = createQuery("from Team t");
		return query.getResultList();
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Team> get30Teams() {
		Query query = createQuery("from Team t order by t.rating desc")
				.setMaxResults(30);
		return query.getResultList();
	}

	@Override
	public Team getTeamById(String id) {
		TypedQuery<Team> query = createTypedQuery("from Team t where t.id=?1");
		query.setParameter(1, id);
		return query.getSingleResult();
	}

	@Override
	public Team getTeamByName(String name) {
		TypedQuery<Team> query = createTypedQuery("from Team t where t.name=?1");
		query.setParameter(1, name);
		return query.getSingleResult();
	}
}
