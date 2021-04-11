package com.ftninformatika.dostava.DostavaApp.web.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ftninformatika.dostava.DostavaApp.model.Racun;
import com.ftninformatika.dostava.DostavaApp.service.RacunService;
import com.ftninformatika.dostava.DostavaApp.support.RacunDtoToRacun;
import com.ftninformatika.dostava.DostavaApp.support.RacunToRacunDTO;
import com.ftninformatika.dostava.DostavaApp.web.dto.RacunDTO;

@RestController
@RequestMapping(value = "/api/racuni", produces = MediaType.APPLICATION_JSON_VALUE)
public class RacunController {
	
	@Autowired
	private RacunService racunService;
	
	@Autowired
	private RacunToRacunDTO toDto;
	
	@Autowired
	private RacunDtoToRacun toRacun;
	
	@GetMapping("/{id}")
	public ResponseEntity<RacunDTO> getOne(@PathVariable Long id){
		
		Racun racun = racunService.findOne(id);
		
		return new ResponseEntity<RacunDTO>(toDto.convert(racun), HttpStatus.OK);
	}
	
	@PostMapping
	public ResponseEntity<RacunDTO> create(@Valid @RequestBody RacunDTO dto){
		Racun racun = toRacun.convert(dto);
		Racun dodat = racunService.save(racun);
		
		return new ResponseEntity<RacunDTO>(toDto.convert(dodat), HttpStatus.CREATED);
	}

}
