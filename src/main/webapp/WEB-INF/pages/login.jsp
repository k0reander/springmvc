<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form"%>    
<html>
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>Spring Mvc Test</title>
	</head>
	<body>
		<sf:form method="POST" modelAttribute="loginInfo" action="onLogin">
			<table>
                <tr>
                    <td><sf:label path="userId">Login</sf:label></td>
                    <td><sf:input path="userId"/></td>
                </tr>
                <tr>
                    <td><sf:label path="password">Password</sf:label></td>
                    <td><sf:input path="password"/></td>
                </tr>
                <tr>
                    <td><input type="submit" value="Submit"/></td>
                </tr>
            </table>
    	</sf:form>	
    	<p>${error}</p>
	</body>
</html>