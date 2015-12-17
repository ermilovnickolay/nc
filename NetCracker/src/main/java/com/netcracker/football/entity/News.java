package com.netcracker.football.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "news")
public class News implements Serializable {

	private static final long serialVersionUID = 5423558257665786271L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private String Id;
	@Column(name = "INFORMATION_LINK", nullable = false, length = 500)
	private String InformationLink;
	@Column(name = "DATE")
	private Date date;

	public News() {
	}

	public News(String informationLink, Date date) {
		InformationLink = informationLink;
		this.date = date;
	}

	public News(String id, String informationLink, Date date) {
		super();
		Id = id;
		InformationLink = informationLink;
		this.date = date;
	}

	public String getId() {
		return Id;
	}

	public void setId(String id) {
		Id = id;
	}

	public String getInformationLink() {
		return InformationLink;
	}

	public void setInformationLink(String informationLink) {
		InformationLink = informationLink;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

}
