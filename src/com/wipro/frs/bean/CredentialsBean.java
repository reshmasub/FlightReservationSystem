/*
 *
 * Copyright 2014 Wipro Technologies All rights reserved.
 * 
 * Customer specific copyright notice     :
 *
 * File Name       : CredentialsBean.java
 *
 * Description     :Project desc.
 *
 * Version         : 1.0.0.
 *
 * Created Date    :Oct 28, 2014
 * 
 */
package com.wipro.frs.bean;

/**
 *
 * @author Reshma Subramaniam
 * @version 1.0 
 * @since 1.0
 * Date : Oct 28, 2014
 */
public class CredentialsBean {
  private String userID;
  private String password;
  private String userType;
  private int loginStatus;
/**
 * @return userID
 */
public String getUserID() {
	return userID;
}
/**
 * @param userID 
 */
public void setUserID(String userID) {
	this.userID = userID;
}
/**
 * @return password
 */
public String getPassword() {
	return password;
}
/**
 * @param password 
 */
public void setPassword(String password) {
	this.password = password;
}
/**
 * @return userType
 */
public String getUserType() {
	return userType;
}
/**
 * @param userType 
 */
public void setUserType(String userType) {
	this.userType = userType;
}
/**
 * @return loginStatus
 */
public int getLoginStatus() {
	return loginStatus;
}
/**
 * @param loginStatus 
 */
public void setLoginStatus(int loginStatus) {
	this.loginStatus = loginStatus;
}
}
