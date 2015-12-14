package com.netcracker.football.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "country")
public class Country implements Serializable {

	private static final long serialVersionUID = 5423558257665786271L;
	@Id
	@Column(unique = true)
	private String id;
	@Column(name = "NAME", nullable = false, length = 50)
	private String name;
	@OneToMany(mappedBy = "country")
	List<Player> players;
	@OneToMany(mappedBy = "country")
	List<League> leagues;

	public Country() {
	}

	public Country(String name) {
		super();
		this.name = name;
	}

	public Country(String id, String name, List<Player> players,
			List<League> leagues) {
		super();
		this.id = id;
		this.name = name;
		this.players = players;
		this.leagues = leagues;
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

	public List<Player> getPlayers() {
		return players;
	}

	public void setPlayers(List<Player> players) {
		this.players = players;
	}

	public List<League> getLeagues() {
		return leagues;
	}

	public void setLeagues(List<League> leagues) {
		this.leagues = leagues;
	}

}
