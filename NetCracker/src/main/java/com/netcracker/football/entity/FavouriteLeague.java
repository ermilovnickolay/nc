package com.netcracker.football.entity;

import java.io.Serializable;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "favourite_league")
public class FavouriteLeague implements Serializable {
	private static final long serialVersionUID = 1L;
	@EmbeddedId
	protected FavouriteClubPK favouriteClubPK;
	@JoinColumn(name = "user_id", insertable = false, updatable = false)
	@ManyToOne(fetch = FetchType.LAZY)
	private User user;
	@JoinColumn(name = "league_id", insertable = false, updatable = false)
	@ManyToOne(fetch = FetchType.LAZY)
	private League league;

	public FavouriteLeague(FavouriteClubPK favouriteClubPK) {
		super();
		this.favouriteClubPK = favouriteClubPK;

	}

	public FavouriteLeague(FavouriteClubPK favouriteClubPK, User user,
			League league) {
		super();
		this.favouriteClubPK = favouriteClubPK;
		this.user = user;
		this.league = league;
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

	public League getLeague() {
		return league;
	}

	public void setLeague(League league) {
		this.league = league;
	}

}
