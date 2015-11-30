package com.netcracker.football.service;

import org.springframework.stereotype.Service;

@Service("firstService")
public class FirstServiceImpl implements FirstService {

	private static final String HELLO_WORLD = "Hello world";

	@Override
	public String getName() {
		return HELLO_WORLD;
	}
}
