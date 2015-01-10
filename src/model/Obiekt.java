package model;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import model.Odczyt;

@Entity
@Table(name = "OBIEKT")
public class Obiekt implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="obiektId")
	private Long obiektId;
	
	@Column(name="NAZWA")
	private String obiektNazwa;
	
	@Column(name="POWIERZCHNIA")
	private Double obiektPowierzchnia;
	
	@Column(name="KUBATURA")
	private Double obiektKubatura;
	
	@Column(name="LICZBA_UZYTKOWNIKOW")
	private Integer obiektLiczbaUzytkownikow;
	
	@Column(name="CZYCALODOBOWY")
	private Boolean obiektCzyCalodobowy;
	
	@OneToMany(mappedBy="obiekt")
	@OnDelete(action=OnDeleteAction.CASCADE)
	private Set<Odczyt> odczyty;

	public Long getObiektId() {
		return obiektId;
	}

	public void setObiektId(Long obiektId) {
		this.obiektId = obiektId;
	}

	public String getObiektNazwa() {
		return obiektNazwa;
	}

	public void setObiektNazwa(String obiektNazwa) {
		this.obiektNazwa = obiektNazwa;
	}

	public Double getObiektPowierzchnia() {
		return obiektPowierzchnia;
	}

	public void setObiektPowierzchnia(Double obiektPowierzchnia) {
		this.obiektPowierzchnia = obiektPowierzchnia;
	}

	public Double getObiektKubatura() {
		return obiektKubatura;
	}

	public void setObiektKubatura(Double obiektKubatura) {
		this.obiektKubatura = obiektKubatura;
	}

	public Integer getObiektLiczbaUzytkownikow() {
		return obiektLiczbaUzytkownikow;
	}

	public void setObiektLiczbaUzytkownikow(Integer obiektLiczbaUzytkownikow) {
		this.obiektLiczbaUzytkownikow = obiektLiczbaUzytkownikow;
	}

	public Boolean isObiektCzyCalodobowy() {
		return obiektCzyCalodobowy;
	}

	public void setObiektCzyCalodobowy(Boolean obiektCzyCalodobowy) {
		this.obiektCzyCalodobowy = obiektCzyCalodobowy;
	}

	public Set<Odczyt> getOdczyty() {
		return odczyty;
	}

	public void setOdczyty(Set<Odczyt> odczyty) {
		this.odczyty = odczyty;
	}

	public Boolean getObiektCzyCalodobowy() {
		return obiektCzyCalodobowy;
	}

}
