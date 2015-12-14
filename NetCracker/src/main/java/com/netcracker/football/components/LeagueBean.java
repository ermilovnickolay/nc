package com.netcracker.football.components;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.RequestScoped;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.netcracker.football.entity.League;
import com.netcracker.football.entity.Team;
import com.netcracker.football.service.LeagueService;

@Component(value = "leagueBean")
@RequestScoped
public class LeagueBean {

	@Autowired
	private LeagueService leagueService;

	private List<League> leagues = new ArrayList<League>();

	private List<Team> teams = new ArrayList<Team>();

	League league = new League();

	public List<League> getLeagues() {
		return leagues;
	}

	public void setLeagues(List<League> leagues) {
		this.leagues = leagues;
	}

	public League getLeague() {
		return league;
	}

	public void setLeague(League league) {
		this.league = league;
	}

	public List<Team> getTeams() {
		return teams;
	}

	public void setTeams(List<Team> teams) {
		this.teams = teams;
	}

	public String viewLeague() {
		this.league = leagueService.getLeagueById(league.getId());
		teams = league.getClubs();
		return "viewLeague?faces-redirect=true";
	}

	@PostConstruct
	private void init() {
		leagues = leagueService.getLeagues();
	}

}
