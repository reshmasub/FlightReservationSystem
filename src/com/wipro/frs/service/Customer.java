/*
 *
 * Copyright 2014 Wipro Technologies All rights reserved.
 * 
 * Customer specific copyright notice     :
 *
 * File Name       : Customer.java
 *
 * Description     :Project desc.
 *
 * Version         : 1.0.0.
 *
 * Created Date    :Oct 28, 2014
 * 
 */
package com.wipro.frs.service;

import java.sql.Date;
import java.util.ArrayList;
import java.util.Map;

import com.wipro.frs.bean.PassengerBean;
import com.wipro.frs.bean.ReservationBean;
import com.wipro.frs.bean.ScheduleBean;

/**
 *
 * @author Reshma Subramaniam
 * @version 1.0 
 * @since 1.0
 * Date : Oct 28, 2014
 */
public interface Customer {

	/**
	 * @param source
	 * @param destination
	 * @param date
	 * @return
	 */
	ArrayList<ScheduleBean> viewScheduleByRoute(String source, String destination, Date date);
	/**
	 * @param reservationBean
	 * @param passengers
	 * @return
	 */
	String reserveTicket(ReservationBean reservationBean, ArrayList<PassengerBean> passengers);
	/**
	 * @param reservationId
	 * @return
	 */
	boolean cancelTicket(String reservationId);
	/**
	 * @param reservationId
	 * @return
	 */
	Map<ReservationBean,PassengerBean> viewTicket(String reservationId);
	/**
	 * @param reservationId
	 * @return
	 */
	Map<ReservationBean,PassengerBean> printTicket(String reservationId);
}
