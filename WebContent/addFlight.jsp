<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Flight Details form</title>
</head>
<body>
<center>
<s:form name="FlightForm" action="addFlight" method="POST">
 <s:textfield name="flightName" label="Enter Flight Name"/>
 <s:textfield name="seatingCapacity" label="Enter Seating Capacity"></s:textfield>
 <s:textfield name="reservationCapacity" label="Enter Reservation Capacity"></s:textfield>
 <s:submit name="Add" value="Add" />
 </s:form>
 </center>
</body>

</html>