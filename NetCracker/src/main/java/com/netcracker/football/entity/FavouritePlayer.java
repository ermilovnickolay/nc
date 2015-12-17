package com.netcracker.football.entity;

import java.io.Serializable;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "favourite_player")
public class FavouritePlayer implements Serializable {

	private static final long serialVersionUID = 1L;
	@EmbeddedId
	protected FavouriteClubPK favouritePlayerPK;
	@JoinColumn(name = "user_id", insertable = false, updatable = false)
	@ManyToOne(fetch = FetchType.LAZY)
	private User user;
	@JoinColumn(name = "player_id", insertable = false, updatable = false)
	@ManyToOne(fetch = FetchType.LAZY)
	private Player player;

	public FavouritePlayer() {
		super();
	}

	public FavouritePlayer(FavouriteClubPK favouritePlayerPK) {
		super();
		this.favouritePlayerPK = favouritePlayerPK;
	}

	public FavouritePlayer(User user, Player player,
			FavouriteClubPK favouritePlayerPK) {
		super();
		this.user = user;
		this.player = player;
		this.favouritePlayerPK = favouritePlayerPK;

	}

	public FavouriteClubPK getFavouritePlayerPK() {
		return favouritePlayerPK;
	}

	public void setFavouritePlayerPK(FavouriteClubPK favouritePlayerPK) {
		this.favouritePlayerPK = favouritePlayerPK;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Player getPlayer() {
		return player;
	}

	public void setPlayer(Player player) {
		this.player = player;
	}

}
