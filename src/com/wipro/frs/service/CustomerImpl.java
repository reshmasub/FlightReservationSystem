/*
 *
 * Copyright 2014 Wipro Technologies All rights reserved.
 * 
 * Customer specific copyright notice     :
 *
 * File Name       : CustomerImpl.java
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
public class CustomerImpl implements Customer {

	/** 
	 * @see com.wipro.frs.service.Customer#viewScheduleByRoute(java.lang.String, java.lang.String, java.sql.Date)
	 * @param source
	 * @param destination
	 * @param date
	 * @return
	 */
	@Override
	public ArrayList<ScheduleBean> viewScheduleByRoute(String source,
			String destination, Date date) {
		// TODO Auto-generated method stub
		return null;
	}

	/** 
	 * @see com.wipro.frs.service.Customer#reserveTicket(com.wipro.frs.bean.ReservationBean, java.util.ArrayList)
	 * @param reservationBean
	 * @param passengers
	 * @return
	 */
	@Override
	public String reserveTicket(ReservationBean reservationBean,
			ArrayList<PassengerBean> passengers) {
		// TODO Auto-generated method stub
		return null;
	}

	/** 
	 * @see com.wipro.frs.service.Customer#cancelTicket(java.lang.String)
	 * @param reservationId
	 * @return
	 */
	@Override
	public boolean cancelTicket(String reservationId) {
		// TODO Auto-generated method stub
		return false;
	}

	/** 
	 * @see com.wipro.frs.service.Customer#viewTicket(java.lang.String)
	 * @param reservationId
	 * @return
	 */
	@Override
	public Map<ReservationBean, PassengerBean> viewTicket(String reservationId) {
		// TODO Auto-generated method stub
		return null;
	}

	/** 
	 * @see com.wipro.frs.service.Customer#printTicket(java.lang.String)
	 * @param reservationId
	 * @return
	 */
	@Override
	public Map<ReservationBean, PassengerBean> printTicket(String reservationId) {
		// TODO Auto-generated method stub
		return null;
	}

}
