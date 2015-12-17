package com.netcracker.football.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "role")
public class Role implements Serializable {

	private static final long serialVersionUID = 8359835219540944843L;
	@Id
	@Column(unique = true)
	private String id;
	@Column(name = "NAME", nullable = false, length = 50)
	private String name;
	@Column(name = "DESCRIPTION", length = 500)
	private String description;
	@OneToMany(mappedBy = "role")
	List<User> users;

	public Role(String id, String name, String description, List<User> users) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.users = users;
	}

	public Role() {
		super();
	}

	public Role(String name, String description) {
		super();
		this.name = name;
		this.description = description;
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

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public List<User> getUsers() {
		return users;
	}

	public void setUsers(List<User> users) {
		this.users = users;
	}

}
