package com.netcracker.football.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by Dark Knight on 07.12.2015.
 */
@Entity
@Table(name = "player_attributes")
public class PlayerAttributes implements Serializable {

	private static final long serialVersionUID = 7228922330368491834L;
	@Id
	@GeneratedValue
	private String Id;
	@Column
	private Integer overall;
	@Column
	private Integer number;
	@Column
	private Integer crossing;
	@Column
	private Integer finishing;
	@Column
	private Integer headingAccuracy;
	@Column
	private Integer shortPassing;
	@Column
	private Integer volleys;
	@Column
	private Integer dribbling;
	@Column
	private Integer curve;
	@Column
	private Integer freeKickAccuracy;
	@Column
	private Integer longPassing;
	@Column
	private Integer ballControl;
	@Column
	private Integer acceleration;
	@Column
	private Integer sprintSpeed;
	@Column
	private Integer agility;
	@Column
	private Integer reactions;
	@Column
	private Integer balance;
	@Column
	private Integer shotPower;
	@Column
	private Integer jumping;
	@Column
	private Integer stamina;
	@Column
	private Integer strength;
	@Column
	private Integer longShots;
	@Column
	private Integer agression;
	@Column
	private Integer interceptions;
	@Column
	private Integer positioning;
	@Column
	private Integer vision;
	@Column
	private Integer penalties;
	@Column
	private Integer markin;
	@Column
	private Integer standingTackle;
	@Column
	private Integer slidingTackle;
	@Column
	private Integer gkdiving;
	@Column
	private Integer gkhandling;
	@Column
	private Integer gkkicking;
	@Column
	private Integer gkPositioning;
	@Column
	private Integer gkreflexes;

	public PlayerAttributes() {

	}

	public PlayerAttributes(String id, Integer overall, Integer number,
			Integer crossing, Integer finishing, Integer headingAccuracy,
			Integer shortPassing, Integer volleys, Integer dribbling,
			Integer curve, Integer freeKickAccuracy, Integer longPassing,
			Integer ballControl, Integer acceleration, Integer sprintSpeed,
			Integer agility, Integer reactions, Integer balance,
			Integer shotPower, Integer jumping, Integer stamina,
			Integer strength, Integer longShots, Integer agression,
			Integer interceptions, Integer positioning, Integer vision,
			Integer penalties, Integer markin, Integer standingTackle,
			Integer slidingTackle, Integer gkdiving, Integer gkhandling,
			Integer gkkicking, Integer gkPositioning, Integer gkreflexes) {
		super();
		Id = id;
		this.overall = overall;
		this.number = number;
		this.crossing = crossing;
		this.finishing = finishing;
		this.headingAccuracy = headingAccuracy;
		this.shortPassing = shortPassing;
		this.volleys = volleys;
		this.dribbling = dribbling;
		this.curve = curve;
		this.freeKickAccuracy = freeKickAccuracy;
		this.longPassing = longPassing;
		this.ballControl = ballControl;
		this.acceleration = acceleration;
		this.sprintSpeed = sprintSpeed;
		this.agility = agility;
		this.reactions = reactions;
		this.balance = balance;
		this.shotPower = shotPower;
		this.jumping = jumping;
		this.stamina = stamina;
		this.strength = strength;
		this.longShots = longShots;
		this.agression = agression;
		this.interceptions = interceptions;
		this.positioning = positioning;
		this.vision = vision;
		this.penalties = penalties;
		this.markin = markin;
		this.standingTackle = standingTackle;
		this.slidingTackle = slidingTackle;
		this.gkdiving = gkdiving;
		this.gkhandling = gkhandling;
		this.gkkicking = gkkicking;
		this.gkPositioning = gkPositioning;
		this.gkreflexes = gkreflexes;
	}

	public String getId() {
		return Id;
	}

	public void setId(String id) {
		Id = id;
	}

	public int getOverall() {
		return overall;
	}

	public void setOverall(Integer overall) {
		this.overall = overall;
	}

	public int getNumber() {
		return this.number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public int getCrossing() {
		return this.crossing;
	}

	public void setCrossing(Integer crossing) {
		this.crossing = crossing;
	}

	public int getFinishing() {
		return this.finishing;
	}

	public void setFinishing(Integer finishing) {
		this.finishing = finishing;
	}

	public int getHeadingAccuracy() {
		return this.headingAccuracy;
	}

	public void setHeadingAccuracy(Integer headingAccuracy) {
		this.headingAccuracy = headingAccuracy;
	}

	public int getShortPassing() {
		return this.shortPassing;
	}

	public void setShortPassing(Integer shortPassing) {
		this.shortPassing = shortPassing;
	}

	public int getVolleys() {
		return this.volleys;
	}

	public void setVolleys(Integer volleys) {
		this.volleys = volleys;
	}

	public int getDribbling() {
		return this.dribbling;
	}

	public void setDribbling(Integer dribbling) {
		this.dribbling = dribbling;
	}

	public int getCurve() {
		return this.curve;
	}

	public void setCurve(Integer curve) {
		this.curve = curve;
	}

	public int getFreeKickAccuracy() {
		return this.freeKickAccuracy;
	}

	public void setFreeKickAccuracy(Integer freeKickAccuracy) {
		this.freeKickAccuracy = freeKickAccuracy;
	}

	public int getLongPassing() {
		return this.longPassing;
	}

	public void setLongPassing(Integer longPassing) {
		this.longPassing = longPassing;
	}

	public int getBallControl() {
		return this.ballControl;
	}

	public void setBallControl(Integer ballControl) {
		this.ballControl = ballControl;
	}

	public int getAcceleration() {
		return this.acceleration;
	}

	public void setAcceleration(Integer acceleration) {
		this.acceleration = acceleration;
	}

	public int getSprintSpeed() {
		return this.sprintSpeed;
	}

	public void setSprintSpeed(Integer sprintSpeed) {
		this.sprintSpeed = sprintSpeed;
	}

	public int getAgility() {
		return this.agility;
	}

	public void setAgility(Integer agility) {
		this.agility = agility;
	}

	public int getReactions() {
		return this.reactions;
	}

	public void setReactions(Integer reactions) {
		this.reactions = reactions;
	}

	public int getBalance() {
		return this.balance;
	}

	public void setBalance(Integer balance) {
		this.balance = balance;
	}

	public int getShotPower() {
		return this.shotPower;
	}

	public void setShotPower(Integer shotPower) {
		this.shotPower = shotPower;
	}

	public int getJumping() {
		return this.jumping;
	}

	public void setJumping(Integer jumping) {
		this.jumping = jumping;
	}

	public int getStamina() {
		return this.stamina;
	}

	public void setStamina(Integer stamina) {
		this.stamina = stamina;
	}

	public int getStrength() {
		return this.strength;
	}

	public void setStrength(Integer strength) {
		this.strength = strength;
	}

	public int getLongShots() {
		return this.longShots;
	}

	public void setLongShots(Integer longShots) {
		this.longShots = longShots;
	}

	public int getAgression() {
		return this.agression;
	}

	public void setAgression(Integer agression) {
		this.agression = agression;
	}

	public int getInterceptions() {
		return this.interceptions;
	}

	public void setInterceptions(Integer interceptions) {
		this.interceptions = interceptions;
	}

	public int getPositioning() {
		return this.positioning;
	}

	public void setPositioning(Integer positioning) {
		this.positioning = positioning;
	}

	public int getVision() {
		return this.vision;
	}

	public void setVision(Integer vision) {
		this.vision = vision;
	}

	public int getPenalties() {
		return this.penalties;
	}

	public void setPenalties(Integer penalties) {
		this.penalties = penalties;
	}

	public int getMarkin() {
		return this.markin;
	}

	public void setMarkin(Integer markin) {
		this.markin = markin;
	}

	public int getStandingTackle() {
		return this.standingTackle;
	}

	public void setStandingTackle(Integer standingTackle) {
		this.standingTackle = standingTackle;
	}

	public int getSlidingTackle() {
		return this.slidingTackle;
	}

	public void setSlidingTackle(Integer slidingTackle) {
		this.slidingTackle = slidingTackle;
	}

	public int getGKdiving() {
		return this.gkdiving;
	}

	public void setGKdiving(Integer gKdiving) {
		this.gkdiving = gKdiving;
	}

	public int getGKhandling() {
		return this.gkhandling;
	}

	public void setGKhandling(Integer gKhandling) {
		this.gkhandling = gKhandling;
	}

	public int getGKkicking() {
		return this.gkkicking;
	}

	public void setGKkicking(Integer gKkicking) {
		this.gkkicking = gKkicking;
	}

	public int getGKPositioning() {
		return this.gkPositioning;
	}

	public void setGKPositioning(Integer gKPositioning) {
		this.gkPositioning = gKPositioning;
	}

	public int getGKreflexes() {
		return this.gkreflexes;
	}

	public void setGKreflexes(Integer gKreflexes) {
		this.gkreflexes = gKreflexes;
	}

}
