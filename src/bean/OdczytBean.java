package bean;

import java.util.Date;

public class OdczytBean {
	
	private Long id;
	private Date data;
	private Date okresPoczatek;
	private Date okresKoniec;
	private Long obiektId;
	private Double cieploGJ;
	private Double cieploPLN;
	private Double energiaKWH;
	private Double energiaPLN;
	private Double gazNM3;
	private Double gazPLN;
	private Double wodaM3;
	private Double wodaPLN;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Date getData() {
		return data;
	}
	public void setData(Date data) {
		this.data = data;
	}
	public Date getOkresPoczatek() {
		return okresPoczatek;
	}
	public void setOkresPoczatek(Date okresPoczatek) {
		this.okresPoczatek = okresPoczatek;
	}
	public Date getOkresKoniec() {
		return okresKoniec;
	}
	public void setOkresKoniec(Date okresKoniec) {
		this.okresKoniec = okresKoniec;
	}
	public Long getObiektId() {
		return obiektId;
	}
	public void setObiektId(Long obiektId) {
		this.obiektId = obiektId;
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

}
