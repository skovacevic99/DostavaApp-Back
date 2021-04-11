package com.ftninformatika.dostava.DostavaApp.support;

import java.util.ArrayList;
import java.util.List;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import com.ftninformatika.dostava.DostavaApp.model.Dostavljac;
import com.ftninformatika.dostava.DostavaApp.web.dto.DostavljacDTO;

@Component
public class DostavljacToDostavljacDTO implements Converter<Dostavljac, DostavljacDTO>{

	@Override
	public DostavljacDTO convert(Dostavljac source) {
		DostavljacDTO dto = new DostavljacDTO();
		dto.setId(source.getId());
		dto.setBrojLK(source.getBrojLK());
		dto.setImeIPrezime(source.getImeIPrezime());
		dto.setJmbg(source.getJmbg());
		
		return dto;
	}

	public List<DostavljacDTO> convert(List<Dostavljac> dostavljaci){
		List<DostavljacDTO> dto = new ArrayList<DostavljacDTO>();
		for(Dostavljac d : dostavljaci) {
			dto.add(convert(d));
		}
		return dto;
	}
}
