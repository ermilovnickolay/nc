package com.netcracker.football.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "league")
public class League implements Serializable {

	private static final long serialVersionUID = 3074607055084003137L;
	@Id
	@GeneratedValue
	private String Id;
	@Column(name = "NAME", nullable = false, length = 50)
	private String name;
	@Column(name = "RANK")
	private Integer rank;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "COUNTRY_ID", nullable = false)
	private Country country;
	@OneToMany(mappedBy = "league")
	List<Team> teams;

	public League() {
		super();
	}

	public League(String name, Integer rank, Country country) {
		super();
		this.name = name;
		this.rank = rank;
		this.country = country;
	}

	public League(String id, String name, Integer rank, Country country,
			List<Team> clubs) {
		super();
		Id = id;
		this.name = name;
		this.rank = rank;
		this.country = country;
		this.teams = clubs;
	}

	public String getId() {
		return Id;
	}

	public void setId(String id) {
		Id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getRank() {
		return rank;
	}

	public void setRank(Integer rank) {
		this.rank = rank;
	}

	public Country getCountry() {
		return country;
	}

	public void setCountry(Country country) {
		this.country = country;
	}

	public List<Team> getClubs() {
		return teams;
	}

	public void setClubs(List<Team> clubs) {
		this.teams = clubs;
	}

}
