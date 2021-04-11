package com.ftninformatika.dostava.DostavaApp.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.ftninformatika.dostava.DostavaApp.model.Narudzba;
import com.ftninformatika.dostava.DostavaApp.repository.NarudzbaRepository;
import com.ftninformatika.dostava.DostavaApp.service.NarudzbaService;

@Service
public class JpaNarudzbaService implements NarudzbaService {
	
	@Autowired
	private NarudzbaRepository narudzbaRepository;
	@Override
	public List<Narudzba> findAll() {
		return narudzbaRepository.findAll();
	}

	@Override
	public Narudzba findOne(Long id) {
		return narudzbaRepository.findOneById(id);
	}

	@Override
	public Narudzba save(Narudzba narudzba) {
		return narudzbaRepository.save(narudzba);
	}

	@Override
	public Narudzba update(Narudzba narudzba) {
		return narudzbaRepository.save(narudzba);
	}

	@Override
	public Narudzba delete(Long id) {
		Narudzba narudzba = narudzbaRepository.findOneById(id);
		if(narudzba != null) {
			narudzbaRepository.deleteById(id);
			return narudzba;
		}
		return null;
	}

	@Override
	public Page<Narudzba> find(String mestoIsporuke, Long dostavljacId, int pageNo) {
		return narudzbaRepository.search(mestoIsporuke, dostavljacId, PageRequest.of(pageNo, 4));
	}

}
