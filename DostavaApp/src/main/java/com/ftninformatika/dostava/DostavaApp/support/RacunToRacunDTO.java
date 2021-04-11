package com.ftninformatika.dostava.DostavaApp.support;

import java.util.ArrayList;
import java.util.List;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import com.ftninformatika.dostava.DostavaApp.model.Racun;
import com.ftninformatika.dostava.DostavaApp.web.dto.RacunDTO;

@Component
public class RacunToRacunDTO implements Converter<Racun, RacunDTO> {
	
	@Override
	public RacunDTO convert(Racun source) {
		RacunDTO dto = new RacunDTO();
		dto.setBrojNarudzbe(source.getNarudzba().getBrNarudzbe());
		dto.setBrojRacuna(source.getBrojRacuna());
		dto.setDatum(source.getDatum());
		dto.setId(source.getId());
		dto.setNarudzbaId(source.getNarudzba().getId());
		dto.setUkupnaCena(source.getUkupnaCena());
		return dto;
	}
	
	public List<RacunDTO> convert(List<Racun> racuni){
		List<RacunDTO> dto = new ArrayList<RacunDTO>();
		for(Racun r : racuni) {
			dto.add(convert(r));
		}
		return dto;
	}

}
