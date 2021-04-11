package com.ftninformatika.dostava.DostavaApp.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ftninformatika.dostava.DostavaApp.model.Dostavljac;
import com.ftninformatika.dostava.DostavaApp.service.DostavljacService;
import com.ftninformatika.dostava.DostavaApp.support.DostavljacToDostavljacDTO;
import com.ftninformatika.dostava.DostavaApp.web.dto.DostavljacDTO;

@RestController
@RequestMapping(value = "/api/dostavljaci", produces = MediaType.APPLICATION_JSON_VALUE)
public class DostavljacController {
	
	@Autowired
	private DostavljacService dostavljacService;
	
	@Autowired
	private DostavljacToDostavljacDTO toDto;

	@GetMapping()
	public ResponseEntity<List<DostavljacDTO>> getAll(){
		List<Dostavljac> dostavljaci = dostavljacService.findAll();
		
		return new ResponseEntity<List<DostavljacDTO>>(toDto.convert(dostavljaci), (HttpStatus.OK));
	}
}
