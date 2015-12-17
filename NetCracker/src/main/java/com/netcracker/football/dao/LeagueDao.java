package com.netcracker.football.dao;

import java.util.List;

import com.netcracker.football.entity.League;

public interface LeagueDao extends AbstractDao<String, League> {

	List<League> getLeagues();

}
