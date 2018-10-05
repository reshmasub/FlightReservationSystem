/*
 *
 * Copyright 2014 Wipro Technologies All rights reserved.
 * 
 * Customer specific copyright notice     :
 *
 * File Name       : Administrator.java
 *
 * Description     :Project desc.
 *
 * Version         : 1.0.0.
 *
 * Created Date    :Oct 28, 2014
 * 
 */
package com.wipro.frs.service;

import java.util.ArrayList;

import com.wipro.frs.bean.FlightBean;
import com.wipro.frs.bean.PassengerBean;
import com.wipro.frs.bean.RouteBean;
import com.wipro.frs.bean.ScheduleBean;

/**
 *
 * @author Reshma Subramaniam
 * @version 1.0 
 * @since 1.0
 * Date : Oct 28, 2014
 */
public interface Administrator {
	
	/**
	 * @param flightBean
	 * @return
	 */
	String addFlight(FlightBean flightBean);
	
	/**
	 * @param flightBean
	 * @return
	 */
	boolean modifyFlight(FlightBean flightBean);
	/**
	 * @param flightID
	 * @return
	 */
	int removeFlight(ArrayList<String> flightID);
	/**
	 * @param scheduleBean
	 * @return
	 */
	String addSchedule(ScheduleBean scheduleBean);
	/**
	 * @param scheduleBean
	 * @return
	 */
	boolean modifySchedule(ScheduleBean scheduleBean);
	/**
	 * @param scheduleId
	 * @return
	 */
	int removeSchedule(ArrayList<String> scheduleId);
	/**
	 * @param routeBean
	 * @return
	 */
	String addRoute(RouteBean routeBean);
	/**
	 * @param routeBean
	 * @return
	 */
	boolean modifyRoute(RouteBean routeBean);
	/**
	 * @param routeId
	 * @return
	 */
	int removeRoute(ArrayList<String> routeId);
	/**
	 * @param flightId
	 * @return
	 */
	FlightBean viewByFlightId(String flightId);
	/**
	 * @param routeId
	 * @return
	 */
	RouteBean viewByRouteId(String routeId);
	/**
	 * @return
	 */
	ArrayList<FlightBean> viewByAllFlights();
	/**
	 * @return
	 */
	ArrayList<RouteBean> viewByAllRoute();
	/**
	 * @return
	 */
	ArrayList<ScheduleBean> viewByAllSchedule();
	/**
	 * @param scheduleId
	 * @return
	 */
	ScheduleBean viewByScheduleId(String scheduleId);
	/**
	 * @param scheduleId
	 * @return
	 */
	ArrayList<PassengerBean> viewPassengersByFlight(String scheduleId);

}
