/*
 *
 * Copyright 2014 Wipro Technologies All rights reserved.
 * 
 * Customer specific copyright notice     :
 *
 * File Name       : ReservationBean.java
 *
 * Description     :Project desc.
 *
 * Version         : 1.0.0.
 *
 * Created Date    :Oct 28, 2014
 * 
 */
package com.wipro.frs.bean;

import java.sql.Date;

/**
 *
 * @author Reshma Subramaniam
 * @version 1.0 
 * @since 1.0
 * Date : Oct 28, 2014
 */
public class ReservationBean {
  private String reservationID;
  private String userID;
  private String scheduleID;
  private String reservationType;
  private Date bookingDate;
  private Date journeyDate;
  private int noOfSeats;
  private double totalFare;
  private int bookingStatus;
/**
 * @return reservationID
 */
public String getReservationID() {
	return reservationID;
}
/**
 * @param reservationID 
 */
public void setReservationID(String reservationID) {
	this.reservationID = reservationID;
}
/**
 * @return userID
 */
public String getUserID() {
	return userID;
}
/**
 * @param userID 
 */
public void setUserID(String userID) {
	this.userID = userID;
}
/**
 * @return scheduleID
 */
public String getScheduleID() {
	return scheduleID;
}
/**
 * @param scheduleID 
 */
public void setScheduleID(String scheduleID) {
	this.scheduleID = scheduleID;
}
/**
 * @return reservationType
 */
public String getReservationType() {
	return reservationType;
}
/**
 * @param reservationType 
 */
public void setReservationType(String reservationType) {
	this.reservationType = reservationType;
}
/**
 * @return bookingDate
 */
public Date getBookingDate() {
	return bookingDate;
}
/**
 * @param bookingDate 
 */
public void setBookingDate(Date bookingDate) {
	this.bookingDate = bookingDate;
}
/**
 * @return journeyDate
 */
public Date getJourneyDate() {
	return journeyDate;
}
/**
 * @param journeyDate 
 */
public void setJourneyDate(Date journeyDate) {
	this.journeyDate = journeyDate;
}
/**
 * @return noOfSeats
 */
public int getNoOfSeats() {
	return noOfSeats;
}
/**
 * @param noOfSeats 
 */
public void setNoOfSeats(int noOfSeats) {
	this.noOfSeats = noOfSeats;
}
/**
 * @return totalFare
 */
public double getTotalFare() {
	return totalFare;
}
/**
 * @param totalFare 
 */
public void setTotalFare(double totalFare) {
	this.totalFare = totalFare;
}
/**
 * @return bookingStatus
 */
public int getBookingStatus() {
	return bookingStatus;
}
/**
 * @param bookingStatus 
 */
public void setBookingStatus(int bookingStatus) {
	this.bookingStatus = bookingStatus;
}
}
