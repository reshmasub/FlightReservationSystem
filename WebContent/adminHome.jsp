<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="s" uri="/struts-tags"  %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Administrator Home Page</title>
</head>
<body>
<s:if test="#session.userId==null">
<s:set name="msg" value="Hello"></s:set>
<jsp:forward page="login.jsp">

<jsp:param name="msg" value="Please log in first to access the home page!"/>
</jsp:forward>

</s:if>
<s:else>

<s:actionmessage/>
<h2>Administrator Home Page</h2>
<h1>Flight</h1>
<s:a href="addFlight.jsp">To add Flight Details click here</s:a><br/>

<s:url id="logout" action="Logout" var="myurl">
	</s:url> 
	<a href='<s:property value="#myurl"/>'> Logout</a>
	


</s:else>

</body>
</html>