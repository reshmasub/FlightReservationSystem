/*
 *
 * Copyright 2014 Wipro Technologies All rights reserved.
 * 
 * Customer specific copyright notice     :
 *
 * File Name       : Authentication.java
 *
 * Description     :Project desc.
 *
 * Version         : 1.0.0.
 *
 * Created Date    :Oct 28, 2014
 * 
 */
package com.wipro.frs.util;

import com.wipro.frs.bean.CredentialsBean;

/**
 *
 * @author Reshma Subramaniam
 * @version 1.0 
 * @since 1.0
 * Date : Oct 28, 2014
 */
public interface Authentication {

	/**
	 * @param credentialsBean
	 * @return
	 */
	boolean authenticate(CredentialsBean credentialsBean);
	/**
	 * @param userId
	 * @return
	 */
	String authorize(String userId);
	/**
	 * @param credentialsBean
	 * @param loginStatus
	 * @return
	 */
	boolean changeLoginStatus(CredentialsBean credentialsBean, int loginStatus);
}
