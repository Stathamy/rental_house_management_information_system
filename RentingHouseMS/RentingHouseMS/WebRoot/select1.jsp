
<%@ page language="java" import="java.util.*" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'select1.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
<style>
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
    width: 140x;    
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
  </head>
  
  <body>
    <center>
<form action="output1.jsp">
<fieldset>
<legend>合同查询:</legend>
<table>
	<tr>
		<td>
			房主身份证号:：</td>
		<td>
		 	<input type="text" name="householderid">
		</td>
	</tr>
	<tr>
		<td>
			租客身份证号：</td>
		<td>
		 	<input type="text" name="zukeid">
		</td>
	</tr>
	<tr>
		<td>
			合同编号：</td>
		<td>
		 	<input type="text" name="hetongid">
		</td>
	</tr>
	<tr>
		<td>
			房屋编号:
		</td>
		<td>
		 	<input type="text" name="houseid">
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
