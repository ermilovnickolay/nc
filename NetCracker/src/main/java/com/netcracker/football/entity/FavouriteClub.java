package com.netcracker.football.entity;

import java.io.Serializable;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Favourite_Club")
public class FavouriteClub implements Serializable {

	private static final long serialVersionUID = 1L;
	@EmbeddedId
	protected FavouriteClubPK favouriteClubPK;
	@JoinColumn(name = "user_id", insertable = false, updatable = false)
	@ManyToOne(fetch = FetchType.LAZY)
	private User user;
	@JoinColumn(name = "team_id", insertable = false, updatable = false)
	@ManyToOne(fetch = FetchType.LAZY)
	private Team team;

	public FavouriteClub() {
	}

	public FavouriteClub(FavouriteClubPK favouriteClubPK) {
		super();
		this.favouriteClubPK = favouriteClubPK;
	}

	public FavouriteClub(User user, Team team, FavouriteClubPK favouriteClubPK) {
		super();
		this.user = user;
		this.team = team;
		this.favouriteClubPK = favouriteClubPK;

	}

	public FavouriteClubPK getFavouriteClubPK() {
		return favouriteClubPK;
	}

	public void setFavouriteClubPK(FavouriteClubPK favouriteClubPK) {
		this.favouriteClubPK = favouriteClubPK;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Team getTeam() {
		return team;
	}

	public void setTeam(Team team) {
		this.team = team;
	}

}
