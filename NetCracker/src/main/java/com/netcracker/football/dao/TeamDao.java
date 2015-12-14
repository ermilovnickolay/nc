package com.netcracker.football.dao;

import java.util.List;

import com.netcracker.football.entity.Team;

public interface TeamDao extends AbstractDao<String, Team> {

	void create(Team team);

	void update(Team team);

	void delete(Team team);

	Team getById(String id);

	List<Team> getTeams();

	List<Team> get30Teams();

}
