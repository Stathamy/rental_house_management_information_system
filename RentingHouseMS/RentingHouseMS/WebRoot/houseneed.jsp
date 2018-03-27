<%@ page import="java.sql.*" language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="UTF-8">
<title>求租信息</title>
<style>
h1
{
	text-shadow: 5px 5px 5px #FF0000;
}
body
{
	background-color:#b0c4de;
}
</style>
</head>
<body>
<center>
<h1>求租信息</h1>
<form action="houseinputcheck.jsp" method="POST">
<table>
	<tr>
 		<td> 身份证:</td> <td> <input type="text" name="householderid"> </td>
 	</tr>
	<tr>
		<td>
			省:
		</td> 
		<td> 
			<input type="text"  name="province"/>
		</td>
	</tr>
 	<tr>
 		<td> 
 			市:
 		</td> 
 		<td>
 		<input type="text"  name="city"> 
 		</td>
 	</tr>
 	<tr>
 		<td> 房屋户型:</td> <td> <input type="text" name="housetype"> </td>
 	</tr>

 	<tr> 
 		<td>租金上界:</td> <td> <input type="text" name="upper"> </td>
 	</tr>
 	
 	<tr>
 		<td> 租金下界:</td> <td> <input type="text" name="lower"> </td>
 	</tr>
 	
</table>
<table>
	<tr>
		<td>
	 		
	 	<input type="button" value="后退" onclick="window.location.href='login.jsp'"></td> 
	 	<td>
	 		<!-- onclike="response.sendRedirect("login.jsp")" -->
	 	<input type="submit" value="注册"></td>
	</tr>
</table>
</form>

</center>
</body>
</html>