package model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "Odczyt")
public class Odczyt implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3262051193072441679L;

	@Id
	@GeneratedValue
	@Column(name = "odczytID")
	private Long odczytId;

	@Column(name="odczytData")
	@Temporal(TemporalType.DATE)
	private Date odczytData;

	@Column(name="okresOd")
	@Temporal(TemporalType.DATE)
	private Date odczytOkresPoczatek;

	@Column(name="okresDo")
	@Temporal(TemporalType.DATE)
	private Date odczytOkresKoniec;
	
	@Column(name="cieploGJ")
	private Double cieploGJ;
	
	@Column(name="cieploPLN")
	private Double cieploPLN;
	
	@Column(name="energiaKWH")
	private Double energiaKWH;
	
	@Column(name="energiaPLN")
	private Double energiaPLN;
	
	@Column(name="gazNM3")
	private Double gazNM3;
	
	@Column(name="gazPLN")
	private Double gazPLN;
	
	@Column(name="wodaM3")
	private Double wodaM3;
	
	@Column(name="wodaPLN")
	private Double wodaPLN;
	
	@ManyToOne
	@JoinColumn(name="obiektId", insertable=false, updatable=false)
	private Obiekt obiekt;

	private Long obiektId;

	public Long getOdczytId() {
		return odczytId;
	}

	public void setOdczytId(Long odczytId) {
		this.odczytId = odczytId;
	}

	public Date getOdczytData() {
		return odczytData;
	}

	public void setOdczytData(Date odczytData) {
		this.odczytData = odczytData;
	}

	public Date getOdczytOkresPoczatek() {
		return odczytOkresPoczatek;
	}

	public void setOdczytOkresPoczatek(Date odczytOkresPoczatek) {
		this.odczytOkresPoczatek = odczytOkresPoczatek;
	}

	public Date getOdczytOkresKoniec() {
		return odczytOkresKoniec;
	}

	public void setOdczytOkresKoniec(Date odczytOkresKoniec) {
		this.odczytOkresKoniec = odczytOkresKoniec;
	}

	public Double getCieploGJ() {
		return cieploGJ;
	}

	public void setCieploGJ(Double cieploGJ) {
		this.cieploGJ = cieploGJ;
	}

	public Double getCieploPLN() {
		return cieploPLN;
	}

	public void setCieploPLN(Double cieploPLN) {
		this.cieploPLN = cieploPLN;
	}

	public Double getEnergiaKWH() {
		return energiaKWH;
	}

	public void setEnergiaKWH(Double energiaKWH) {
		this.energiaKWH = energiaKWH;
	}

	public Double getEnergiaPLN() {
		return energiaPLN;
	}

	public void setEnergiaPLN(Double energiaPLN) {
		this.energiaPLN = energiaPLN;
	}

	public Double getGazNM3() {
		return gazNM3;
	}

	public void setGazNM3(Double gazNM3) {
		this.gazNM3 = gazNM3;
	}

	public Double getGazPLN() {
		return gazPLN;
	}

	public void setGazPLN(Double gazPLN) {
		this.gazPLN = gazPLN;
	}

	public Double getWodaM3() {
		return wodaM3;
	}

	public void setWodaM3(Double wodaM3) {
		this.wodaM3 = wodaM3;
	}

	public Double getWodaPLN() {
		return wodaPLN;
	}

	public void setWodaPLN(Double wodaPLN) {
		this.wodaPLN = wodaPLN;
	}

	public Long getObiektId() {
		return obiektId;
	}

	public void setObiektId(Long obiektId) {
		this.obiektId = obiektId;
	}
	
}
