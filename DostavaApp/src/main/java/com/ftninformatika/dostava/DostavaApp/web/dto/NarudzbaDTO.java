package com.ftninformatika.dostava.DostavaApp.web.dto;

import java.time.LocalDateTime;

import javax.validation.constraints.Positive;

import org.hibernate.validator.constraints.Length;


public class NarudzbaDTO {

	@Positive(message = "Id mora biti pozitivan broj.")
	 private Long id;
	
	@Positive(message = "Broj narudzbine mora biti pozitivan broj.")
	private int brNarudzbe;
	
	private LocalDateTime datum;
	
	@Length(max = 50, message = "Mesto isporuke moze sadrzati maksimalno 50 karaktera")
	private String mestoIsporuke;
	
	private double cena;
	
	private String opis;
	
	private Long dostavljacId;
	
	private String dostavljacIme;
	
	private Long racunId;

	public NarudzbaDTO() {
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public int getBrNarudzbe() {
		return brNarudzbe;
	}

	public void setBrNarudzbe(int brNarudzbe) {
		this.brNarudzbe = brNarudzbe;
	}

	public LocalDateTime getDatum() {
		return datum;
	}

	public void setDatum(LocalDateTime datum) {
		this.datum = datum;
	}

	public String getMestoIsporuke() {
		return mestoIsporuke;
	}

	public void setMestoIsporuke(String mestoIsporuke) {
		this.mestoIsporuke = mestoIsporuke;
	}

	public double getCena() {
		return cena;
	}

	public void setCena(double cena) {
		this.cena = cena;
	}

	public String getOpis() {
		return opis;
	}

	public void setOpis(String opis) {
		this.opis = opis;
	}

	public Long getDostavljacId() {
		return dostavljacId;
	}

	public void setDostavljacId(Long dostavljacId) {
		this.dostavljacId = dostavljacId;
	}

	public Long getRacunId() {
		return racunId;
	}

	public void setRacunId(Long racunId) {
		this.racunId = racunId;
	}

	public String getDostavljacIme() {
		return dostavljacIme;
	}

	public void setDostavljacIme(String dostavljacIme) {
		this.dostavljacIme = dostavljacIme;
	}
	
}
