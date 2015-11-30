package com.netcracker.football.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.netcracker.football.emulateEntity.Footballer;

@Service("footballerService")
public class EmulateFootballerServiceImpl implements EmulateFootballerService {

	@Override
	public List<Footballer> getAllFootballer() {
		List<Footballer> footballers = new ArrayList<Footballer>();
		footballers.add(new Footballer("Lionel Messi", 28, "À‘", 99,
				"Barcelona"));
		footballers.add(new Footballer("Neymar", 23, "œ‘", 91, "Barcelona"));
		footballers.add(new Footballer("Suarez", 25, "÷‘", 93, "Barcelona"));
		footballers.add(new Footballer("Cristiano Ronaldo", 31, "À‘", 90,
				"Real Madrid"));
		footballers.add(new Footballer("De Gea", 23, "¬–“", 85, "MU"));
		return footballers;
	}
}
