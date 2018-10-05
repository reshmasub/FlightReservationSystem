<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="s" uri="/struts-tags"  %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Customer Home Page</title>
</head>
<body>
<s:if test="#session.userId==null">
<jsp:forward page="login.jsp"></jsp:forward>
</s:if>
<s:else>
<s:actionmessage/>
<h1>Customer</h1>
</s:else>
<s:url id="logout" action="Logout" var="myurl">
	</s:url> 
	<a href='<s:property value="#myurl"/>'> Logout</a>
</body>
</html>