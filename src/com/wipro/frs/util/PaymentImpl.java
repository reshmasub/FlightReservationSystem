/*
 *
 * Copyright 2014 Wipro Technologies All rights reserved.
 * 
 * Customer specific copyright notice     :
 *
 * File Name       : PaymentImpl.java
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
public class PaymentImpl implements Payment {

	/** 
	 * @see com.wipro.frs.util.Payment#findByCardNumber(java.lang.String, java.lang.String)
	 * @param userid
	 * @param cardnumber
	 * @return
	 */
	@Override
	public boolean findByCardNumber(String userid, String cardnumber) {
		// TODO Auto-generated method stub
		return false;
	}

	/** 
	 * @see com.wipro.frs.util.Payment#process(com.wipro.frs.util.Payment)
	 * @param payment
	 * @return
	 */
	@Override
	public String process(Payment payment) {
		// TODO Auto-generated method stub
		return null;
	}

}
