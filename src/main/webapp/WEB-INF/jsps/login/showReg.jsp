<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Create New Account</h1>
<form action="saveuser" method="post">
<table>
<tr>
   <td>FirstName:</td>
   <td><input type="text" name="firstName"/></td>
</tr>
<tr>
   <td>LastName:</td>
   <td><input type="text" name="lastName"/></td>
</tr>
<tr>
   <td>Email:</td>
   <td><input type="text" name="email"/></td>
</tr>
<tr>
   <td>Password:</td>
   <td><input type="password" name="password"/></td>
</tr>
<tr>
   <td><input type="submit" value="save"/></td>
</tr>

</table>
</form>
</body>
</html>