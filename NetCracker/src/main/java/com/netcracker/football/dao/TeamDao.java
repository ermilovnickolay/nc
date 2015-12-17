package com.netcracker.football.dao;

import java.util.List;

import com.netcracker.football.entity.Team;

public interface TeamDao extends AbstractDao<String, Team> {

	List<Team> getTeams();

	List<Team> get30Teams();

}
