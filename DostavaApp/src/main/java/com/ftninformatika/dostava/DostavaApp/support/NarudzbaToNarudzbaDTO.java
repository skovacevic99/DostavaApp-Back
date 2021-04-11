package com.ftninformatika.dostava.DostavaApp.support;

import java.util.ArrayList;
import java.util.List;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import com.ftninformatika.dostava.DostavaApp.model.Narudzba;
import com.ftninformatika.dostava.DostavaApp.web.dto.NarudzbaDTO;

@Component
public class NarudzbaToNarudzbaDTO implements Converter<Narudzba, NarudzbaDTO> {

	@Override
	public NarudzbaDTO convert(Narudzba source) {
		NarudzbaDTO dto = new NarudzbaDTO();
		dto.setBrNarudzbe(source.getBrNarudzbe());
		dto.setCena(source.getCena());
		dto.setDatum(source.getDatum());
		dto.setDostavljacId(source.getDostavljac().getId());
		dto.setId(source.getId());
		dto.setMestoIsporuke(source.getMestoIsporuke());
		dto.setOpis(source.getOpis());
		dto.setDostavljacIme(source.getDostavljac().getImeIPrezime());
		if(source.getRacun() != null) {
			dto.setRacunId(source.getRacun().getId());
		}
		
		return dto;
	}
	
	public List<NarudzbaDTO> convert(List<Narudzba> narudzbe){
		List<NarudzbaDTO> dto = new ArrayList<NarudzbaDTO>();
		for(Narudzba n : narudzbe) {
			dto.add(convert(n));
		}
		return dto;
	}

}
