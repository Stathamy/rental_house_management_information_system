<%@ page language="java" import="java.sql.*" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    <script type="text/javascript">
    function setTableTdTitle(){  
    $(".list_table_fixed tbody tr").each(function(){  
        $(this).children("td").not("#fixedtd").mouseover(function () {  
            $(this).attr("title", $(this).text());  
        });  
    });  
}  
    </script>
  
    <title>合同输出界面</title>
    
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
		table{
		table-layout: fixed;
		}
		td {
		width= 100 ;white-space:nowrap;overflow:hidden;text-overflow: ellipsis;title= setTableTdTitle();
		}
	</style>
	
</head>

<%!
	String hetongxinxi;
	String fangzhushenfenzhenghao;
	String zuhushenfenzhenghao;
	String hetongbiaohao;
	String fangwubianhao; %>
<body>

<center>
<form action=" ">
<fieldset>
<legend>合同信息：</legend>


</fieldset>
</form>

<jsp:useBean id="db" class="Bean.hetongxinxichaxun1" scope="page" />
<%
    request.setCharacterEncoding("UTF-8");
    String householderid=(String)request.getParameter("householderid");
    String zukeid=(String)request.getParameter("zukeid");
    String hetongid=(String)request.getParameter("hetongid");
    String houseid=(String)request.getParameter("houseid");
    ResultSet rs=db.HeTongXinXiChaXun1(householderid,zukeid,hetongid,houseid);
    try {
	while(rs.next()){
           // 通过字段检索
       				 fangzhushenfenzhenghao  = rs.getString("房主身份证号");
	                 zuhushenfenzhenghao  = rs.getString("租户身份证号");
	                 hetongbiaohao = rs.getString("合同编号");
	                 fangwubianhao= rs.getString("房屋编号");
	                // 输出数据
	                 out.print("<center><table border = \"1\" width=\"600\"><tr><th>  房主身份证号: </th><th>租户身份证号: </th><th>合同编号: </th><th>房屋编号: </th></tr>");
	                 out.print("<tr><td >  "+fangzhushenfenzhenghao+" </td><td>"+zuhushenfenzhenghao+" </td><td>"+hetongbiaohao+" </td><td>"+fangwubianhao+"</td></tr></table></center>");
	                 out.print("<br>");
	            }
	            // 完成后关闭
	            rs.close();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	hetongxinxi="Owner ID number:"+fangzhushenfenzhenghao+"\tTenant ID number"+zuhushenfenzhenghao+"\tContract number"+hetongbiaohao+"\tHouse number"+fangwubianhao+"\t";
	hetongxinxi=java.net.URLEncoder.encode(hetongxinxi,"UTF-8");
 %>
 <br>
<a href="download.jsp?hetongxinxi=<%=hetongxinxi %>" class=but >文档下载</a><br>
</center>
</body>
</html>
