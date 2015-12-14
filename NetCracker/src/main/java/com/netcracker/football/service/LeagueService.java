package com.netcracker.football.service;

import java.util.List;

import com.netcracker.football.entity.League;

public interface LeagueService {

	public void addLeague(League league);

	public void updateLeague(League league);

	public void deleteLeague(League league);

	public List<League> getLeagues();

	public League getLeagueById(String id);

}
