package com.netcracker.football.dao;

import java.util.List;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.netcracker.football.entity.Player;
import com.netcracker.football.entity.Team;

@Repository("playerDao")
public class PlayerDaoImpl implements PlayerDao {
	
	@Autowired
	private EntityManagerFactory entityManagerFactory;

	public void addPlayer(Player player) {
		entityManagerFactory.createEntityManager().persist(player);
	}

	@SuppressWarnings("unchecked")
	public List<Player> getPlayers() {
		Query query =entityManagerFactory.createEntityManager().createQuery("from Player t");
		return query.getResultList();
	}	
	
	@SuppressWarnings("unchecked")
	public List<Player> get30Players() {
		Query query =entityManagerFactory.createEntityManager().createQuery("from Player t order by t.overall desc").setMaxResults(30);
		return query.getResultList();
	}

	public List<Player> getPlayerByTeam(String team) {
		TypedQuery <Player> query = entityManagerFactory.createEntityManager().createQuery("from Player t where t.team=?1",Player.class);
		query.setParameter(1, team);
		return query.getResultList();
	}	
	
	public Player getPlayerById(String id) {
		TypedQuery <Player> query = entityManagerFactory.createEntityManager().createQuery("from Player t where t.id=?1",Player.class);
		query.setParameter(1, id);
		return query.getSingleResult();
	}	
}
