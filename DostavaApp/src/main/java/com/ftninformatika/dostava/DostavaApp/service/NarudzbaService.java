package com.ftninformatika.dostava.DostavaApp.service;

import java.util.List;

import org.springframework.data.domain.Page;

import com.ftninformatika.dostava.DostavaApp.model.Narudzba;

public interface NarudzbaService {

	List<Narudzba> findAll();
	
	Narudzba findOne(Long id);
	
	Narudzba save(Narudzba narudzba);
	
	Narudzba update(Narudzba narudzba);
	
	Narudzba delete(Long id);

	Page<Narudzba> find(String mestoIsporuke, Long dostavljacId, int pageNo);
}
