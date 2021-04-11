package com.ftninformatika.dostava.DostavaApp.model;

import java.time.LocalDateTime;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class Narudzba {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(nullable = false, unique = true)
	private int brNarudzbe;
	
	@Column(nullable = false)
	private LocalDateTime datum;
	
	@Column(nullable = false)
	private String mestoIsporuke;
	
	@Column
	private double cena;
	
	@Column
	private String opis;
	
	@ManyToOne
	private Dostavljac dostavljac;
	
	@OneToOne(cascade = CascadeType.ALL)
	private Racun racun;

	public Narudzba() {
	}

	public Narudzba(Long id, int brNarudzbe, LocalDateTime datum, String mestoIsporuke, double cena, String opis,
			Dostavljac dostavljac, Racun racun) {
		this.id = id;
		this.brNarudzbe = brNarudzbe;
		this.datum = datum;
		this.mestoIsporuke = mestoIsporuke;
		this.cena = cena;
		this.opis = opis;
		this.dostavljac = dostavljac;
		this.racun = racun;
	}


	public Narudzba(int brNarudzbe, LocalDateTime datum, String mestoIsporuke, double cena, String opis,
			Dostavljac dostavljac, Racun racun) {
		this.brNarudzbe = brNarudzbe;
		this.datum = datum;
		this.mestoIsporuke = mestoIsporuke;
		this.cena = cena;
		this.opis = opis;
		this.dostavljac = dostavljac;
		this.racun = racun;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Narudzba other = (Narudzba) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
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

	public Dostavljac getDostavljac() {
		return dostavljac;
	}

	public void setDostavljac(Dostavljac dostavljac) {
		this.dostavljac = dostavljac;
	}

	public Racun getRacun() {
		return racun;
	}

	public void setRacun(Racun racun) {
		this.racun = racun;
	}

	@Override
	public String toString() {
		return "Narudzba [id=" + id + ", brNarudzbe=" + brNarudzbe + ", datum=" + datum + ", mestoIsporuke="
				+ mestoIsporuke + ", cena=" + cena + ", opis=" + opis + ", dostavljac=" + dostavljac + ", racun="
				+ racun + "]";
	}

}
