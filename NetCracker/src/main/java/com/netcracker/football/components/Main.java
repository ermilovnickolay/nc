package com.netcracker.football.components;

import javax.annotation.PostConstruct;
import javax.faces.bean.RequestScoped;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.netcracker.football.service.FirstService;

@Component(value = "main")
@RequestScoped
public class Main {

	private String msg;

	@Autowired
	private FirstService firstService;

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	@PostConstruct
	private void init() {
		msg = firstService.getName();
	}
}