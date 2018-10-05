/*
 *
 * Copyright 2014 Wipro Technologies All rights reserved.
 * 
 * Customer specific copyright notice     :
 *
 * File Name       : CredentialsDAO.java
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

import com.wipro.frs.bean.CredentialsBean;
import com.wipro.frs.util.DBUtil;


/**
 *
 * @author Reshma Subramaniam
 * @version 1.0 
 * @since 1.0
 * Date : Oct 28, 2014
 */
public class CredentialsDAO {
	
	
	/**
	 * @param credentialsBean
	 * @return
	 * @throws SQLException
	 * @throws ClassNotFoundException
	 */
	public boolean authenticateDb(CredentialsBean credentialsBean) throws SQLException,ClassNotFoundException {
		boolean result=false;
		Connection connection=DBUtil.getDBConnection("oracle.jdbc.driver.OracleDriver");
		String query="select userid,password from FRS_TBL_USER_CREDENTIALS where userid=? and password=? and loginStatus=0";
		PreparedStatement pstat=connection.prepareStatement(query);
		pstat.setString(1, credentialsBean.getUserID());
		pstat.setString(2,credentialsBean.getPassword());
		ResultSet resultSet=pstat.executeQuery();
		if(resultSet.next()){
			result=true;
		}else{
			result=false;
				}

		return result;
	}

	/**
	 * @param userId
	 * @return
	 * @throws SQLException
	 * @throws ClassNotFoundException
	 */
	public String authorizeDb(String userId) throws SQLException,ClassNotFoundException {
		String result="FAIL";
		Connection connection=DBUtil.getDBConnection("oracle.jdbc.driver.OracleDriver");
		String query="select userType from FRS_TBL_USER_CREDENTIALS where userid=?";
		PreparedStatement pstat=connection.prepareStatement(query);
		pstat.setString(1,userId);
		ResultSet rsUser=pstat.executeQuery();
		if(rsUser.next()){
			result=rsUser.getString(1);
		}else{
			result="INVALID";
		}
		return result;
	}

	/**
	 * @param credentialsBean
	 * @param loginStatus
	 * @return
	 * @throws SQLException
	 * @throws ClassNotFoundException
	 */
	public boolean changeLoginStatusDb(CredentialsBean credentialsBean, int loginStatus)throws SQLException,ClassNotFoundException {
		boolean result=false;
		Connection connection=DBUtil.getDBConnection("oracle.jdbc.driver.OracleDriver");
		String query="update FRS_TBL_USER_CREDENTIALS set loginstatus=? where userid=?";
		PreparedStatement pstat=connection.prepareStatement(query);
		pstat.setInt(1, loginStatus);
		pstat.setString(2, credentialsBean.getUserID());
		int rowsUpdated=pstat.executeUpdate();
		if(rowsUpdated>0){
			result=true;
		}else{
			result=false;
		}
		return result;
	}


	/**
	 * @param firstName
	 * @return
	 * @throws ClassNotFoundException 
	 * @throws SQLException 
	 */
	public String createUserID(String firstName) throws SQLException, ClassNotFoundException {
		// TODO Auto-generated method stub
		
		int tempSeq=0;
		String result="FAIL";
		Connection connection=DBUtil.getDBConnection("oracle.jdbc.driver.OracleDriver");
		String query="select FRS_SEQ_USER_ID.nextval from dual";
		PreparedStatement pstat=connection.prepareStatement(query);
		ResultSet rsSeq=pstat.executeQuery();
		while (rsSeq.next())
		{
			tempSeq=rsSeq.getInt(1);
		}
		String userID = firstName.substring(0,2);
		userID=userID.toUpperCase();
		userID=userID.concat(String.valueOf(tempSeq));
		if(userID!=null)
		{
		result= userID;
		}
		else
		{
			result="FAIL";
		}
		return result;
	}
	/**
	 * @param credentialsBean
	 * @return
	 * @throws SQLException 
	 * @throws ClassNotFoundException 
	 */
	 public String createCredentials(CredentialsBean credentialsBean) throws SQLException, ClassNotFoundException
	{
		
		PreparedStatement pstmt=null;
		Connection connection=null;
		String result = "FAIL";
		int rowsInserted= 0;
		connection = DBUtil.getDBConnection("oracle.jdbc.driver.OracleDriver");
		pstmt = connection
				.prepareStatement("insert into FRS_TBL_USER_CREDENTIALS(userid,password,usertype,loginstatus)values(?,?,?,?)");
		pstmt.setString(1, credentialsBean.getUserID());
		pstmt.setString(2, credentialsBean.getPassword());
		pstmt.setString(3, "C");
		pstmt.setInt(4, 0);
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
	 * @param userID
	 * @return
	 */
	int deleteCredentials(ArrayList<String> userID )
	{
		return 0;
		
	}
	
	
	/**
	 * @param credentialsBean
	 * @return
	 */
	boolean updateCredentials(CredentialsBean credentialsBean)
	{
		return false;
		
	}
	/**
	 * @param userID
	 * @return
	 */
	CredentialsBean findByID(String userID)
	{
		return null;
		
	}

		
	
	
	/**
	 * @return
	 */
	ArrayList<CredentialsBean> findAll()
	{
		return null;
		
	}
}
