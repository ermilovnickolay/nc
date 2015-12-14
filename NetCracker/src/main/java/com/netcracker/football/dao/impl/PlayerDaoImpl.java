package com.netcracker.football.dao.impl;

import java.util.List;

import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.netcracker.football.dao.PlayerDao;
import com.netcracker.football.entity.Player;

@Repository("playerDao")
public class PlayerDaoImpl extends AbstractDaoImpl<String, Player> implements
		PlayerDao {

	@SuppressWarnings("unchecked")
	public List<Player> getPlayers() {
		Query query = createQuery("from Player t");
		return query.getResultList();
	}

	@SuppressWarnings("unchecked")
	public List<Player> get30Players() {
		Query query = createQuery("from Player t order by t.overall desc")
				.setMaxResults(30);
		return query.getResultList();
	}

}
