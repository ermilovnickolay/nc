package com.netcracker.football.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class FavouritePlayerPK implements Serializable {

	private static final long serialVersionUID = 703823600332226562L;
	@Column(name = "user_id", nullable = false)
	private Long userId;
	@Column(name = "player_id", nullable = false)
	private String playerId;

	public FavouritePlayerPK() {

	}

	public FavouritePlayerPK(Long userId, String playerId) {
		super();
		this.userId = userId;
		this.playerId = playerId;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getPlayerId() {
		return playerId;
	}

	public void setPlayerId(String playerId) {
		this.playerId = playerId;
	}

}
