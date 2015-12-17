package com.netcracker.football.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class FavouriteClubPK implements Serializable {
	@Column(name = "user_id", nullable = false)
	private Long userId;
	@Column(name = "team_id", nullable = false)
	private String teamId;

	public FavouriteClubPK() {
	}

	public FavouriteClubPK(Long userId, String teamId) {
		this.userId = userId;
		this.teamId = teamId;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getTeamId() {
		return teamId;
	}

	public void setTeamId(String teamId) {
		this.teamId = teamId;
	}

}
