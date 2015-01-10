package model;

import java.io.Serializable;
import java.util.Date;
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

@Entity
@Table(name="BudynekDane")
public class BudynekDane implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="BudynekDaneId")
	private Long budynekDaneId;
	
	//private Long id_grupa;
	
	@Column(name="BudynekDaneNazwa")
	private String budynekDaneNazwa;
	
	@Column(name="BudynekDaneAdres")
	private String budynekDaneAdres;
	
	@Column(name="BudynekDaneAdministrator")
	private String budynekDaneAdministrator;
	
	@Column(name="BudynekDaneRokBudowy")
	private Date budynekDaneRokBudowy;
	
	@Column(name="BudynekDaneLiczbaKondygnacji")
	private Integer budynekDaneLiczbaKondygnacji;
	
	@Column(name="BudynekDaneLiczbaKlatek")
	private Integer budynekDaneLiczbaKlatek;
	
	@Column(name="BudynekDaneLiczbaLokaliMieszkalnych")
	private Integer budynekDaneLiczbaLokaliMieszkalnych;
	
	@Column(name="BudynekDaneLiczbaLokaliMieszkalnychGaz")
	private Integer budynekDaneLiczbaLokaliMieszkalnychGaz;
	
	@Column(name="BudynekDaneLiczbaMieszkancow")
	private Integer budynekDaneLiczbaMieszkancow;
	
	@Column(name="BudynekDanePowierzchniaUzytkowaMieszkan")
	private Double budynekDanePowierzchniaUzytkowaMieszkan;
	
	@Column(name="BudynekDanePowierzchniaUzytkowaNieszkanGaz")
	private Double budynekDanePowierzchniaUzytkowaNieszkanGaz;
	
	@Column(name="BudynekDanePowierzchniaUzytkowaNiemieszkalna")
	private Double budynekDanePowierzchniaUzytkowaNiemieszkalna;
	
	@Column(name="BudynekDanePowierzchniaUzytkowaBudynku")
	private Double budynekDanePowierzchniaUzytkowaBudynku;
	
	@Column(name="BudynekDaneKubatura")
	private Double budynekDaneKubatura;
	
	@OneToMany(mappedBy="budynekDane")
	@OnDelete(action=OnDeleteAction.CASCADE)
	private Set<BudynekZuzycie> zuzycia;

	public Long getBudynekDaneId() {
		return budynekDaneId;
	}

	public void setBudynekDaneId(Long budynekDaneId) {
		this.budynekDaneId = budynekDaneId;
	}

	public String getBudynekDaneNazwa() {
		return budynekDaneNazwa;
	}

	public void setBudynekDaneNazwa(String budynekDaneNazwa) {
		this.budynekDaneNazwa = budynekDaneNazwa;
	}

	public String getBudynekDaneAdres() {
		return budynekDaneAdres;
	}

	public void setBudynekDaneAdres(String budynekDaneAdres) {
		this.budynekDaneAdres = budynekDaneAdres;
	}

	public String getBudynekDaneAdministrator() {
		return budynekDaneAdministrator;
	}

	public void setBudynekDaneAdministrator(String budynekDaneAdministrator) {
		this.budynekDaneAdministrator = budynekDaneAdministrator;
	}

	public Date getBudynekDaneRokBudowy() {
		return budynekDaneRokBudowy;
	}

	public void setBudynekDaneRokBudowy(Date budynekDaneRokBudowy) {
		this.budynekDaneRokBudowy = budynekDaneRokBudowy;
	}

	public Integer getBudynekDaneLiczbaKondygnacji() {
		return budynekDaneLiczbaKondygnacji;
	}

	public void setBudynekDaneLiczbaKondygnacji(Integer budynekDaneLiczbaKondygnacji) {
		this.budynekDaneLiczbaKondygnacji = budynekDaneLiczbaKondygnacji;
	}

	public Integer getBudynekDaneLiczbaKlatek() {
		return budynekDaneLiczbaKlatek;
	}

	public void setBudynekDaneLiczbaKlatek(Integer budynekDaneLiczbaKlatek) {
		this.budynekDaneLiczbaKlatek = budynekDaneLiczbaKlatek;
	}

	public Integer getBudynekDaneLiczbaLokaliMieszkalnych() {
		return budynekDaneLiczbaLokaliMieszkalnych;
	}

	public void setBudynekDaneLiczbaLokaliMieszkalnych(
			Integer budynekDaneLiczbaLokaliMieszkalnych) {
		this.budynekDaneLiczbaLokaliMieszkalnych = budynekDaneLiczbaLokaliMieszkalnych;
	}

	public Integer getBudynekDaneLiczbaLokaliMieszkalnychGaz() {
		return budynekDaneLiczbaLokaliMieszkalnychGaz;
	}

	public void setBudynekDaneLiczbaLokaliMieszkalnychGaz(
			Integer budynekDaneLiczbaLokaliMieszkalnychGaz) {
		this.budynekDaneLiczbaLokaliMieszkalnychGaz = budynekDaneLiczbaLokaliMieszkalnychGaz;
	}

	public Integer getBudynekDaneLiczbaMieszkancow() {
		return budynekDaneLiczbaMieszkancow;
	}

	public void setBudynekDaneLiczbaMieszkancow(Integer budynekDaneLiczbaMieszkancow) {
		this.budynekDaneLiczbaMieszkancow = budynekDaneLiczbaMieszkancow;
	}

	public Double getBudynekDanePowierzchniaUzytkowaMieszkan() {
		return budynekDanePowierzchniaUzytkowaMieszkan;
	}

	public void setBudynekDanePowierzchniaUzytkowaMieszkan(
			Double budynekDanePowierzchniaUzytkowaMieszkan) {
		this.budynekDanePowierzchniaUzytkowaMieszkan = budynekDanePowierzchniaUzytkowaMieszkan;
	}

	public Double getBudynekDanePowierzchniaUzytkowaNieszkanGaz() {
		return budynekDanePowierzchniaUzytkowaNieszkanGaz;
	}

	public void setBudynekDanePowierzchniaUzytkowaNieszkanGaz(
			Double budynekDanePowierzchniaUzytkowaNieszkanGaz) {
		this.budynekDanePowierzchniaUzytkowaNieszkanGaz = budynekDanePowierzchniaUzytkowaNieszkanGaz;
	}

	public Double getBudynekDanePowierzchniaUzytkowaNiemieszkalna() {
		return budynekDanePowierzchniaUzytkowaNiemieszkalna;
	}

	public void setBudynekDanePowierzchniaUzytkowaNiemieszkalna(
			Double budynekDanePowierzchniaUzytkowaNiemieszkalna) {
		this.budynekDanePowierzchniaUzytkowaNiemieszkalna = budynekDanePowierzchniaUzytkowaNiemieszkalna;
	}

	public Double getBudynekDanePowierzchniaUzytkowaBudynku() {
		return budynekDanePowierzchniaUzytkowaBudynku;
	}

	public void setBudynekDanePowierzchniaUzytkowaBudynku(
			Double budynekDanePowierzchniaUzytkowaBudynku) {
		this.budynekDanePowierzchniaUzytkowaBudynku = budynekDanePowierzchniaUzytkowaBudynku;
	}

	public Double getBudynekDaneKubatura() {
		return budynekDaneKubatura;
	}

	public void setBudynekDaneKubatura(Double budynekDaneKubatura) {
		this.budynekDaneKubatura = budynekDaneKubatura;
	}

	public Set<BudynekZuzycie> getZuzycia() {
		return zuzycia;
	}

	public void setZuzycia(Set<BudynekZuzycie> zuzycia) {
		this.zuzycia = zuzycia;
	}
	
}
