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
 *         2018
 */
@Entity(name = "parking")
public class Parking implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idParking")
	private Long id;

	@Column(name = "Marka")
	private String Marka;

	@Column(name = "Model")
	private String Model;

	@Column(name = "Numer_rejstracyjny")
	private String Numer_rejstracyjny;

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
	 * @return the marka
	 */
	public String getMarka() {
		return Marka;
	}

	/**
	 * @param marka the marka to set
	 */
	public void setMarka(String marka) {
		Marka = marka;
	}

	/**
	 * @return the model
	 */
	public String getModel() {
		return Model;
	}

	/**
	 * @param model the model to set
	 */
	public void setModel(String model) {
		Model = model;
	}

	/**
	 * @return the numer_rejstracyjny
	 */
	public String getNumer_rejstracyjny() {
		return Numer_rejstracyjny;
	}

	/**
	 * @param numer_rejstracyjny the numer_rejstracyjny to set
	 */
	public void setNumer_rejstracyjny(String numer_rejstracyjny) {
		Numer_rejstracyjny = numer_rejstracyjny;
	}


	

}
