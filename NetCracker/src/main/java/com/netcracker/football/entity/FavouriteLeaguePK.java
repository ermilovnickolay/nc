package com.netcracker.football.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class FavouriteLeaguePK implements Serializable {

	private static final long serialVersionUID = 1004701683966929265L;

	@Column(name = "user_id", nullable = false)
	private Long userId;
	@Column(name = "league_id", nullable = false)
	private String leagueId;

	public FavouriteLeaguePK() {
		super();
	}

	public FavouriteLeaguePK(Long userId, String leagueId) {
		super();
		this.userId = userId;
		this.leagueId = leagueId;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getLeagueId() {
		return leagueId;
	}

	public void setLeagueId(String leagueId) {
		this.leagueId = leagueId;
	}

}
