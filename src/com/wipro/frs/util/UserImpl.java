/*
 *
 * Copyright 2014 Wipro Technologies All rights reserved.
 * 
 * Customer specific copyright notice     :
 *
 * File Name       : UserImpl.java
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

import com.wipro.frs.bean.CredentialsBean;
import com.wipro.frs.util.Authentication;
import com.wipro.frs.util.AuthenticationImpl;
import com.wipro.frs.bean.ProfileBean;
import com.wipro.frs.dao.CredentialsDAO;
import com.wipro.frs.dao.ProfileDAO;

/**
 *
@author Reshma Subramaniam
 * @version 1.0 
 * @since 1.0
 * Date : Oct 28, 2014
 */
public class UserImpl implements User {

	/** 
	 * @see com.wipro.frs.util.User#login(com.wipro.frs.bean.CredentialsBean)
	 * @param credentialsBean
	 * @return
	 */
	@Override
	public String login(CredentialsBean credentialsBean) {
		// TODO Auto-generated method stub
		String result="FAIL";
		 if(credentialsBean!=null)
		 {
				
				Authentication authentication=new AuthenticationImpl();
				boolean validUser=authentication.authenticate( credentialsBean);
				if(validUser==true){
					String userType=authentication.authorize(credentialsBean.getUserID());
					if("A".equals(userType)|| "C".equals(userType)){
						boolean changeLogin=authentication.changeLoginStatus(credentialsBean, 1);
						if(changeLogin==true){
							result=userType;
						}else{
							System.out.println("change");
							result="INVALID";
						}
					}else{
						System.out.println("usertype");
						result="INVALID";
					}
				}else{
					System.out.println("user");
					result="INVALID";
				}
		 }
		 else
		 {
			 result="FAIL";
				
		 }	
		 return result;		
	}

	/** 
	 * @see com.wipro.frs.util.User#logout(java.lang.String)
	 * @param userId
	 * @return
	 */
	@Override
	public boolean logout(String userId) {
		
		// TODO Auto-generated method stub
		
			boolean result=false;
			
				Authentication authentication=new AuthenticationImpl();
				CredentialsBean credentialsBean =new CredentialsBean();
				credentialsBean.setUserID(userId);
				boolean changeLogin=authentication.changeLoginStatus(credentialsBean, 0);
				if(changeLogin==true){
					result=true;
				}else{
					result=false;
				}
			
			return result;
		}
	

	/** 
	 * @see com.wipro.frs.util.User#changePassword(com.wipro.frs.bean.CredentialsBean, java.lang.String)
	 * @param credentialsBean
	 * @param newPassword
	 * @return
	 */
	@Override
	public String changePassword(CredentialsBean credentialsBean,
			String newPassword) {
		// TODO Auto-generated method stub
		return null;
	}

	/** 
	 * @see com.wipro.frs.util.User#register(com.wipro.frs.bean.ProfileBean)
	 * @param profileBean
	 * @return
	 * @throws ClassNotFoundException 
	 * @throws SQLException 
	 */
	@Override
	public String register(ProfileBean profileBean) throws SQLException, ClassNotFoundException {
		// TODO Auto-generated method stub
		String userID="TEMP";
		String result="FAIL";
		CredentialsBean credentialsBean=new CredentialsBean();
		CredentialsDAO credentialsDAO=new CredentialsDAO();
		ProfileDAO profileDAO=new ProfileDAO();
	
		if(profileBean!=null && profileBean.getFirstName().length()>=2)
		{
			userID=credentialsDAO.createUserID(profileBean.getFirstName());
			if(userID.equals("FAIL"))
					{
			result="FAIL";
					}
			else
			{
			  credentialsBean.setUserID(userID);
			  credentialsBean.setPassword(profileBean.getPassword());
			  result=credentialsDAO.createCredentials(credentialsBean);
			if(result.equals("SUCCESS"))
			{ 
				profileBean.setUserID(userID);
				result=profileDAO.createProfile(profileBean);
				if(result.equals("SUCCESS"))
				{
					System.out.println("success");
				result=userID;
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
			}
		}
		else
		{
			result="FAIL";
		}
		System.out.println(result);
		return result;
		}
}


