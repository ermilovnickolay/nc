package com.netcracker.football.emulateEntity;

public class Footballer {

	private String name;

	private Integer years;

	private String position;

	private Integer overall;

	private String team;

	public Footballer() {
	}

	public Footballer(String name, Integer years, String position,
			Integer overall, String team) {
		super();
		this.name = name;
		this.years = years;
		this.position = position;
		this.overall = overall;
		this.team = team;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getYears() {
		return years;
	}

	public void setYears(Integer years) {
		this.years = years;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public Integer getOverall() {
		return overall;
	}

	public void setOverall(Integer overall) {
		this.overall = overall;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		this.team = team;
	}
}
