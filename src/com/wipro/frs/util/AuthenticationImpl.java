/*
 *
 * Copyright 2014 Wipro Technologies All rights reserved.
 * 
 * Customer specific copyright notice     :
 *
 * File Name       : AuthenticationImpl.java
 *
 * Description     :Project desc.
 *
 * Version         : 1.0.0.
 *
 * Created Date    :Oct 28, 2014
 * 
 */
package com.wipro.frs.util;



import java.sql.SQLException;

import com.wipro.frs.dao.CredentialsDAO;
import com.wipro.frs.bean.CredentialsBean;


/**
 *
 * @author Reshma Subramaniam
 * @version 1.0 
 * @since 1.0
 * Date : Oct 28, 2014
 */
public class AuthenticationImpl implements Authentication {

	
	/** 
	 * @see com.wipro.frs.util.Authentication#authenticate(com.wipro.frs.bean.CredentialsBean)
	 * @param credentialsBean
	 * @return
	 */
	@Override
	public boolean authenticate(CredentialsBean credentialsBean) 
	{
		// TODO Auto-generated method stub
		boolean result=false;
		CredentialsDAO credentialsDAO=new CredentialsDAO();
		try {
			result=credentialsDAO.authenticateDb(credentialsBean);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}

	
	/** 
	 * @see com.wipro.frs.util.Authentication#authorize(java.lang.String)
	 * @param userId
	 * @return
	 */
	@Override
	public String authorize(String userId) {
		
		String userType="FAIL";
		CredentialsDAO credentialsDAO=new CredentialsDAO();
		try {
			userType=credentialsDAO.authorizeDb(userId);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return userType;
	}

	
	/** 
	 * @see com.wipro.frs.util.Authentication#changeLoginStatus(com.wipro.frs.bean.CredentialsBean, int)
	 * @param credentialsBean
	 * @param loginStatus
	 * @return
	 */
	@Override
	public boolean changeLoginStatus(CredentialsBean credentialsBean,
			int loginStatus) {
		// TODO Auto-generated method stub
		boolean result=false;
		CredentialsDAO credentialsDAO=new CredentialsDAO();
		try {
			result=credentialsDAO.changeLoginStatusDb(credentialsBean, loginStatus);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}

}
