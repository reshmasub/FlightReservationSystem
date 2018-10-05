/*
 *
 * Copyright 2014 Wipro Technologies All rights reserved.
 * 
 * Customer specific copyright notice     :
 *
 * File Name       : ReservationDAO.java
 *
 * Description     :Project desc.
 *
 * Version         : 1.0.0.
 *
 * Created Date    :Oct 28, 2014
 * 
 */
package com.wipro.frs.dao;

import java.util.ArrayList;

import com.wipro.frs.bean.ReservationBean;

/**
 *
 * @author Reshma Subramaniam
 * @version 1.0 
 * @since 1.0
 * Date : Oct 28, 2014
 */
public class ReservationDAO {
	
	/**
	 * @param reservationBean
	 * @return
	 */
	String createReservation( ReservationBean  reservationBean)
	{
		return null;
		
	}

	/**
	 * @param reservationID
	 * @return
	 */
	int deleteReservation(ArrayList<String> reservationID )
	{
		return 0;
     
	}
	
	/**
	 * @param reservationBean
	 * @return
	 */
	boolean updateReservation( ReservationBean  reservationBean)
	{
		return false;
		
	}
	/**
	 * @param userID
	 * @return
	 */
	ReservationBean findByID(String userID)
	{
		return null;
		
	}
	/**
	 * @return
	 */
	ArrayList< ReservationBean> findAll()
	{
		return null;
		
	}

}
