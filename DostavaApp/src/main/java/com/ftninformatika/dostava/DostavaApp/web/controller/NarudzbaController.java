package com.ftninformatika.dostava.DostavaApp.web.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.ftninformatika.dostava.DostavaApp.model.Narudzba;
import com.ftninformatika.dostava.DostavaApp.service.NarudzbaService;
import com.ftninformatika.dostava.DostavaApp.support.NarudzbaDtoToNarudzba;
import com.ftninformatika.dostava.DostavaApp.support.NarudzbaToNarudzbaDTO;
import com.ftninformatika.dostava.DostavaApp.web.dto.NarudzbaDTO;

@Controller
@RequestMapping(value = "/api/narudzbine", produces = MediaType.APPLICATION_JSON_VALUE)
public class NarudzbaController {
	
	@Autowired
	private NarudzbaService narudzbaService;
	
	@Autowired
	private NarudzbaDtoToNarudzba toNarudzba;
	
	@Autowired
	private NarudzbaToNarudzbaDTO toDto;
	
	@GetMapping
	public ResponseEntity<List<NarudzbaDTO>> getAll(
			@RequestParam(value = "pageNo", defaultValue = "0") int pageNo,
			@RequestParam(required = false) String mestoIsporuke,
			@RequestParam(required = false) Long dostavljacId){
		
		Page<Narudzba> narudzbine = narudzbaService.find(mestoIsporuke, dostavljacId, pageNo);
		
		 HttpHeaders headers = new HttpHeaders();
	     headers.add("Total-Pages", Integer.toString(narudzbine.getTotalPages()));
		
		return new ResponseEntity<List<NarudzbaDTO>>(toDto.convert(narudzbine.getContent()), headers, HttpStatus.OK);
	}

	@GetMapping("/{id}")
	public ResponseEntity<NarudzbaDTO> getOne(@PathVariable Long id){
		
		Narudzba narudzba = narudzbaService.findOne(id);
		
		return new ResponseEntity<NarudzbaDTO>(toDto.convert(narudzba), HttpStatus.OK);
	}
	
	@PutMapping(value = "/{id}", consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<NarudzbaDTO> update(@Valid @RequestBody NarudzbaDTO dto, @PathVariable Long id){
		
		if(!id.equals(dto.getId())) {
			return new ResponseEntity<NarudzbaDTO>(HttpStatus.BAD_REQUEST);
		}
		
		Narudzba narudzba = toNarudzba.convert(dto);
		Narudzba izmenjena = narudzbaService.update(narudzba);
		
		return new ResponseEntity<NarudzbaDTO>(toDto.convert(izmenjena), HttpStatus.OK);
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<NarudzbaDTO> delete(@PathVariable Long id){
		Narudzba obrisana = narudzbaService.delete(id);
		
		if(obrisana != null) {
			return new ResponseEntity<NarudzbaDTO>(toDto.convert(obrisana), HttpStatus.NO_CONTENT);
		} else {
			return new ResponseEntity<NarudzbaDTO>(HttpStatus.NOT_FOUND);
		}
	}
	
	@PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<NarudzbaDTO> create(@Valid @RequestBody NarudzbaDTO dto){
		
		Narudzba narudzba = toNarudzba.convert(dto);
		Narudzba sacuvana = narudzbaService.save(narudzba);
		
		return new ResponseEntity<NarudzbaDTO>(toDto.convert(sacuvana), HttpStatus.CREATED);
	}
}
