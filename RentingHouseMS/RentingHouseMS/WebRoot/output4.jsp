<%@ page language="java" import="java.sql.*" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
  	<style>
		table{
		table-layout: fixed;
		}
		td {
		width= 100 ;white-space:nowrap;overflow:hidden;text-overflow: ellipsis;title= setTableTdTitle();
		}
	</style>
    <base href="<%=basePath%>">
    
    <title>出租人帐户信息</title>
    
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
<jsp:useBean id="db" class="Bean.ChuZuRenZhangHuXinXiChaXun" scope="page" />
<%
    request.setCharacterEncoding("UTF-8");
    String householderid=(String)request.getParameter("householderid");
    ResultSet rs=db.ChuZuRenZhangHuXinXiChaXun1(householderid);
    try {
	while(rs.next()){
		// 通过字段检索
		String fangzhushenfenzhenghao = rs.getString("房主身份证号");
		String jiaoshuiriqi = rs.getString("缴税日期");
		String jiaofeijine = rs.getString("缴费金额");
		String zhanghubianhao = rs.getString("账户编号");
		// 输出数据
		out.print("<center><table border = \"1\" width=\"600\"><tr><th>房主身份证号</th><th>缴税日期 </th><th>缴费金额 </th><th>账户编号</th></tr>");
		out.print("<tr><td>  "+ fangzhushenfenzhenghao +" </td><td>"+ jiaoshuiriqi +" </td><td>"+ jiaofeijine +" </td><td>"+ zhanghubianhao +" </td></tr></table></center>");
		out.print("<br>");
	}
	// 完成后关闭
	rs.close();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
 %>
</body>
</html>
