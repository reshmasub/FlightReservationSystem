/*
 *
 * Copyright 2014 Wipro Technologies All rights reserved.
 * 
 * Customer specific copyright notice     :
 *
 * File Name       : RegisterAction.java
 *
 * Description     :Project desc.
 *
 * Version         : 1.0.0.
 *
 * Created Date    :Oct 30, 2014
 * 
 */
package com.wipro.frs.action;

import java.sql.SQLException;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.wipro.frs.bean.ProfileBean;
import com.wipro.frs.util.User;
import com.wipro.frs.util.UserImpl;


/**
 *
 * @author Reshma Subramaniam
 * @version 1.0 
 * @since 1.0
 * Date : Oct 30, 2014
 */
public class RegisterAction extends ActionSupport implements ModelDriven<ProfileBean> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	ProfileBean profileBean= new ProfileBean();
	/**
	 * @return
	 */
	public ProfileBean getModel() {
		// TODO Auto-generated method stub
		
		return profileBean;
	}
	
	/**
	 * @return
	 */
	public ProfileBean getProfileBean() {
		return profileBean;
	}

	/**
	 * @param profileBean
	 */
	public void setProfileBean(ProfileBean profileBean) {
		this.profileBean = profileBean;
	}


	
	/**
	 * @return
	 */
	public String register(){
		String result="FAIL";
		User user=new UserImpl();
		
		try {
			result=user.register(profileBean);
			if(result.equals("FAIL"))
			{
				result="FAIL";
			}
			else
			{
				result="SUCCESS";
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			result="FAIL";
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			result="FAIL";
		}
		//System.out.println(result);
		return result;
		
	}
}

