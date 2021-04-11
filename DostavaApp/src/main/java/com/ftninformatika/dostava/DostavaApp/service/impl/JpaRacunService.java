package com.ftninformatika.dostava.DostavaApp.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ftninformatika.dostava.DostavaApp.model.Narudzba;
import com.ftninformatika.dostava.DostavaApp.model.Racun;
import com.ftninformatika.dostava.DostavaApp.repository.RacunRepository;
import com.ftninformatika.dostava.DostavaApp.service.NarudzbaService;
import com.ftninformatika.dostava.DostavaApp.service.RacunService;

@Service
public class JpaRacunService implements RacunService {

	@Autowired
	private RacunRepository racunRepository;
	
	@Autowired NarudzbaService narudzbaService;
	
	@Override
	public List<Racun> findAll() {
		return racunRepository.findAll();
	}

	@Override
	public Racun findOne(Long id) {
		return racunRepository.findOneById(id);
	}

	@Override
	public Racun save(Racun racun) {
		Racun dodati = racunRepository.save(racun);
		if(dodati != null) {
			Narudzba narudzba = dodati.getNarudzba();
			narudzba.setRacun(dodati);
			narudzbaService.update(narudzba);
			return dodati;
		}
		return null;
	}

}
