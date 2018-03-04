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

import org.springframework.data.jpa.repository.query.Procedure;

/**
 * @author Maciej Strzeminski
 *
 * 2018
 */

@Entity(name="Rooms")
public class Room implements Serializable {

	private static final long serialVersionUID = -2945065247519662943L;

	@Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "idroom")
    private Long id;
	
	@Column(name = "number")
	private Integer number;
	
	@Column(name = "max_person")
	private Integer maxPerson;
	
	@Column(name = "size")
	private Integer size;
	
	@Column(name = "floor")
	private Integer floor;

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
	 * @return the number
	 */
	public Integer getNumber() {
		return number;
	}

	/**
	 * @param number the number to set
	 */
	public void setNumber(Integer number) {
		this.number = number;
	}

	/**
	 * @return the maxPerson
	 */
	public Integer getMaxPerson() {
		return maxPerson;
	}

	/**
	 * @param maxPerson the maxPerson to set
	 */
	public void setMaxPerson(Integer maxPerson) {
		this.maxPerson = maxPerson;
	}

	/**
	 * @return the size
	 */
	public Integer getSize() {
		return size;
	}

	/**
	 * @param size the size to set
	 */
	public void setSize(Integer size) {
		this.size = size;
	}

	/**
	 * @return the floor
	 */
	public Integer getFloor() {
		return floor;
	}

	/**
	 * @param floor the floor to set
	 */
	public void setFloor(Integer floor) {
		this.floor = floor;
	}
	
}
