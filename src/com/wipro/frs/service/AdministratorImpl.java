/*
 *
 * Copyright 2014 Wipro Technologies All rights reserved.
 * 
 * Customer specific copyright notice     :
 *
 * File Name       : AdministratorImpl.java
 *
 * Description     :Project desc.
 *
 * Version         : 1.0.0.
 *
 * Created Date    :Oct 28, 2014
 * 
 */
package com.wipro.frs.service;

import java.sql.SQLException;
import java.util.ArrayList;

import com.wipro.frs.bean.FlightBean;
import com.wipro.frs.bean.PassengerBean;
import com.wipro.frs.bean.RouteBean;
import com.wipro.frs.bean.ScheduleBean;
import com.wipro.frs.dao.FlightDAO;

/**
 *
 * @author Reshma Subramaniam
 * @version 1.0 
 * @since 1.0
 * Date : Oct 28, 2014
 */
public class AdministratorImpl implements Administrator {

	/** 
	 * @see com.wipro.frs.service.Administrator#addFlight(com.wipro.frs.bean.FlightBean)
	 * @param flightBean
	 * @return
	 */
	@Override
	public String addFlight(FlightBean flightBean) {
		// TODO Auto-generated method stub
		String flightID="TEMP";
		String result="FAIL";
		FlightDAO flightDAO=new FlightDAO();
		if(flightBean!=null && flightBean.getFlightName().length()>=2)
		{
			
				try {
					flightID=flightDAO.createFlightID(flightBean.getFlightName());
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
					result="FAIL";
				} catch (ClassNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
					result="FAIL";
				}
			if(flightID.equals("FAIL"))
					{
			result="FAIL";
					}
			else
			{
			  flightBean.setFlightID(flightID);
			  try {
				result=flightDAO.createFlight(flightBean);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				result="FAIL";
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				result="FAIL";
			}
			if(result.equals("SUCCESS"))
			{ 
				
				result="SUCCESS";
				}
				else
				{
					result="FAIL";
				}
				
			}
			
		}
		else
		{
			result="FAIL";
		}
		
		return result;
		}
	

	/** 
	 * @see com.wipro.frs.service.Administrator#modifyFlight(com.wipro.frs.bean.FlightBean)
	 * @param flightBean
	 * @return
	 */
	@Override
	public boolean modifyFlight(FlightBean flightBean) {
		// TODO Auto-generated method stub
		return false;
	}

	/** 
	 * @see com.wipro.frs.service.Administrator#removeFlight(java.util.ArrayList)
	 * @param flightID
	 * @return
	 */
	@Override
	public int removeFlight(ArrayList<String> flightID) {
		// TODO Auto-generated method stub
		return 0;
	}

	/** 
	 * @see com.wipro.frs.service.Administrator#addSchedule(com.wipro.frs.bean.ScheduleBean)
	 * @param scheduleBean
	 * @return
	 */
	@Override
	public String addSchedule(ScheduleBean scheduleBean) {
		// TODO Auto-generated method stub
		return null;
	}

	/** 
	 * @see com.wipro.frs.service.Administrator#modifySchedule(com.wipro.frs.bean.ScheduleBean)
	 * @param scheduleBean
	 * @return
	 */
	@Override
	public boolean modifySchedule(ScheduleBean scheduleBean) {
		// TODO Auto-generated method stub
		return false;
	}

	/** 
	 * @see com.wipro.frs.service.Administrator#removeSchedule(java.util.ArrayList)
	 * @param scheduleId
	 * @return
	 */
	@Override
	public int removeSchedule(ArrayList<String> scheduleId) {
		// TODO Auto-generated method stub
		return 0;
	}

	/** 
	 * @see com.wipro.frs.service.Administrator#addRoute(com.wipro.frs.bean.RouteBean)
	 * @param routeBean
	 * @return
	 */
	@Override
	public String addRoute(RouteBean routeBean) {
		// TODO Auto-generated method stub
		return null;
	}

	/** 
	 * @see com.wipro.frs.service.Administrator#modifyRoute(com.wipro.frs.bean.RouteBean)
	 * @param routeBean
	 * @return
	 */
	@Override
	public boolean modifyRoute(RouteBean routeBean) {
		// TODO Auto-generated method stub
		return false;
	}

	/** 
	 * @see com.wipro.frs.service.Administrator#removeRoute(java.util.ArrayList)
	 * @param routeId
	 * @return
	 */
	@Override
	public int removeRoute(ArrayList<String> routeId) {
		// TODO Auto-generated method stub
		return 0;
	}

	/** 
	 * @see com.wipro.frs.service.Administrator#viewByFlightId(java.lang.String)
	 * @param flightId
	 * @return
	 */
	@Override
	public FlightBean viewByFlightId(String flightId) {
		// TODO Auto-generated method stub
		return null;
	}

	/** 
	 * @see com.wipro.frs.service.Administrator#viewByRouteId(java.lang.String)
	 * @param routeId
	 * @return
	 */
	@Override
	public RouteBean viewByRouteId(String routeId) {
		// TODO Auto-generated method stub
		return null;
	}

	/** 
	 * @see com.wipro.frs.service.Administrator#viewByAllFlights()
	 * @return
	 */
	@Override
	public ArrayList<FlightBean> viewByAllFlights() {
		// TODO Auto-generated method stub
		return null;
	}

	/** 
	 * @see com.wipro.frs.service.Administrator#viewByAllRoute()
	 * @return
	 */
	@Override
	public ArrayList<RouteBean> viewByAllRoute() {
		// TODO Auto-generated method stub
		return null;
	}

	/** 
	 * @see com.wipro.frs.service.Administrator#viewByAllSchedule()
	 * @return
	 */
	@Override
	public ArrayList<ScheduleBean> viewByAllSchedule() {
		// TODO Auto-generated method stub
		return null;
	}

	/** 
	 * @see com.wipro.frs.service.Administrator#viewByScheduleId(java.lang.String)
	 * @param scheduleId
	 * @return
	 */
	@Override
	public ScheduleBean viewByScheduleId(String scheduleId) {
		// TODO Auto-generated method stub
		return null;
	}

	/** 
	 * @see com.wipro.frs.service.Administrator#viewPassengersByFlight(java.lang.String)
	 * @param scheduleId
	 * @return
	 */
	@Override
	public ArrayList<PassengerBean> viewPassengersByFlight(String scheduleId) {
		// TODO Auto-generated method stub
		return null;
	}

}
