package com.netcracker.football.dao;

import java.util.List;

import com.netcracker.football.entity.Player;
import com.netcracker.football.entity.Team;

public interface PlayerDao {

	void addPlayer(Player player);

	List<Player> getPlayers();

	List<Player> get30Players();
	
	List<Player> getPlayerByTeam(String team);
	
	Player getPlayerById(String id);


}
