/*
 *
 * Copyright 2014 Wipro Technologies All rights reserved.
 * 
 * Customer specific copyright notice     :
 *
 * File Name       : AdminAction.java
 *
 * Description     :Project desc.
 *
 * Version         : 1.0.0.
 *
 * Created Date    :Oct 30, 2014
 * 
 */
package com.wipro.frs.action;



import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.wipro.frs.bean.FlightBean;

import com.wipro.frs.service.Administrator;
import com.wipro.frs.service.AdministratorImpl;


/**
 *
 * @author Reshma Subramaniam
 * @version 1.0 
 * @since 1.0
 * Date : Oct 30, 2014
 */
public class AdminAction extends ActionSupport implements ModelDriven<FlightBean>{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	FlightBean flightBean=new FlightBean();
	/** 
	 * @see com.opensymphony.xwork2.ModelDriven#getModel()
	 * @return
	 */
	public FlightBean getModel() {
		// TODO Auto-generated method stub
		return flightBean;
	}
	/**
	 * @return
	 */
	public FlightBean getFlightBean() {
		return flightBean;
	}

	/**
	 * @param profileBean
	 */
	public void setFlightBean(FlightBean flightBean) {
		this.flightBean = flightBean;
	}

	public String addFlight(){
	String result="FAIL";
	Administrator administrator=new AdministratorImpl();
	
	result=administrator.addFlight(flightBean);
	if(result.equals("FAIL"))
	{
		result="FAIL";
	}
	else
	{
		result="SUCCESS";
	}
	
	return result;
	
}
}
