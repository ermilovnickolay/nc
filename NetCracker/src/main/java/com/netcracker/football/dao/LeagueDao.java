package com.netcracker.football.dao;

import java.util.List;

import com.netcracker.football.entity.League;

public interface LeagueDao extends AbstractDao<String, League> {

	void create(League league);

	void update(League league);

	void delete(League league);

	League getById(String id);

	List<League> getLeagues();

}
