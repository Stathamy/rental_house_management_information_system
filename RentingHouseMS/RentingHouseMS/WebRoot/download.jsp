<%@ page language="java" import="java.util.*" import="java.NET.URL.*" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@taglib prefix ="c" uri ="http://java.sun.com/jsp/jstl/core"%>   
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'download.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  <%!	String tmpStr; %>
  <body>
  
   <%//直接写入内容生成文件
    String   filename   ="contract.txt";//将Hello Stream这个字符串写入了response对象的输出流并生成这个文件
	response.setContentType("APPLICATION/OCTET-STREAM");
	response.setHeader("Content-Disposition","attachment;filename=\""   +   filename   +   "\"");
	tmpStr = request.getParameter("hetongxinxi");
	tmpStr = java.net.URLDecoder.decode(tmpStr,"utf-8");
	byte[]   b   =  tmpStr.getBytes();
	int   len = b.length;
	response.getOutputStream().write(b,0,len);
	response.getOutputStream().close();  %>
  </body>
</html>
