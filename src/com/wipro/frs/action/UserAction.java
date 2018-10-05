/*
 *
 * Copyright 2014 Wipro Technologies All rights reserved.
 * 
 * Customer specific copyright notice     :
 *
 * File Name       : UserAction.java
 *
 * Description     :Project desc.
 *
 * Version         : 1.0.0.
 *
 * Created Date    :Oct 29, 2014
 * 
 */
package com.wipro.frs.action;

import java.util.Map;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.wipro.frs.bean.CredentialsBean;
import com.wipro.frs.util.User;
import com.wipro.frs.util.UserImpl;

/**
 *
 * @author Reshma Subramaniam
 * @version 1.0 
 * @since 1.0
 * Date : Oct 29, 2014
 */

public class UserAction extends ActionSupport implements
ModelDriven<CredentialsBean> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	CredentialsBean credentialsBean;

	public CredentialsBean getModel() {
		
		credentialsBean = new CredentialsBean();
		return credentialsBean;
	}

	/**
	 * @return
	 */
	public String login() {
		User user = new UserImpl();
		String result = user.login(credentialsBean);
		
		if ("FAIL".equals(result)) {
			addActionError("Some error occured. Please try again!");

		} else if ("INVALID".equals(result)) {
			addActionError("You are not a valid user!");

		
		} else {

			Map<String,Object> session=ActionContext.getContext().getSession();
			session.put("userId",credentialsBean.getUserID());
			session.put("userType",credentialsBean.getUserType());
			addActionMessage("Welcome !"+credentialsBean.getUserID());
		}

		return result;
	}

	/**
	 * @return
	 */
	public String logout(){
		String result="FAIL";
		
		boolean output=false;
		User user = new UserImpl();
		Map<String,Object> session=ActionContext.getContext().getSession();
		String userId=(String) session.get("userId");
		output = user.logout(userId);
		if (output==true)
		{
			result="SUCCESS";
			addActionMessage("Logged Out Successfully!");
		}
		else
		{
			result="INVALID";
			addActionError("Some error occured!");
		}
		return result;
	}
	
		
	}
	

