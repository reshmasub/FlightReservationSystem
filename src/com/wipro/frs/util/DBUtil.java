/*
 *
 * Copyright 2014 Wipro Technologies All rights reserved.
 * 
 * Customer specific copyright notice     :
 *
 * File Name       : DBUtil.java
 *
 * Description     :Project desc.
 *
 * Version         : 1.0.0.
 *
 * Created Date    :Oct 28, 2014
 * 
 */
package com.wipro.frs.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
@author Reshma Subramaniam
 * @version 1.0 
 * @since 1.0
 * Date : Oct 28, 2014
 */
public class DBUtil {

	/**
	 * @param driverType
	 * @return
	 */
	public static Connection getDBConnection(String driverType) throws SQLException,ClassNotFoundException{
		Class.forName(driverType);
		Connection connection=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","B32678team03","B32678team03");
		return connection;
	}

}
