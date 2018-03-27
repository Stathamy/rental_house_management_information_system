<%@ page language="java" import="java.sql.*" import="Bean.selectfangwuxinxi" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
  	<style>
			h1
			{
				text-shadow: 5px 5px 5px #FF0000;
			}
			body
			{
				background-color:#b0c4de;
			}
		table{
		table-layout: fixed;
		}
		td {
		width= 100 ;white-space:nowrap;overflow:hidden;text-overflow: ellipsis;title= setTableTdTitle();
		}
	</style>
    <base href="<%=basePath%>">
    
    <title>My JSP 'output7.jsp' starting page</title>
    
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
<jsp:useBean id="db" class="Bean.qianshuiqingkuangchaxun" scope="page" />
<%
    request.setCharacterEncoding("UTF-8");
    String data=(String)request.getParameter("data");
    ResultSet rs=db.qianshuiqingkuangchaxun1(data);
    try {
	while(rs.next()){
           // 通过字段检索
		String fangzhushenfenzhenghao  = rs.getString("房主身份证号");
		String fangzhuxingming =rs.getString("房主姓名");
	    String fangzhudianhua =rs.getString("房主电话");
	   // 输出数据
	    out.print("<center><table border = \"1\" width=\"600\"><tr><th>  房主身份证号</th><th>房主姓名 </th><th>房主电话 </th></tr>");
		out.print("<tr><td>  "+fangzhushenfenzhenghao+" </td><td>"+fangzhuxingming+" </td><td>"+fangzhudianhua+" </td></tr></table></center>");
        out.print("<br>");
       }
   	rs.close();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
 %>
</body>
</html>
