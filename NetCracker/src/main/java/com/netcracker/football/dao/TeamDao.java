package com.netcracker.football.dao;

import java.util.List;


import com.netcracker.football.entity.Team;


public interface TeamDao {
	
	void addTeam(Team team);
    
	List<Team> getTeams();
    
	List<Team> get30Teams();
	
	Team getTeamById(String id);
	
	Team getTeamByName(String name);

}
