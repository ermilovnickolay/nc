package com.netcracker.football.service.Impl;

import org.springframework.stereotype.Service;

import com.netcracker.football.service.FirstService;

@Service("firstService")
public class FirstServiceImpl implements FirstService {

	private static final String HELLO_WORLD = "Hello world";

	@Override
	public String getName() {
		return HELLO_WORLD;
	}
}
