<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="s" uri="/struts-tags"  %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>LOGIN PAGE</title>
</head>
<body>
<center>
<br><br>
<s:property value="#msg"/>
<s:form action="Login" method="post">
<s:actionerror/>
<s:actionmessage/>
<s:textfield name="userID" label="Enter User Name"> </s:textfield>
<s:password name="password" label="Enter Password"></s:password>
<s:submit value="LOGIN"></s:submit>
</s:form>
New User? <a href="register.jsp">Register Here</a>
</center>
</body>
</html>