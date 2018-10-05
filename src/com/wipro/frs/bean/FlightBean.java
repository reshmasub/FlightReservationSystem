/*
 *
 * Copyright 2014 Wipro Technologies All rights reserved.
 * 
 * Customer specific copyright notice     :
 *
 * File Name       : FlightBean.java
 *
 * Description     :Project desc.
 *
 * Version         : 1.0.0.
 *
 * Created Date    :Oct 28, 2014
 * 
 */
package com.wipro.frs.bean;

/**
 *
 * @author Reshma Subramaniam
 * @version 1.0 
 * @since 1.0
 * Date : Oct 28, 2014
 */
public class FlightBean {
	private String flightID;
	private String flightName;
	private int seatingCapacity;
	private int reservationCapacity;
	/**
	 * @return flightID
	 */
	public String getFlightID() {
		return flightID;
	}
	/**
	 * @param flightID 
	 */
	public void setFlightID(String flightID) {
		this.flightID = flightID;
	}
	/**
	 * @return flightName
	 */
	public String getFlightName() {
		return flightName;
	}
	/**
	 * @param flightName 
	 */
	public void setFlightName(String flightName) {
		this.flightName = flightName;
	}
	/**
	 * @return seatingCapacity
	 */
	public int getSeatingCapacity() {
		return seatingCapacity;
	}
	/**
	 * @param seatingCapacity 
	 */
	public void setSeatingCapacity(int seatingCapacity) {
		this.seatingCapacity = seatingCapacity;
	}
	/**
	 * @return reservationCapacity
	 */
	public int getReservationCapacity() {
		return reservationCapacity;
	}
	/**
	 * @param reservationCapacity 
	 */
	public void setReservationCapacity(int reservationCapacity) {
		this.reservationCapacity = reservationCapacity;
	}
	
}
