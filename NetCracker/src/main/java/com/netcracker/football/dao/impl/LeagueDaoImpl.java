package com.netcracker.football.dao.impl;

import java.util.List;

import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.netcracker.football.dao.LeagueDao;
import com.netcracker.football.entity.League;

@Repository("leagueDao")
public class LeagueDaoImpl extends AbstractDaoImpl<String, League> implements
		LeagueDao {

	@SuppressWarnings("unchecked")
	public List<League> getLeagues() {
		Query query = createQuery("from League t");
		return query.getResultList();
	}

}
