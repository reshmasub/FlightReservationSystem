/*
 *
 * Copyright 2014 Wipro Technologies All rights reserved.
 * 
 * Customer specific copyright notice     :
 *
 * File Name       : ProfileDAO.java
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
import java.sql.SQLException;
import java.util.ArrayList;

import com.wipro.frs.util.DBUtil;
import com.wipro.frs.bean.ProfileBean;

/**
 *
 * @author Reshma Subramaniam
 * @version 1.0 
 * @since 1.0
 * Date : Oct 28, 2014
 */
public class ProfileDAO {

	
	/**
	 * @param profileBean
	 * @return
	 * @throws ClassNotFoundException 
	 * @throws SQLException 
	 */
	public String createProfile(ProfileBean profileBean) throws SQLException, ClassNotFoundException
	{
		PreparedStatement pstmt=null;
		Connection connection=null;
		String result = "FAIL";
		int rowsUpdated = 0;
		
		connection = DBUtil.getDBConnection("oracle.jdbc.driver.OracleDriver");
				java.sql.Date DOB = new java.sql.Date(profileBean
						.getDateOfBirth().getTime());
				pstmt = connection
				.prepareStatement("INSERT INTO FRS_TBL_USER_PROFILE (USERID, FIRSTNAME, LASTNAME, DATEOFBIRTH, GENDER, STREET, LOCATION, CITY, STATE, PINCODE, MOBILENO, EMAILID) VALUES (?, ?, ?,TO_DATE(?,'DD-MON-YY'), ?, ?, ?, ?, ?, ?, ?, ?)");
				pstmt.setString(1, profileBean.getUserID());
				pstmt.setString(2, profileBean.getFirstName());
				pstmt.setString(3, profileBean.getLastName());
				pstmt.setDate(4, DOB);
				pstmt.setString(5, profileBean.getGender());
				pstmt.setString(6, profileBean.getStreet());
				pstmt.setString(7, profileBean.getLocation());
				pstmt.setString(8, profileBean.getCity());
				pstmt.setString(9, profileBean.getState());
				pstmt.setString(10, profileBean.getPincode());
				pstmt.setString(11, profileBean.getMobileNo());
				pstmt.setString(12, profileBean.getEmailID());
				
				
				rowsUpdated = pstmt.executeUpdate();
				if (rowsUpdated > 0) {
					
					result = "SUCCESS";
				} else {
					result = "FAIL";
				}
		
		
		return result;
	}
		
	

	/**
	 * @param userID
	 * @return
	 */
	int deleteProfile(ArrayList<String> userID )
	{
		return 0;
     
	}
	
	
	/**
	 * @param profileBean
	 * @return
	 */
	boolean updateProfile(ProfileBean profileBean)
	{
		return false;
		
	}
	/**
	 * @param userID
	 * @return
	 */
	ProfileBean findByID(String userID)
	{
		return null;
		
	}
	/**
	 * @return
	 */
	ArrayList<ProfileBean> findAll()
	{
		return null;
		
	}
}
