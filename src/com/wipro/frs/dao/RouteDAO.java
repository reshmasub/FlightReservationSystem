/*
 *
 * Copyright 2014 Wipro Technologies All rights reserved.
 * 
 * Customer specific copyright notice     :
 *
 * File Name       : RouteDAO.java
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

import com.wipro.frs.bean.RouteBean;

/**
 *
 * @author Reshma Subramaniam
 * @version 1.0 
 * @since 1.0
 * Date : Oct 28, 2014
 */
public class RouteDAO {
	
	/**
	 * @param routeBean
	 * @return
	 */
	String createRoute( RouteBean routeBean)
	{
		return null;
		
	}

	/**
	 * @param routeID
	 * @return
	 */
	int deleteRoute(ArrayList<String> routeID )
	{
		return 0;
     
	}
	
	
	/**
	 * @param routeBean
	 * @return
	 */
	boolean updateRoute( RouteBean routeBean)
	{
		return false;
		
	}
	/**
	 * @param routeID
	 * @return
	 */
	RouteBean findByID(String routeID)
	{
		return null;
		
	}
	/**
	 * @return
	 */
	ArrayList< RouteBean> findAll()
	{
		return null;
		
	}


}
