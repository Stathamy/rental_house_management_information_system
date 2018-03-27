<%@ page import="java.sql.*" language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head> 
<meta charset="utf-8"> 
<title>welcome</title> 
<style>



h1{
  
	border:2px solid #a1a1a1;
	padding:10px 40px; 
	background:;
	width:240px;
	border-radius:40px;

}
img { 
    
    opacity: 0.7;
}
.container {
    position: relative;
}

.topleft {
    position: absolute;
    top: 8px;
    left: 16px;
    font-size: 18px;
}

.but{    
    width: 330px;    
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
html{    
    width: 100%;    
    height: 100%;    
    overflow: hidden;    
    font-style: sans-serif;    
}    
body{   
    background-color:#b0c4de; 
    width: 100%;    
    height: 100%;    
    font-family: 'Open Sans',sans-serif;    
    margin: 0;    
      
}    
#login{    
    position: absolute;    
    top: 50%;    
    left:50%;    
    margin: -150px 0 0 -150px;    
    width: 300px;    
    height: 300px;    
}    
#login h2{    
    color:#FFF ;    
    text-shadow:0 0 10px;    
    letter-spacing: 1px;    
    text-align: center;    
}    
h2{    
    font-size: 2em;    
    margin: 0.67em 0;     
</style>
</head>
<body>
<div class="container">
<img border="0" src="http://www.86ps.com/sc/fj/157/csyj_014007.jpg" alt="Pulpit rock" width="100%" height="100%">
<div class="topleft">小组成员：田镇国，刘伟琦，万昊楠，袁伟乔</div>
</div>
</body>
<body>
<center>


<div id="login">
<table>
<tr>
<td>
<h1>出租屋管理系统</h1>
</td>
</tr>
<tr>
<td>
<h2>welcome</h2>
</td>
</tr>
<tr>
<td>
&nbsp;&nbsp;<input type="button" value="继续" class=but  onclick="window.location.href='login.jsp'"/>
</td>
</tr>
</table>
</div>
</center>

</body>
</html>