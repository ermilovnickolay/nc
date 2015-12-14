package com.netcracker.football.dao.impl;

import java.util.List;

import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.netcracker.football.dao.TeamDao;
import com.netcracker.football.entity.Team;

@Repository("teamDao")
public class TeamDaoImpl extends AbstractDaoImpl<String, Team> implements
		TeamDao {

	@SuppressWarnings("unchecked")
	public List<Team> getTeams() {
		Query query = createQuery("from Team t");
		return query.getResultList();
	}

	@SuppressWarnings("unchecked")
	public List<Team> get30Teams() {
		Query query = createQuery("from Team t order by t.rating desc")
				.setMaxResults(30);
		return query.getResultList();
	}

}
