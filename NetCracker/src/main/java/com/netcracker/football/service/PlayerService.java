package com.netcracker.football.service;

import java.util.List;

import com.netcracker.football.entity.Player;

public interface PlayerService {

	public void addPlayer(Player player);

	public void updatePlayer(Player player);

	public void deletePlayer(Player player);

	public List<Player> getPlayers();

	public List<Player> get30Players();

	public Player getPlayerById(String id);

}
