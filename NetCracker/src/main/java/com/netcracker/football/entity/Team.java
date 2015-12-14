package com.netcracker.football.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "team")
public class Team implements Serializable {

	private static final long serialVersionUID = -978684685907811866L;

	@Id
	@Column(unique = true)
	private String id;

	@Column(name = "NAME", length = 50)
	private String name;

	@Column(name = "STADIUM", length = 100)
	private String stadium;

	@Column(name = "RATING")
	private Integer rating;

	@Column(name = "ATTACK")
	private Integer attack;

	@Column(name = "MIDFIELD")
	private Integer midfield;

	@Column(name = "DEFENCE")
	private Integer defence;

	@Column(name = "IMAGE", length = 100)
	private String image;

	@Column(name = "COACH", length = 50)
	private String coach;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "LEAGUE_ID", nullable = false)
	private League league;

	@OneToMany(mappedBy = "team")
	List<Player> players;

	public Team() {
		super();
	}

	public Team(String id, String name, String stadium, Integer rating,
			Integer attack, Integer midfield, Integer defence, String coach,
			League league, String image) {
		super();
		this.id = id;
		this.name = name;
		this.stadium = stadium;
		this.rating = rating;
		this.attack = attack;
		this.midfield = midfield;
		this.defence = defence;
		this.coach = coach;
		this.league = league;
		this.image = image;
	}

	public Team(String id, String name, String stadium, Integer rating,
			Integer attack, Integer midfield, Integer defence, String coach,
			League league, List<Player> players) {
		super();
		this.id = id;
		this.name = name;
		this.stadium = stadium;
		this.rating = rating;
		this.attack = attack;
		this.midfield = midfield;
		this.defence = defence;
		this.coach = coach;
		this.league = league;
		this.players = players;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getStadium() {
		return stadium;
	}

	public void setStadium(String stadium) {
		this.stadium = stadium;
	}

	public Integer getRating() {
		return rating;
	}

	public void setRating(Integer rating) {
		this.rating = rating;
	}

	public Integer getAttack() {
		return attack;
	}

	public void setAttack(Integer attack) {
		this.attack = attack;
	}

	public Integer getMidfield() {
		return midfield;
	}

	public void setMidfield(Integer midfield) {
		this.midfield = midfield;
	}

	public Integer getDefence() {
		return defence;
	}

	public void setDefence(Integer defence) {
		this.defence = defence;
	}

	public String getCoach() {
		return this.coach;
	}

	public void setCoach(String coach) {
		this.coach = coach;
	}

	public League getLeague() {
		return this.league;
	}

	public void setLeague(League league) {
		this.league = league;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public List<Player> getPlayers() {
		return players;
	}

	public void setPlayers(List<Player> players) {
		this.players = players;
	}

}
