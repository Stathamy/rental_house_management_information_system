<%@ page language="java" import="java.sql.*" import="Bean.selectfangwuxinxi" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>求租信息发布</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
</head>
<body>
<jsp:useBean id="db" class="Bean.qiuzuxinxifabu" scope="page" />
<%
    request.setCharacterEncoding("UTF-8");
    String householderid=(String)request.getParameter("householderid");
    String province=(String)request.getParameter("province");
    String city=(String)request.getParameter("city");
    String housetype=(String)request.getParameter("housetype");
    String upper=(String)request.getParameter("upper");
    String lower=(String)request.getParameter("lower");
    int rs=db.qiuzuxinxifabu1(householderid, province, city, housetype, lower, upper);
	out.print("发布情况: ");
	if(rs==1)
        out.print("success!");
    else
    	out.print("failed!");
    out.print("<br>");

 %>
</body>
</html>
