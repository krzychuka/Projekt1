package bean;

import java.util.Date;

public class BudynekDaneBean {

	private Long id;
	//private Long id_grupa;
	private String nazwa;
	private String adres;
	private String administrator;
	private Date rokBudowy;
	private Integer liczbaKondygnacji;
	private Integer liczbaKlatek;
	private Integer liczbaLokaliMieszkalnych;
	private Integer liczbaLokaliMieszkalnychGaz;
	private Integer liczbaMieszkancow;
	private Double powierzchniaUzytkowaMieszkan;
	private Double powierzchniaUzytkowaNieszkanGaz;
	private Double powierzchniaUzytkowaNiemieszkalna;
	private Double powierzchniaUzytkowaBudynku;
	private Double kubatura;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNazwa() {
		return nazwa;
	}
	public void setNazwa(String nazwa) {
		this.nazwa = nazwa;
	}
	public String getAdres() {
		return adres;
	}
	public void setAdres(String adres) {
		this.adres = adres;
	}
	public String getAdministrator() {
		return administrator;
	}
	public void setAdministrator(String administrator) {
		this.administrator = administrator;
	}
	public Date getRokBudowy() {
		return rokBudowy;
	}
	public void setRokBudowy(Date rokBudowy) {
		this.rokBudowy = rokBudowy;
	}
	public Integer getLiczbaKondygnacji() {
		return liczbaKondygnacji;
	}
	public void setLiczbaKondygnacji(Integer liczbaKondygnacji) {
		this.liczbaKondygnacji = liczbaKondygnacji;
	}
	public Integer getLiczbaKlatek() {
		return liczbaKlatek;
	}
	public void setLiczbaKlatek(Integer liczbaKlatek) {
		this.liczbaKlatek = liczbaKlatek;
	}
	public Integer getLiczbaLokaliMieszkalnych() {
		return liczbaLokaliMieszkalnych;
	}
	public void setLiczbaLokaliMieszkalnych(Integer liczbaLokaliMieszkalnych) {
		this.liczbaLokaliMieszkalnych = liczbaLokaliMieszkalnych;
	}
	public Integer getLiczbaLokaliMieszkalnychGaz() {
		return liczbaLokaliMieszkalnychGaz;
	}
	public void setLiczbaLokaliMieszkalnychGaz(Integer liczbaLokaliMieszkalnychGaz) {
		this.liczbaLokaliMieszkalnychGaz = liczbaLokaliMieszkalnychGaz;
	}
	public Integer getLiczbaMieszkancow() {
		return liczbaMieszkancow;
	}
	public void setLiczbaMieszkancow(Integer liczbaMieszkancow) {
		this.liczbaMieszkancow = liczbaMieszkancow;
	}
	public Double getPowierzchniaUzytkowaMieszkan() {
		return powierzchniaUzytkowaMieszkan;
	}
	public void setPowierzchniaUzytkowaMieszkan(Double powierzchniaUzytkowaMieszkan) {
		this.powierzchniaUzytkowaMieszkan = powierzchniaUzytkowaMieszkan;
	}
	public Double getPowierzchniaUzytkowaNieszkanGaz() {
		return powierzchniaUzytkowaNieszkanGaz;
	}
	public void setPowierzchniaUzytkowaNieszkanGaz(
			Double powierzchniaUzytkowaNieszkanGaz) {
		this.powierzchniaUzytkowaNieszkanGaz = powierzchniaUzytkowaNieszkanGaz;
	}
	public Double getPowierzchniaUzytkowaNiemieszkalna() {
		return powierzchniaUzytkowaNiemieszkalna;
	}
	public void setPowierzchniaUzytkowaNiemieszkalna(
			Double powierzchniaUzytkowaNiemieszkalna) {
		this.powierzchniaUzytkowaNiemieszkalna = powierzchniaUzytkowaNiemieszkalna;
	}
	public Double getPowierzchniaUzytkowaBudynku() {
		return powierzchniaUzytkowaBudynku;
	}
	public void setPowierzchniaUzytkowaBudynku(Double powierzchniaUzytkowaBudynku) {
		this.powierzchniaUzytkowaBudynku = powierzchniaUzytkowaBudynku;
	}
	public Double getKubatura() {
		return kubatura;
	}
	public void setKubatura(Double kubatura) {
		this.kubatura = kubatura;
	}

}
