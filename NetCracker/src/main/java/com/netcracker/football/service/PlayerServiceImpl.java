package com.netcracker.football.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.netcracker.football.dao.PlayerDao;
import com.netcracker.football.entity.Player;
import com.netcracker.football.entity.Team;

@Service("playerService")
public class PlayerServiceImpl implements PlayerService{

	@Autowired
	private PlayerDao playerDao;
	
	public void addPlayer(Player player) {
		playerDao.addPlayer(player);
	}

	public List<Player> getPlayers() {	
		return playerDao.getPlayers();
	}
	
	public List<Player> get30Players(){
		return playerDao.get30Players();
	}

	public List<Player> getPlayerByTeam(String team) {
		return playerDao.getPlayerByTeam(team);
	}
	
	public Player getPlayerById(String id) {
		return playerDao.getPlayerById(id);
	}
}
