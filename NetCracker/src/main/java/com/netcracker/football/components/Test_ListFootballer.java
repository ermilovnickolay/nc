package com.netcracker.football.components;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.RequestScoped;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.netcracker.football.emulateEntity.Footballer;
import com.netcracker.football.service.EmulateFootballerService;

@Component(value = "footballerList")
@RequestScoped
public class Test_ListFootballer {

	@Autowired
	private EmulateFootballerService emulateFootballerService;

	private List<Footballer> footballers = new ArrayList<Footballer>();

	public List<Footballer> getFootballers() {
		return footballers;
	}

	public void setFootballer(List<Footballer> footballers) {
		this.footballers = footballers;
	}

	@PostConstruct
	private void init() {
		footballers = emulateFootballerService.getAllFootballer();
	}
}
