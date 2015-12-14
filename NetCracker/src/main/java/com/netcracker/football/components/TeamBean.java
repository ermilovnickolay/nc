package com.netcracker.football.components;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.RequestScoped;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.netcracker.football.entity.Player;
import com.netcracker.football.entity.Team;
import com.netcracker.football.service.PlayerService;
import com.netcracker.football.service.TeamService;

@Component(value = "teamBean")
@RequestScoped
public class TeamBean {

	@Autowired
	private TeamService teamService;

	@Autowired
	private PlayerService playerService;

	private List<Team> teams = new ArrayList<Team>();

	private List<Player> players = new ArrayList<Player>();

	Team team = new Team();

	public Team getTeam() {
		return team;
	}

	public void setTeam(Team team) {
		this.team = team;
	}

	public List<Team> getTeams() {
		return teams;
	}

	public void setTeams(List<Team> teams) {
		this.teams = teams;
	}

	public List<Player> getPlayers() {
		return players;
	}

	public void setPlayers(List<Player> players) {
		this.players = players;
	}

	public String viewTeam() {
		this.team = teamService.getTeamById(team.getId());
		players = team.getPlayers();
		return "viewTeam?faces-redirect=true";
	}

	@PostConstruct
	private void init() {
		teams = teamService.get30Teams();
	}

}
