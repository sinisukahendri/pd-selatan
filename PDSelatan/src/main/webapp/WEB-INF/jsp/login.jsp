<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>PD. Selatan POS Systems</title>
</head>
<body>

<h1>Login</h1>

<div id="login-error">${error} because of ${sessionScope["SPRING_SECURITY_LAST_EXCEPTION"].message}</div>

<form name='f' action="<c:url value='j_spring_security_check' />"
		method='POST'>

<p>
	<label for="j_username">Username</label>
	<input id="j_username" name="j_username" type="text" />
</p>

<p>
	<label for="j_password">Password</label>
	<input id="j_password" name="j_password" type="password" />
</p>

<input  type="submit" value="Login"/>								
	
</form>
 
 <!-- USING GOOGLE OPEN ID -->
<%-- <c:url var="openIDLoginUrl" value="/j_spring_openid_security_check" />

<c:url var="googleLogoUrl" value="/resources/google-logo.png" />
<img src="${googleLogoUrl}"></img>
<form action="${openIDLoginUrl}" method="post">
	   For Google users:
	  <input name="openid_identifier" type="hidden" value="https://www.google.com/accounts/o8/id"/>
	  <input type="submit" value="Sign with Google"/>
</form>
 --%>

</body>
</html>