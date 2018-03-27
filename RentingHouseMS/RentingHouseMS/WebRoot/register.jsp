<%@ page import="java.sql.*" language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="UTF-8">
<title>注册</title>
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
<h1>注册</h1>
<form action="registercheck.jsp" method="POST">
<table>
	<tr>
		<td>
			用户名:
		</td> 
		<td> 
			<input type="text" placeholder="用户名" name="username"/>
		</td>
	</tr>
 	<tr>
 		<td> 
 			密码:
 		</td> 
 		<td>
 		<input type="text" placeholder="密码" name="mima"> 
 		</td>
 	</tr>
	<!-- <tr>
 	<td> 确认密码:</td> <td> <input  type="text" name="name" > </td>
 	</tr>-->
 	<tr> 
 		<td> 姓名:</td> <td> <input type="text" name="name"> </td>
 	</tr>
 	<tr>
 		<td> 身份证:</td> <td> <input type="text" name="householderid"> </td>
 	</tr>
 	<tr>
 		<td> 电话号:</td> <td> <input type="text" name="telnum"> </td>
 	</tr>
 	<tr>
 		<td> 类型：</td> <td><input name="Fruit" type="radio" value="1" >房东  &nbsp;<input name="Fruit" type="radio" value="2" >租户 &nbsp;<input name="Fruit" type="radio" value="3" >求租人</td>
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