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
    
    <title>房屋信息</title>
    
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
<jsp:useBean id="db" class="Bean.selectfangwuxinxi" scope="page" />
<%
    request.setCharacterEncoding("UTF-8");
    String householderid=(String)request.getParameter("householderid");
    String houseid=(String)request.getParameter("houseid");
    String province=(String)request.getParameter("province");
    String city=(String)request.getParameter("city");
    String neighbourhood=(String)request.getParameter("neighbourhood");
    boolean status;
    String sss=(String)request.getParameter("status");
    if(sss.equals("1")) status=true;
    else status=false;
    ResultSet rs=db.FangWuXinXiChaXun(householderid,houseid,province,city,neighbourhood,status);
    try {
	while(rs.next()){
           // 通过字段检索
       	String fangwubianhao= rs.getString("房屋编号");
       	String zujin  = rs.getString("租金");
       	String guojia  = rs.getString("国家");
       	String sheng  = rs.getString("省");
       	String shi = rs.getString("市");
       	String xian  = rs.getString("县");
       	String xiang = rs.getString("乡");
        String cun =rs.getString("村");
        String jiedao =rs.getString("街道");
        String xiaoqu =rs.getString("小区");
        String  menpaihao =rs.getString("门牌号");
        String jiedaohao =rs.getString("街道号");
        String fangwuchuzuqingkuang =rs.getString("房屋出租情况");
        
        out.print("<center><table border = \"1\" width=\"600\"><tr><th>  房屋编号</th><th>租金 </th><th>省</th><th>市</th><th>小区</th><th>房屋出租情况</th></tr>");
		out.print("<tr><td>  "+ fangwubianhao +" </td><td>"+ zujin +" </td><td>"+ sheng +" </td><td>"+ shi +" </td><td>"+ xiaoqu +" </td><td>"+ fangwuchuzuqingkuang +" </td></tr></table></center>");
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
