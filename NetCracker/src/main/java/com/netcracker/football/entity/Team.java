package com.netcracker.football.entity;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Team")
public class Team implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@Column(unique = true)
	private String id;

	@Column(name = "NAME", nullable = false, length = 50)
	private String name;

	@Column(name = "FOUNDED", nullable = false, length = 50)
	private String founded;

	@Column(name = "STADIUM", nullable = false, length = 100)
	private String stadium;

	@Column(name = "RATING")
	private Integer rating;

	@Column(name = "ATTACK")
	private Integer attack;

	@Column(name = "MIDFIELD")
	private Integer midfield;

	@Column(name = "DEFENCE")
	private Integer defence;
	
	@Column(name = "COUNTRY")
	private String country;

	public Team() {
	}

	public Team(String id, String name, String founded, String stadium,
			Integer rating, Integer attack, Integer midfield, Integer defence, String country) {
		super();
		this.id = id;
		this.name = name;
		this.founded = founded;
		this.stadium = stadium;
		this.rating = rating;
		this.attack = attack;
		this.midfield = midfield;
		this.defence = defence;
		this.country=country;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getFounded() {
		return founded;
	}

	public void setFounded(String founded) {
		this.founded = founded;
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

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}	
	
}