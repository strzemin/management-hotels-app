/**
 * Praca inzynierska
 */
package com.github.strzemin.db.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * @author Maciej Strzeminski
 *
 * 2018
 */
@Entity(name = "klienci")
public class Klienci  implements Serializable {


	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "idklienci")
    private Long id;
	
	@Column(name = "Nazwa_firmy")
	private String Nazwa_firmy;
	
	@Column(name = "Imie_klienta")
	private String Imie_klienta;
	
	@Column(name = "Nazwisko_klienta")
	private String Nazwisko_klienta;
	
	@Column(name = "Miejscowosc_kod")
	private String Miejscowosc_kod;

	
	@Column(name = "Ulica_klienta")
	private String Ulica_klienta;
	
	@Column(name = "Telefon_klienta")
	private Integer Telefon_klienta;
	
	@Column(name = "Rezerwacja")
	private Integer Rezerwacja;

	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * @return the nazwa_firmy
	 */
	public String getNazwa_firmy() {
		return Nazwa_firmy;
	}

	/**
	 * @param nazwa_firmy the nazwa_firmy to set
	 */
	public void setNazwa_firmy(String nazwa_firmy) {
		Nazwa_firmy = nazwa_firmy;
	}

	/**
	 * @return the imie_klienta
	 */
	public String getImie_klienta() {
		return Imie_klienta;
	}

	/**
	 * @param imie_klienta the imie_klienta to set
	 */
	public void setImie_klienta(String imie_klienta) {
		Imie_klienta = imie_klienta;
	}

	/**
	 * @return the nazwisko_klienta
	 */
	public String getNazwisko_klienta() {
		return Nazwisko_klienta;
	}

	/**
	 * @param nazwisko_klienta the nazwisko_klienta to set
	 */
	public void setNazwisko_klienta(String nazwisko_klienta) {
		Nazwisko_klienta = nazwisko_klienta;
	}

	/**
	 * @return the miejscowosc_kod
	 */
	public String getMiejscowosc_kod() {
		return Miejscowosc_kod;
	}

	/**
	 * @param miejscowosc_kod the miejscowosc_kod to set
	 */
	public void setMiejscowosc_kod(String miejscowosc_kod) {
		Miejscowosc_kod = miejscowosc_kod;
	}

	/**
	 * @return the ulica_klienta
	 */
	public String getUlica_klienta() {
		return Ulica_klienta;
	}

	/**
	 * @param ulica_klienta the ulica_klienta to set
	 */
	public void setUlica_klienta(String ulica_klienta) {
		Ulica_klienta = ulica_klienta;
	}

	/**
	 * @return the telefon_klienta
	 */
	public Integer getTelefon_klienta() {
		return Telefon_klienta;
	}

	/**
	 * @param telefon_klienta the telefon_klienta to set
	 */
	public void setTelefon_klienta(Integer telefon_klienta) {
		Telefon_klienta = telefon_klienta;
	}

	/**
	 * @return the rezerwacja
	 */
	public Integer getRezerwacja() {
		return Rezerwacja;
	}

	/**
	 * @param rezerwacja the rezerwacja to set
	 */
	public void setRezerwacja(Integer rezerwacja) {
		Rezerwacja = rezerwacja;
	}

	/**
	 * @return the serialversionuid
	 */
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	



}
