<%@ page import="java.sql.*" import="Bean.DBBean" language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8"><!--ISO-8859-1-->
<title>Insert title here</title>
</head>
<body>
<jsp:useBean id="db" class="Bean.DBBean" scope="page" />
<%
    request.setCharacterEncoding("UTF-8");
    String username=(String)request.getParameter("username");
    String password=(String)request.getParameter("password");
    String shenfen=(String)request.getParameter("shenfen");
    //取出login.jsp的值
    
    //下面是数据库操作
    
    String sql="select 密码  from 用户登录信息表    where 用户名 =\""+username+"\"";//定义一个查询语句
    ResultSet rs=db.executeQuery(sql);//运行上面的语句
    if(rs.next())
    {
        /* if(password.equals(rs.getString(2)))
        {
            
        } */
        if(password.equals(rs.getObject("密码"))){
        	if(shenfen==null){
        	out.print("<script language='javaScript'> alert('未选择身份');</script>");
            response.setHeader("refresh", "0;url=login.jsp");
            }
            else{
        	if("房东".equals(shenfen)){
            response.sendRedirect("indexsuccess.jsp");
            }
            else{
            response.sendRedirect("indexsuccessOfzuke.jsp");
            }
            }
        }
        else{
            out.print("<script language='javaScript'> alert('密码错误');</script>");
            response.setHeader("refresh", "0;url=login.jsp");
        }
    }
    else 
    {
        out.print("<script language='javaScript'> alert('账号错误——else');</script>");
        response.setHeader("refresh", "0;url=login.jsp");
    }
    
%>
</body>
</html>