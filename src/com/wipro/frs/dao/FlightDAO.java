/*
 *
 * Copyright 2014 Wipro Technologies All rights reserved.
 * 
 * Customer specific copyright notice     :
 *
 * File Name       : FlightDAO.java
 *
 * Description     :Project desc.
 *
 * Version         : 1.0.0.
 *
 * Created Date    :Oct 28, 2014
 * 
 */
package com.wipro.frs.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;


import com.wipro.frs.bean.FlightBean;
import com.wipro.frs.util.DBUtil;

/**
 *
 * @author Reshma Subramaniam
 * @version 1.0 
 * @since 1.0
 * Date : Oct 28, 2014
 */
public class FlightDAO {
	/**
	 * @param flightName
	 * @return
	 * @throws SQLException
	 * @throws ClassNotFoundException
	 */
	public String createFlightID(String flightName) throws SQLException, ClassNotFoundException {
		// TODO Auto-generated method stub
		
		int tempSeq=0;
		String result="FAIL";
		Connection connection=DBUtil.getDBConnection("oracle.jdbc.driver.OracleDriver");
		String query="select FRS_SEQ_FLIGHT_ID.nextval from dual";
		PreparedStatement pstat=connection.prepareStatement(query);
		ResultSet rsSeq=pstat.executeQuery();
		if (rsSeq.next())
		{
			tempSeq=rsSeq.getInt(1);
		
		String flightID = flightName.substring(0,2);
		flightID=flightID.toUpperCase();
		flightID=flightID.concat(String.valueOf(tempSeq));
		if(flightID!=null)
		{
		result= "flightID";
		}
		else
		{
			result="FAIL";
		}
		}
		else
		{
			result="FAIL";
		}
		return result;
	}
	
	
	 /**
	 * @param flightBean
	 * @return
	 * @throws SQLException
	 * @throws ClassNotFoundException
	 */
	public String createFlight(FlightBean flightBean) throws SQLException, ClassNotFoundException
		{
			
			PreparedStatement pstmt=null;
			Connection connection=null;
			String result = "FAIL";
			int rowsInserted= 0;
			connection = DBUtil.getDBConnection("oracle.jdbc.driver.OracleDriver");
			pstmt = connection
					.prepareStatement("insert into FRS_TBL_FLIGHT(flightid,flightname,seatingcapacity,reservationcapacity)values(?,?,?,?)");
			pstmt.setString(1, flightBean.getFlightID());
			pstmt.setString(2, flightBean.getFlightName());
			pstmt.setInt(3,flightBean.getSeatingCapacity());
			pstmt.setInt(4, flightBean.getReservationCapacity());
			System.out.println(flightBean.getFlightID());
			rowsInserted=pstmt.executeUpdate();
			if(rowsInserted>0)
			{
			result="SUCCESS";	
			}
			else
			{
				result="FAIL";
			}
			return result;
		}

	/**
	 * @param flightID
	 * @return
	 */
	int deleteFlight(ArrayList<String> flightID)
	{
		return 0;
		
	}

	
	/**
	 * @param flightbean
	 * @return
	 */
	boolean updateFlight(FlightBean flightbean)
	{
		return false;
		
	}
	/**
	 * @param flightID
	 * @return
	 */
	FlightBean findByID(String flightID)
	{
		return null;
		
	}
	
	/**
	 * @return
	 */
	ArrayList<FlightBean> findAll()
	{
		return null;
		
	}
}
