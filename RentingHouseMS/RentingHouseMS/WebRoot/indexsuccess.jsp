<%@ page import="java.sql.*" language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>登陆成功</title>
<style>
html{
	background-image:url(stone.jpg); 
	background-size:cover;  
}
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
<!-- 1、合同信息查询12345
2、人员信息查询
3、人员租赁历史记录
4、出租人帐户信息查询
5、税费交纳记录查询
6、欠税情况查询
7、房屋信息查询
8、出租房屋违规信息查询
9、房屋出租历史查询
 -->
<body>
<center>
<form action="">
<fieldset>
<legend>已登录请选择操作：</legend><br><br>
<a href="select1.jsp"  class=but>合同信息查询</a><br><br><br>
<a href="select2.jsp"  class=but>人员信息查询</a><br><br><br>
<a href="select3.jsp" class=but >人员租赁历史记录</a><br><br><br>
<a href="select4.jsp"class=but>出租人帐户信息查询</a><br><br><br>
<a href="select5.jsp"class=but>税费交纳记录查询</a><br><br><br>
<a href="houseinput.jsp"class=but>房屋信息录入</a><br><br><br>
</fieldset>
</form>
</center>
</body>
</html>

