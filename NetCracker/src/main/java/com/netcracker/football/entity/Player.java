package com.netcracker.football.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "player")
public class Player implements Serializable {

	private static final long serialVersionUID = -3052157917914499179L;

	@Id
	@Column(unique = true)
	private String id;

	@Column(name = "NAME", length = 100)
	private String name;

	@Column(name = "AGE", length = 50)
	private String age;

	@Column(name = "POSITION", length = 50)
	private String position;

	@Column(name = "PLAYER_NUMBER")
	private Integer number;

	@Column(name = "OVERALL")
	private Integer overall;

	@Column(name = "FOOT", length = 50)
	private String foot;

	@Column(name = "IMAGE", length = 100)
	private String image;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "TEAM_ID", nullable = false)
	private Team team;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "COUNTRY_ID", nullable = false)
	private Country country;

	@OneToOne
	@PrimaryKeyJoinColumn
	private PlayerAttributes playerAttributes;

	public Player() {
	}

	public Player(String id, String name, String age, String position,
			Integer number, Integer overall, String foot, Team team,
			Country country, String image, PlayerAttributes playerAttributes) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.position = position;
		this.number = number;
		this.overall = overall;
		this.foot = foot;
		this.team = team;
		this.country = country;
		this.image = image;
		this.playerAttributes = playerAttributes;
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

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public Integer getOverall() {
		return overall;
	}

	public void setOverall(Integer overall) {
		this.overall = overall;
	}

	public String getFoot() {
		return foot;
	}

	public void setFoot(String foot) {
		this.foot = foot;
	}

	public Team getTeam() {
		return team;
	}

	public void setTeam(Team club) {
		this.team = club;
	}

	public Country getCountry() {
		return country;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public void setCountry(Country country) {
		this.country = country;
	}

	public PlayerAttributes getPlayerAttributes() {
		return playerAttributes;
	}

	public void setPlayerAttributes(PlayerAttributes playerAttributes) {
		this.playerAttributes = playerAttributes;
	}

}
