package com.netcracker.football.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.netcracker.football.dao.TeamDao;
import com.netcracker.football.entity.Team;

@Service("teamService")
public class TeamServiceImpl implements TeamService {

	@Autowired
	private TeamDao teamDao;
	
	@Override
	public void addTeam(Team team) {
		teamDao.addTeam(team);
	}

	@Override
	public List<Team> getTeams() {	
		return teamDao.getTeams();
	}
	
	public List<Team> get30Teams(){
		return teamDao.get30Teams();
	}

	@Override
	public Team getTeamById(String id) {
		return teamDao.getTeamById(id);
	}

	@Override
	public Team getTeamByName(String name) {
		return teamDao.getTeamByName(name);
	}
	
}
