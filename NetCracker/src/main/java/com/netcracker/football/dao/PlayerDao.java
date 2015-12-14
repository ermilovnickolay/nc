package com.netcracker.football.dao;

import java.util.List;

import com.netcracker.football.entity.Player;

public interface PlayerDao extends AbstractDao<String, Player> {

	void create(Player player);

	void update(Player player);

	void delete(Player player);

	Player getById(String id);

	List<Player> getPlayers();

	List<Player> get30Players();

}
