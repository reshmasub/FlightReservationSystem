/*
 *
 * Copyright 2014 Wipro Technologies All rights reserved.
 * 
 * Customer specific copyright notice     :
 *
 * File Name       : Payment.java
 *
 * Description     :Project desc.
 *
 * Version         : 1.0.0.
 *
 * Created Date    :Oct 28, 2014
 * 
 */
package com.wipro.frs.util;

/**
 *
@author Reshma Subramaniam
 * @version 1.0 
 * @since 1.0
 * Date : Oct 28, 2014
 */
public interface Payment {

	/**
	 * @param userid
	 * @param cardnumber
	 * @return
	 */
	boolean findByCardNumber(String userid, String cardnumber);
	/**
	 * @param payment
	 * @return
	 */
	String process(Payment payment);
}
