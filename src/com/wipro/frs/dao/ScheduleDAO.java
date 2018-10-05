/*
 *
 * Copyright 2014 Wipro Technologies All rights reserved.
 * 
 * Customer specific copyright notice     :
 *
 * File Name       : ScheduleDAO.java
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



import com.wipro.frs.bean.ScheduleBean;


/**
 *
 * @author Reshma Subramaniam
 * @version 1.0 
 * @since 1.0
 * Date : Oct 28, 2014
 */

public class ScheduleDAO {
	
	
	/**
	 * @param scheduleBean
	 * @return
	 */
	String createSchedule( ScheduleBean scheduleBean)
	{
		return null;
		
	}
	/**
	 * @param scheduleID
	 * @return
	 */
	int deleteRoute(ArrayList<String> scheduleID )
	{
		return 0;
     
	}
	/**
	 * @param scheduleBean
	 * @return
	 */
	boolean updateRoute(  ScheduleBean scheduleBean)
	{
		return false;
		
	}
	 /**
	 * @param scheduleID
	 * @return
	 */
	ScheduleBean findByID(String scheduleID)
	{
		return null;
		
	}
	/**
	 * @return
	 */
	ArrayList< ScheduleBean> findAll()
	{
		return null;
		
	}
}
