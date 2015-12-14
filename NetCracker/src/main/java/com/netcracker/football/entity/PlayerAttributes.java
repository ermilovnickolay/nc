package com.netcracker.football.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
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

	@OneToOne(mappedBy = "playerAttributes")
	private Player player;

	public PlayerAttributes() {

	}

	public PlayerAttributes(String id, Integer crossing, Integer finishing,
			Integer headingAccuracy, Integer shortPassing, Integer volleys,
			Integer dribbling, Integer curve, Integer freeKickAccuracy,
			Integer longPassing, Integer ballControl, Integer acceleration,
			Integer sprintSpeed, Integer agility, Integer reactions,
			Integer balance, Integer shotPower, Integer jumping,
			Integer stamina, Integer strength, Integer longShots,
			Integer agression, Integer interceptions, Integer positioning,
			Integer vision, Integer penalties, Integer markin,
			Integer standingTackle, Integer slidingTackle, Integer gkdiving,
			Integer gkhandling, Integer gkkicking, Integer gkPositioning,
			Integer gkreflexes) {
		super();
		Id = id;
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

	public Integer getCrossing() {
		return crossing;
	}

	public void setCrossing(Integer crossing) {
		this.crossing = crossing;
	}

	public Integer getFinishing() {
		return finishing;
	}

	public void setFinishing(Integer finishing) {
		this.finishing = finishing;
	}

	public Integer getHeadingAccuracy() {
		return headingAccuracy;
	}

	public void setHeadingAccuracy(Integer headingAccuracy) {
		this.headingAccuracy = headingAccuracy;
	}

	public Integer getShortPassing() {
		return shortPassing;
	}

	public void setShortPassing(Integer shortPassing) {
		this.shortPassing = shortPassing;
	}

	public Integer getVolleys() {
		return volleys;
	}

	public void setVolleys(Integer volleys) {
		this.volleys = volleys;
	}

	public Integer getDribbling() {
		return dribbling;
	}

	public void setDribbling(Integer dribbling) {
		this.dribbling = dribbling;
	}

	public Integer getCurve() {
		return curve;
	}

	public void setCurve(Integer curve) {
		this.curve = curve;
	}

	public Integer getFreeKickAccuracy() {
		return freeKickAccuracy;
	}

	public void setFreeKickAccuracy(Integer freeKickAccuracy) {
		this.freeKickAccuracy = freeKickAccuracy;
	}

	public Integer getLongPassing() {
		return longPassing;
	}

	public void setLongPassing(Integer longPassing) {
		this.longPassing = longPassing;
	}

	public Integer getBallControl() {
		return ballControl;
	}

	public void setBallControl(Integer ballControl) {
		this.ballControl = ballControl;
	}

	public Integer getAcceleration() {
		return acceleration;
	}

	public void setAcceleration(Integer acceleration) {
		this.acceleration = acceleration;
	}

	public Integer getSprintSpeed() {
		return sprintSpeed;
	}

	public void setSprintSpeed(Integer sprintSpeed) {
		this.sprintSpeed = sprintSpeed;
	}

	public Integer getAgility() {
		return agility;
	}

	public void setAgility(Integer agility) {
		this.agility = agility;
	}

	public Integer getReactions() {
		return reactions;
	}

	public void setReactions(Integer reactions) {
		this.reactions = reactions;
	}

	public Integer getBalance() {
		return balance;
	}

	public void setBalance(Integer balance) {
		this.balance = balance;
	}

	public Integer getShotPower() {
		return shotPower;
	}

	public void setShotPower(Integer shotPower) {
		this.shotPower = shotPower;
	}

	public Integer getJumping() {
		return jumping;
	}

	public void setJumping(Integer jumping) {
		this.jumping = jumping;
	}

	public Integer getStamina() {
		return stamina;
	}

	public void setStamina(Integer stamina) {
		this.stamina = stamina;
	}

	public Integer getStrength() {
		return strength;
	}

	public void setStrength(Integer strength) {
		this.strength = strength;
	}

	public Integer getLongShots() {
		return longShots;
	}

	public void setLongShots(Integer longShots) {
		this.longShots = longShots;
	}

	public Integer getAgression() {
		return agression;
	}

	public void setAgression(Integer agression) {
		this.agression = agression;
	}

	public Integer getInterceptions() {
		return interceptions;
	}

	public void setInterceptions(Integer interceptions) {
		this.interceptions = interceptions;
	}

	public Integer getPositioning() {
		return positioning;
	}

	public void setPositioning(Integer positioning) {
		this.positioning = positioning;
	}

	public Integer getVision() {
		return vision;
	}

	public void setVision(Integer vision) {
		this.vision = vision;
	}

	public Integer getPenalties() {
		return penalties;
	}

	public void setPenalties(Integer penalties) {
		this.penalties = penalties;
	}

	public Integer getMarkin() {
		return markin;
	}

	public void setMarkin(Integer markin) {
		this.markin = markin;
	}

	public Integer getStandingTackle() {
		return standingTackle;
	}

	public void setStandingTackle(Integer standingTackle) {
		this.standingTackle = standingTackle;
	}

	public Integer getSlidingTackle() {
		return slidingTackle;
	}

	public void setSlidingTackle(Integer slidingTackle) {
		this.slidingTackle = slidingTackle;
	}

	public Integer getGkdiving() {
		return gkdiving;
	}

	public void setGkdiving(Integer gkdiving) {
		this.gkdiving = gkdiving;
	}

	public Integer getGkhandling() {
		return gkhandling;
	}

	public void setGkhandling(Integer gkhandling) {
		this.gkhandling = gkhandling;
	}

	public Integer getGkkicking() {
		return gkkicking;
	}

	public void setGkkicking(Integer gkkicking) {
		this.gkkicking = gkkicking;
	}

	public Integer getGkPositioning() {
		return gkPositioning;
	}

	public void setGkPositioning(Integer gkPositioning) {
		this.gkPositioning = gkPositioning;
	}

	public Integer getGkreflexes() {
		return gkreflexes;
	}

	public void setGkreflexes(Integer gkreflexes) {
		this.gkreflexes = gkreflexes;
	}

	public Player getPlayer() {
		return player;
	}

	public void setPlayer(Player player) {
		this.player = player;
	}

}