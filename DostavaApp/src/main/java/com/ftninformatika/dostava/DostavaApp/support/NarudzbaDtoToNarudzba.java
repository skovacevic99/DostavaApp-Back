package com.ftninformatika.dostava.DostavaApp.support;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import com.ftninformatika.dostava.DostavaApp.model.Narudzba;
import com.ftninformatika.dostava.DostavaApp.service.DostavljacService;
import com.ftninformatika.dostava.DostavaApp.service.NarudzbaService;
import com.ftninformatika.dostava.DostavaApp.service.RacunService;
import com.ftninformatika.dostava.DostavaApp.web.dto.NarudzbaDTO;

@Component
public class NarudzbaDtoToNarudzba implements Converter<NarudzbaDTO, Narudzba> {
	
	@Autowired
	private NarudzbaService narudzbaService;
	
	@Autowired
	private DostavljacService dostavljacService;
	
	@Autowired
	private RacunService racunService;

	@Override
	public Narudzba convert(NarudzbaDTO source) {
		Narudzba entity;
		
		if(source.getId() == null) {
			entity = new Narudzba();
		} else {
			entity = narudzbaService.findOne(source.getId());
			System.out.println("Menjaaa");
		}
		
		if(entity != null) {
			entity.setBrNarudzbe(source.getBrNarudzbe());
			entity.setCena(source.getCena());
			entity.setDatum(source.getDatum());
			entity.setDostavljac(dostavljacService.findOne(source.getDostavljacId()));
			entity.setId(source.getId());
			entity.setMestoIsporuke(source.getMestoIsporuke());
			entity.setOpis(source.getOpis());
			if(source.getRacunId() != null) {
				entity.setRacun(racunService.findOne(source.getRacunId()));
			}
			System.out.println("entitet *****" + entity);
			return entity;
		}
		return null;
	}

}
