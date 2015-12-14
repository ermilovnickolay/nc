package com.netcracker.football.components;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.RequestScoped;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.netcracker.football.entity.Player;
import com.netcracker.football.entity.PlayerAttributes;
import com.netcracker.football.service.PlayerService;

@Component(value = "playerBean")
@RequestScoped
public class PlayerBean {

	@Autowired
	private PlayerService playerService;

	List<Player> players = new ArrayList<Player>();
	PlayerAttributes attributes = new PlayerAttributes();

	Player player = new Player();

	public List<Player> getPlayers() {
		return players;
	}

	public void setPlayers(List<Player> players) {
		this.players = players;
	}

	public Player getPlayer() {
		return player;
	}

	public void setPlayer(Player player) {
		this.player = player;
	}

	public PlayerAttributes getAttributes() {
		return attributes;
	}

	public void setAttributes(PlayerAttributes attributes) {
		this.attributes = attributes;
	}

	public String viewPlayer() {
		this.player = playerService.getPlayerById(player.getId());
		attributes = player.getPlayerAttributes();
		return "viewPlayer?faces-redirect=true";
	}

	@PostConstruct
	private void init() {
		players = playerService.get30Players();
	}

}
