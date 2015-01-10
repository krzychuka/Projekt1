package bean;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.format.annotation.NumberFormat;
import org.springframework.format.annotation.NumberFormat.Style;

public class ObiektBean {

	private Long id;
	
	@NotEmpty(message="Proszê wype³niæ pole")
	private String nazwa;
	
	@NotNull(message="Proszê wype³niæ pole")
	@NumberFormat(style=Style.NUMBER)
	private Double powierzchnia;
	
	@NotNull(message="Proszê wype³niæ pole")
	@NumberFormat(style=Style.NUMBER)
	private Double kubatura;
	
	@NotNull(message="Proszê wype³niæ pole")
	@NumberFormat(style=Style.NUMBER)
	private Integer liczbaUzytkownikow;
	
	private Boolean czyCalodobowy;

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

	public Double getPowierzchnia() {
		return powierzchnia;
	}

	public void setPowierzchnia(Double powierzchnia) {
		this.powierzchnia = powierzchnia;
	}

	public Double getKubatura() {
		return kubatura;
	}

	public void setKubatura(Double kubatura) {
		this.kubatura = kubatura;
	}

	public Integer getLiczbaUzytkownikow() {
		return liczbaUzytkownikow;
	}

	public void setLiczbaUzytkownikow(Integer liczbaUzytkownikow) {
		this.liczbaUzytkownikow = liczbaUzytkownikow;
	}

	public Boolean getCzyCalodobowy() {
		return czyCalodobowy;
	}

	public void setCzyCalodobowy(Boolean czyCalodobowy) {
		this.czyCalodobowy = czyCalodobowy;
	}

}
