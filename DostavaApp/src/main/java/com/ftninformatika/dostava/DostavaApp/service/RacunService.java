package com.ftninformatika.dostava.DostavaApp.service;

import java.util.List;

import com.ftninformatika.dostava.DostavaApp.model.Racun;

public interface RacunService {

	List<Racun> findAll();
	
	Racun findOne(Long id);

	Racun save(Racun racun);
}
