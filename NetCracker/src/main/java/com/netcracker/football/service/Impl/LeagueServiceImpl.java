package com.netcracker.football.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.netcracker.football.dao.LeagueDao;
import com.netcracker.football.entity.League;
import com.netcracker.football.service.LeagueService;

@Service("leagueService")
public class LeagueServiceImpl implements LeagueService {

	@Autowired
	private LeagueDao leagueDao;

	public void addLeague(League league) {
		leagueDao.create(league);
	}

	public List<League> getLeagues() {
		return leagueDao.getLeagues();
	}

	public League getLeagueById(String id) {
		return leagueDao.getById(id);
	}

	public void updateLeague(League league) {
		leagueDao.update(league);

	}

	public void deleteLeague(League league) {
		leagueDao.delete(league);

	}

}
