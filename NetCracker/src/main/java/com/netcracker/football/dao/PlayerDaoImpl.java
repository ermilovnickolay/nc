package com.netcracker.football.dao;

import java.util.List;

import javax.persistence.Query;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.netcracker.football.entity.Player;

@Repository("playerDao")
public class PlayerDaoImpl extends AbstractDaoImpl<String, Player> implements
		PlayerDao {

	public void addPlayer(Player player) {
		create(player);
	}

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

	public List<Player> getPlayerByTeam(String team) {
		TypedQuery<Player> query = createTypedQuery("from Player t where t.team=?1");
		query.setParameter(1, team);
		return query.getResultList();
	}

	public Player getPlayerById(String id) {
		TypedQuery<Player> query = createTypedQuery("from Player t where t.id=?1");
		query.setParameter(1, id);
		return query.getSingleResult();
	}
}
