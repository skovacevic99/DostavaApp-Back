package com.ftninformatika.dostava.DostavaApp.web.dto;

import javax.validation.constraints.Positive;

public class DostavljacDTO {

	 @Positive(message = "Id mora biti pozitivan broj.")
	 private Long id;
	 
	 private String jmbg;
	 
	 private String brojLK;
	 
	 private String imeIPrezime;

	public DostavljacDTO() {
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getJmbg() {
		return jmbg;
	}

	public void setJmbg(String jmbg) {
		this.jmbg = jmbg;
	}

	public String getBrojLK() {
		return brojLK;
	}

	public void setBrojLK(String brojLK) {
		this.brojLK = brojLK;
	}

	public String getImeIPrezime() {
		return imeIPrezime;
	}

	public void setImeIPrezime(String imeIPrezime) {
		this.imeIPrezime = imeIPrezime;
	}
	 
}
