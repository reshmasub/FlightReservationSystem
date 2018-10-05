/*
 *
 * Copyright 2014 Wipro Technologies All rights reserved.
 * 
 * Customer specific copyright notice     :
 *
 * File Name       : RouteBean.java
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
public class RouteBean {
  private String routeID;
  private String source;
  private String destination;
  private int distance;
  private double fare;
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
 * @return source
 */
public String getSource() {
	return source;
}
/**
 * @param source 
 */
public void setSource(String source) {
	this.source = source;
}
/**
 * @return destination
 */
public String getDestination() {
	return destination;
}
/**
 * @param destination 
 */
public void setDestination(String destination) {
	this.destination = destination;
}
/**
 * @return distance
 */
public int getDistance() {
	return distance;
}
/**
 * @param distance 
 */
public void setDistance(int distance) {
	this.distance = distance;
}
/**
 * @return fare
 */
public double getFare() {
	return fare;
}
/**
 * @param fare 
 */
public void setFare(double fare) {
	this.fare = fare;
}
}
