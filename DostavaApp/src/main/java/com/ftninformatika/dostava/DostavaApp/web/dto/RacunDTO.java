package com.ftninformatika.dostava.DostavaApp.web.dto;

import java.time.LocalDateTime;

import javax.validation.constraints.Positive;

public class RacunDTO {

	@Positive(message = "Id mora biti pozitivan broj.")
	private Long id;
	
	private int brojRacuna;
	
	private LocalDateTime datum;
	
	private double ukupnaCena;
	
	private Long narudzbaId;
	
	private int brojNarudzbe;

	public RacunDTO() {
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public int getBrojRacuna() {
		return brojRacuna;
	}

	public void setBrojRacuna(int brojRacuna) {
		this.brojRacuna = brojRacuna;
	}

	public LocalDateTime getDatum() {
		return datum;
	}

	public void setDatum(LocalDateTime datum) {
		this.datum = datum;
	}

	public double getUkupnaCena() {
		return ukupnaCena;
	}

	public void setUkupnaCena(double ukupnaCena) {
		this.ukupnaCena = ukupnaCena;
	}

	public Long getNarudzbaId() {
		return narudzbaId;
	}

	public void setNarudzbaId(Long narudzbaId) {
		this.narudzbaId = narudzbaId;
	}

	public int getBrojNarudzbe() {
		return brojNarudzbe;
	}

	public void setBrojNarudzbe(int brojNarudzbe) {
		this.brojNarudzbe = brojNarudzbe;
	}
	
}
