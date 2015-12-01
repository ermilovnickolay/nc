package com.netcracker.football.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.netcracker.football.emulateEntity.Footballer;


public interface EmulateFootballDao {

	List<Footballer> getAllFootballer();

}
