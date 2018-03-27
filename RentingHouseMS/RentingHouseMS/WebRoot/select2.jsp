<%@ page language="java" import="java.util.*" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<meta charset="utf-8">
<title>房屋查询</title>
</head>
<style type="text/css">
h1
{
	text-shadow: 5px 5px 5px #FF0000;
}
body
{
	background-color:#b0c4de;
}
input{    
      
    margin-bottom: 10px;    
    outline: none;    
    padding: 10px;    
    font-size: 13px;    
    color: ;    
    text-shadow:1px 1px 1px;    
    border-top: 1px solid #312E3D;    
    border-left: 1px solid #312E3D;    
    border-right: 1px solid #312E3D;    
    border-bottom: 1px solid #56536A;    
    border-radius: 4px;    
    background-color: #E0FFFF;    
}    
.but{    
    width: 300px;    
    min-height: 20px;    
    display: block;    
    background-color: #4a77d4;    
    border: 1px solid #3762bc;    
    color: #fff;    
    padding: 9px 14px;    
    font-size: 15px;    
    line-height: normal;    
    border-radius: 5px;    
    margin: 0;    
}   
</style>
<body>
<center>
<form action="output2.jsp">
<fieldset>
<legend>房东信息查询:</legend>
<table>
	<tr>
		<td>
			房屋编号:
		</td>
		<td>
		 	<input type="text" name="houseid">
		</td>
	</tr>
	<tr>
		<td>
			房主身份证号:
		</td>
		<td>
		 	<input type="text" name="householderid">
		</td>
	</tr>
	<tr>
		<td>
			租金:
		</td>
		<td>
		 	<input type="text" name="zujin">
		</td>
	</tr>
	<tr>
		<td>
			省:
		</td>
		<td>
		 	<input type="text" name="province">
		</td>
	</tr>

	<tr>
		<td>
			市:
		</td>
		<td>
		 	<input type="text" name="city">
		</td>
	</tr>
	<tr>
		<td>
			小区:
		</td>
		<td>
		 	<input type="text" name="neighbourhood">
		</td>
	</tr>
	<tr>
		<td>
			是否已出租:
		</td>
		<td>
		 	&nbsp;&nbsp;&nbsp;<input type="radio" name="status" value="1">是  
		 	&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="radio" name="status" value="0">否
		</td>
	</tr>
</table>

<table>
	<tr>
		<td>
<input type="button" value="后退" class=but  onclick="window.location.href='indexsuccess.jsp'"/>
		</td>

		<td>
<input type="submit" value="查询" class=but />
		</td>
	</tr>
</table>
</fieldset>
</form>
</center>
</body>
</html>

