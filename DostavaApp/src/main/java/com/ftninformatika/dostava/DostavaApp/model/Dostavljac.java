package com.ftninformatika.dostava.DostavaApp.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Dostavljac {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(nullable = false, unique = true)
	private String jmbg;
	
	@Column(nullable = false, unique = true)
	private String brojLK;
	
	@Column(nullable = false)
	private String imeIPrezime;
	
	@OneToMany(mappedBy = "dostavljac")
	private List<Narudzba> narudzbine = new ArrayList<Narudzba>();

	public Dostavljac() {
	}

	public Dostavljac(String jmbg, String brojLK, String imeIPrezime) {
		this.jmbg = jmbg;
		this.brojLK = brojLK;
		this.imeIPrezime = imeIPrezime;
	}

	public Dostavljac(Long id, String jmbg, String brojLK, String imeIPrezime) {
		this.id = id;
		this.jmbg = jmbg;
		this.brojLK = brojLK;
		this.imeIPrezime = imeIPrezime;
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
		Dostavljac other = (Dostavljac) obj;
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
	
	public List<Narudzba> getNarudzbine() {
		return narudzbine;
	}

	public void setNarudzbine(List<Narudzba> narudzbine) {
		this.narudzbine = narudzbine;
	}

	@Override
	public String toString() {
		return "Dostavljac [id=" + id + ", jmbg=" + jmbg + ", brojLK=" + brojLK + ", imeIPrezime=" + imeIPrezime + "]";
	}
	
}
