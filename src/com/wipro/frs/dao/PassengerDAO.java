/*
 *
 * Copyright 2014 Wipro Technologies All rights reserved.
 * 
 * Customer specific copyright notice     :
 *
 * File Name       : PassengerDAO.java
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

import com.wipro.frs.bean.PassengerBean;

/**
 *
 * @author Reshma Subramaniam
 * @version 1.0 
 * @since 1.0
 * Date : Oct 28, 2014
 */
public class PassengerDAO {
	
	
	/**
	 * @param passengerBean
	 * @return
	 */
	String createPassenger(PassengerBean passengerBean)
	{
		return null;
		
	}

	/**
	 * @param reservationID
	 * @return
	 */
	int deletePassenger(ArrayList<String> reservationID )
	{
		return 0;
     
	}
	
	/**
	 * @param passengerBean
	 * @return
	 */
	boolean updatePassenger(PassengerBean passengerBean)
	{
		return false;
		
	}
	/**
	 * @param reservationID
	 * @return
	 */
	PassengerBean findByID(String reservationID)
	{
		return null;
		
	}
	/**
	 * @return
	 */
	ArrayList<PassengerBean> findAll()
	{
		return null;
		
	}
}
