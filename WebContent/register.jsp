<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="sx" uri="/struts-dojo-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Registration page</title>
<sx:head/>
</head>
<body>
<center>
<h2>Registration Form</h2>
<s:form action="Register" method="POST">
	<s:textfield label="First Name" name="firstName"/>
	<s:textfield label="Last Name" name="lastName"/>
	<sx:datetimepicker name="dateOfBirth" label="Date Of Birth(dd-MM-yyyy)" displayFormat="dd-MM-yyyy" value="%{'today'}"/>
	<s:radio list="{'Female','Male'}" name="gender"
		label="Gender" />
	<s:textfield label="Street" name="street"/>
	<s:textfield label="Location" name="location"/>
	<s:textfield label="City" name="city"/>
	<s:textfield label="State" name="state"/>
	<s:textfield label="Pincode" name="pincode"/>
	<s:textfield label="Mobile Number" name="mobileNo"/>
	<s:textfield label="Email ID" name="emailID"/>
	<s:textfield label="Password" name="password"/>
	<s:submit label="Register" value="Register" />
</s:form></center>
</body>
</html>