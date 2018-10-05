/*
 *
 * Copyright 2014 Wipro Technologies All rights reserved.
 * 
 * Customer specific copyright notice     :
 *
 * File Name       : ScheduleBean.java
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
public class ScheduleBean {
  private String scheduleID;
  private String flightID;
  private String routeID;
  private int travelDuration;
  private String availableDays;
  private String departureTime;
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
 * @return routeID
 */
public String getRouteID() {
	return routeID;
}
/**
 * @param routeID 
 */
public void setRouteID(String routeID) {
	this.routeID = routeID;
}
/**
 * @return travelDuration
 */
public int getTravelDuration() {
	return travelDuration;
}
/**
 * @param travelDuration 
 */
public void setTravelDuration(int travelDuration) {
	this.travelDuration = travelDuration;
}
/**
 * @return availableDays
 */
public String getAvailableDays() {
	return availableDays;
}
/**
 * @param availableDays 
 */
public void setAvailableDays(String availableDays) {
	this.availableDays = availableDays;
}
/**
 * @return departureTime
 */
public String getDepartureTime() {
	return departureTime;
}
/**
 * @param departureTime 
 */
public void setDepartureTime(String departureTime) {
	this.departureTime = departureTime;
}

}
