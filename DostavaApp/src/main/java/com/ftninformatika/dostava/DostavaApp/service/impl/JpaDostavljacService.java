package com.ftninformatika.dostava.DostavaApp.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ftninformatika.dostava.DostavaApp.model.Dostavljac;
import com.ftninformatika.dostava.DostavaApp.repository.DostavljacRepository;
import com.ftninformatika.dostava.DostavaApp.service.DostavljacService;

@Service
public class JpaDostavljacService implements DostavljacService {

	@Autowired
	private DostavljacRepository dostavljacRepository;
	
	@Override
	public List<Dostavljac> findAll() {
		return dostavljacRepository.findAll();
	}

	@Override
	public Dostavljac findOne(Long id) {
		return dostavljacRepository.findOneById(id);
	}

}
