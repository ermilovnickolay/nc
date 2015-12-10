package com.netcracker.football.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.netcracker.football.entity.Player;
import com.netcracker.football.entity.Team;

public interface PlayerService {

	public void addPlayer(Player player);

	public List<Player> getPlayers();

	public List<Player> get30Players();
	
	public List<Player> getPlayerByTeam(String team);
	
	public Player getPlayerById(String id);


}
