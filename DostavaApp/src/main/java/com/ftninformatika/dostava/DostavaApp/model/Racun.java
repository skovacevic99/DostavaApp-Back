package com.ftninformatika.dostava.DostavaApp.model;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Racun {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
	
	@Column(unique = true, nullable = false)
	private int brojRacuna;
	
	@Column(nullable = false)
	private LocalDateTime datum;
	
	@Column(nullable = false)
	private double ukupnaCena;
	
	@OneToOne(mappedBy = "racun")
	private Narudzba narudzba;

	public Racun() {
	}

	public Racun(int brojRacuna, LocalDateTime datum, double ukupnaCena, Narudzba narudzba) {
		this.brojRacuna = brojRacuna;
		this.datum = datum;
		this.ukupnaCena = ukupnaCena;
		this.narudzba = narudzba;
	}

	public Racun(Long id, int brojRacuna, LocalDateTime datum, double ukupnaCena, Narudzba narudzba) {
		this.id = id;
		this.brojRacuna = brojRacuna;
		this.datum = datum;
		this.ukupnaCena = ukupnaCena;
		this.narudzba = narudzba;
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
		Racun other = (Racun) obj;
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

	public Narudzba getNarudzba() {
		return narudzba;
	}

	public void setNarudzba(Narudzba narudzba) {
		this.narudzba = narudzba;
	}

	@Override
	public String toString() {
		return "Racun [id=" + id + ", brojRacuna=" + brojRacuna + ", datum=" + datum + ", ukupnaCena=" + ukupnaCena
				+ "]";
	}
	
}
