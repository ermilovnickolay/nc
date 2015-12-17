package com.netcracker.football.entity;

import static javax.persistence.GenerationType.IDENTITY;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "users")
public class User implements Serializable {

	private static final long serialVersionUID = -1871638793715573225L;

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "ID", unique = true)
	private Long id;
	@Column(name = "NAME", length = 100)
	private String name;
	@Column(name = "SURNAME", length = 100)
	private String surname;
	@Column(name = "BIRTHDATE")
	private Date birthdate;
	@Column(name = "SEX", length = 100)
	private String sex;
	@Column(name = "SECRET_QUESTION", length = 200)
	private String secretQuestion;
	@Column(name = "SECRET_ANSWER", length = 200)
	private String secretAnswer;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "COUNTRY_ID")
	private Country country;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ROLE_ID", nullable = false)
	private Role role;
	@Column(name = "EMAIL", nullable = false, length = 50)
	private String email;
	@Column(name = "PASSWORD", nullable = false, length = 50)
	private String password;
	@Column(name = "LANGUAGE", length = 50)
	private String language;

	public User() {
		super();
	}

	public User(Long id, String name, String surname, Date birthdate,
			String sex, String secretQuestion, String secretAnswer,
			Country country, Role role, String email, String password,
			String language) {
		super();
		this.id = id;
		this.name = name;
		this.surname = surname;
		this.birthdate = birthdate;
		this.sex = sex;
		this.secretQuestion = secretQuestion;
		this.secretAnswer = secretAnswer;
		this.country = country;
		this.role = role;
		this.email = email;
		this.password = password;
		this.language = language;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public Date getBirthdate() {
		return birthdate;
	}

	public void setBirthdate(Date birthdate) {
		this.birthdate = birthdate;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getSecretQuestion() {
		return secretQuestion;
	}

	public void setSecretQuestion(String secretQuestion) {
		this.secretQuestion = secretQuestion;
	}

	public String getSecretAnswer() {
		return secretAnswer;
	}

	public void setSecretAnswer(String secretAnswer) {
		this.secretAnswer = secretAnswer;
	}

	public Country getCountry() {
		return country;
	}

	public void setCountry(Country country) {
		this.country = country;
	}

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

}
