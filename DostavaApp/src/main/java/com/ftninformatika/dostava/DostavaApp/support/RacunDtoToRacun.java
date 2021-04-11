package com.ftninformatika.dostava.DostavaApp.support;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import com.ftninformatika.dostava.DostavaApp.model.Racun;
import com.ftninformatika.dostava.DostavaApp.service.NarudzbaService;
import com.ftninformatika.dostava.DostavaApp.service.RacunService;
import com.ftninformatika.dostava.DostavaApp.web.dto.RacunDTO;

@Component
public class RacunDtoToRacun implements Converter<RacunDTO, Racun> {
	
	@Autowired
	private RacunService racunService;
	
	@Autowired
	private NarudzbaService narudzbaService;

	@Override
	public Racun convert(RacunDTO dto) {
		Racun entity;
		
		if(dto.getId() == null) {
			entity = new Racun();
		} else {
			entity = racunService.findOne(dto.getId());
		}
		
		if(entity != null) {
			entity.setBrojRacuna(dto.getBrojRacuna());
			entity.setDatum(dto.getDatum());
			entity.setUkupnaCena(dto.getUkupnaCena());
			entity.setNarudzba(narudzbaService.findOne(dto.getNarudzbaId()));
			
			return entity;
		}
		
		return null;
	}

}
