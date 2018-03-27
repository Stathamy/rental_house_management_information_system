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
    <title>register....</title>
    <script language="JavaScript1.2" type="text/javascript"> 
	function delayURL(url) { 
	var delay=document.getElementById("time").innerHTML; 
	//最后的innerHTML不能丢，否则delay为一个对象 
	if(delay>0){ 
	delay--; 
	document.getElementById("time").innerHTML=delay; 
	}else{ 
	window.top.location.href=url; 
	}
	setTimeout("delayURL('" + url + "')", 1000); 
	//此处1000毫秒即每一秒跳转一次 
	} 
	</script> 
	<span id="time" style="background: blue">5</span> 
	秒钟之后自动跳转，如果不跳转，请点击下面链接 <br>
	<!-- <script type="text/javascript">
	delayURL("indexsuccessOfzuke.jsp"); 
	</script>   -->
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
</head>
<%!int leixing; %>
<body>

<jsp:useBean id="db" class="Bean.yonghuzhuce" scope="page" />
<%
    request.setCharacterEncoding("UTF-8");
    String username=(String)request.getParameter("username");
    String mima=(String)request.getParameter("mima");
    String name=(String)request.getParameter("name");
    String householderid=(String)request.getParameter("householderid");
    String telnum=(String)request.getParameter("telnum");
    String Fruit=(String)request.getParameter("Fruit");
    
    if(Fruit.equals("1")) leixing=1;
    else if(Fruit.equals("2")) leixing=2;
    else leixing=3;
    int rs=db.yonghuzhuce1(username, mima, name, householderid, telnum, leixing);
	out.print("注册情况: ");
	if(rs==1)
    {
    	out.print("success!");
    	if(leixing==1)
    		{out.print("<script type=\"text/javascript\">");
			out.print("delayURL(\"indexsuccess.jsp\"); ");
			out.print("</script>");
			out.print("</script><a href=\"javascript:\" onClick=\"delayURL('indexsuccess.jsp','4000')\">操作选择</a> ");
			}
    	else
    		{
    		out.print("<script type=\"text/javascript\">");
			out.print("delayURL(\"indexsuccessOfzuke.jsp\"); ");
			out.print("</script>");
    		out.print("<a href=\"javascript:\" onClick=\"delayURL('indexsuccessOfzuke.jsp','4000')\">操作选择</a> ");
    		}
    }
    else
    {
    	out.print("failed!");
    	out.print("<script type=\"text/javascript\">");
		out.print("delayURL(\"login.jsp\"); ");
		out.print("</script>");
    	out.print("<a href=\"javascript:\" onClick=\"delayURL('login.jsp','4000')\">登录界面</a> ");
   	}
    out.print("<br>");

 %>

</body>
</html>
