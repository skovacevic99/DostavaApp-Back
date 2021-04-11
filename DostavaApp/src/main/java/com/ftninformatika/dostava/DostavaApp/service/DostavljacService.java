package com.ftninformatika.dostava.DostavaApp.service;

import java.util.List;

import com.ftninformatika.dostava.DostavaApp.model.Dostavljac;

public interface DostavljacService {

	List<Dostavljac> findAll();
	
	Dostavljac findOne(Long id);
}
