/**
 * Praca inzynierska
 */
package com.github.strzemin.controller;

/**
 * @author Maciej Strzeminski
 *
 *         2018
 */
public class InfoDto {

	private long id;
	private String pong;
	
	/**
	 * @param id
	 */
	public InfoDto(long id) {
		super();
		this.id = id;
	}
	
	
	/**
	 * @param id
	 * @param pong
	 */
	public InfoDto(long id, String pong) {
		super();
		this.id = id;
		this.pong = pong;
	}


	/**
	 * @return the pong
	 */
	public String getPong() {
		return pong;
	}


	/**
	 * @param pong the pong to set
	 */
	public void setPong(String pong) {
		this.pong = pong;
	}


	/**
	 * @return the id
	 */
	public long getId() {
		return id;
	}
	
	/**
	 * @return the id
	 */
	public void setId(long id) {
		this.id = id;
	}
	
}
