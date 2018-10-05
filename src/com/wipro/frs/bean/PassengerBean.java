/*
 *
 * Copyright 2014 Wipro Technologies All rights reserved.
 * 
 * Customer specific copyright notice     :
 *
 * File Name       : PassengerBean.java
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
 * @author Reshma Subramaniam
 * @version 1.0 
 * @since 1.0
 * Date : Oct 28, 2014
 */
public class PassengerBean {
  private String reservationID;
  private String name;
  private String gender;
  private int age;
  private int seatNo;
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
 * @return name
 */
public String getName() {
	return name;
}
/**
 * @param name 
 */
public void setName(String name) {
	this.name = name;
}
/**
 * @return gender
 */
public String getGender() {
	return gender;
}
/**
 * @param gender 
 */
public void setGender(String gender) {
	this.gender = gender;
}
/**
 * @return age
 */
public int getAge() {
	return age;
}
/**
 * @param age 
 */
public void setAge(int age) {
	this.age = age;
}
/**
 * @return seatNo
 */
public int getSeatNo() {
	return seatNo;
}
/**
 * @param seatNo 
 */
public void setSeatNo(int seatNo) {
	this.seatNo = seatNo;
}
}
