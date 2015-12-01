package com.netcracker.football.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.netcracker.football.dao.EmulateFootballDao;
import com.netcracker.football.emulateEntity.Footballer;

@Service("footballerService")
public class EmulateFootballerServiceImpl implements EmulateFootballerService {

	@Autowired
	private EmulateFootballDao emulateFootballDao; 
	
	@Override
	public List<Footballer> getAllFootballer() {
		return emulateFootballDao.getAllFootballer();
	}
}
