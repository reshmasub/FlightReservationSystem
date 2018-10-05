/*
 *
 * Copyright 2014 Wipro Technologies All rights reserved.
 * 
 * Customer specific copyright notice     :
 *
 * File Name       : User.java
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
import com.wipro.frs.bean.ProfileBean;

/**
 *
@author Reshma Subramaniam
 * @version 1.0 
 * @since 1.0
 * Date : Oct 28, 2014
 */
/**


public interface User {
 
	/**
	 * @param credentialsBean
	 * @return
	 */
	public String login(CredentialsBean credentialsBean);
	/**
	 * @param userId
	 * @return
	 */
	public boolean logout(String userId);
	/**
	 * @param credentialsBean
	 * @param newPassword
	 * @return
	 */
	public String changePassword(CredentialsBean credentialsBean, String newPassword);
	/**
	 * @param profileBean
	 * @return
	 * @throws ClassNotFoundException 
	 * @throws SQLException 
	 */
	public String register(ProfileBean profileBean) throws SQLException, ClassNotFoundException;
}