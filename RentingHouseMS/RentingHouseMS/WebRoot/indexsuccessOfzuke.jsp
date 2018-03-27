
<%@ page import="java.sql.*" language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>租客登陆成功</title>
<style>
html{
	background-image:url(stone.jpg); 
	background-size:cover;  
}
h1
{
	text-shadow: 5px 5px 5px #FF0000;
}

<style>
h1
{
	text-shadow: 5px 5px 5px #FF0000;
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
</head>
<body>
<center>
<form action=" ">
<fieldset>
<legend>已登录请选择操作：</legend>
<a href="select1-2.jsp" class=but>合同信息查询</a><br>
<a href="select6.jsp"class=but>欠税情况查询</a><br/>
<a href="select7.jsp"class=but>房屋信息查询</a><br/>
<a href="select9.jsp"class=but>出租房屋违规信息查询</a><br/>
<a href="select8.jsp"class=but>房屋出租历史查询</a><br/>
<a href="houseneed.jsp"class=but>求租发布</a><br/>
<a href="ttt.jsp" class=but>租金查询</a><br/>
</fieldset>
</form>
</center>
</body>
</html>
