package com.netcracker.football.service;

import java.util.List;

import com.netcracker.football.entity.Team;

public interface TeamService {

	public void addTeam(Team team);

	public List<Team> getTeams();

	public List<Team> get30Teams();

	public Team getTeamById(String id);
	
	public Team getTeamByName(String name);
}
