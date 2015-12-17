package com.netcracker.football.dao;

import java.util.List;

import com.netcracker.football.entity.Player;

public interface PlayerDao extends AbstractDao<String, Player> {

	List<Player> getPlayers();

	List<Player> get30Players();

}
