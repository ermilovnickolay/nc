package com.netcracker.football.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.netcracker.football.dao.PlayerDao;
import com.netcracker.football.entity.Player;
import com.netcracker.football.service.PlayerService;

@Service("playerService")
public class PlayerServiceImpl implements PlayerService {

	@Autowired
	private PlayerDao playerDao;

	public void addPlayer(Player player) {
		playerDao.create(player);
	}

	public List<Player> getPlayers() {
		return playerDao.getPlayers();
	}

	public List<Player> get30Players() {
		return playerDao.get30Players();
	}

	public Player getPlayerById(String id) {
		return playerDao.getById(id);
	}

	public void updatePlayer(Player player) {
		playerDao.update(player);

	}

	public void deletePlayer(Player player) {
		playerDao.delete(player);

	}
}
