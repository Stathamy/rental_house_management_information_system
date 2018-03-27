<%@ page import="java.sql.*" language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>登录界面</title>
<style>

html{    
    width: 100%;    
    height: 100%;    
    overflow: hidden;    
    font-style: sans-serif;
    background-image:url(loginbgp.jpg); 
	background-size:cover;  
}    
body{   

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
#login h1{    
    color: #fff;    
    text-shadow:0 0 10px;    
    letter-spacing: 1px;    
    text-align: center;    
}    
h1{    
    font-size: 2em;    
    margin: 0.67em 0;    
}    
input{    
    margin-bottom: 10px;    
    outline: none;    
    padding: 10px;    
    font-size: 13px;    
    color:;    
    text-shadow:1px 1px 1px;    
    border-top: 1px solid #312E3D;    
    border-left: 1px solid #312E3D;    
    border-right: 1px solid #312E3D;    
    border-bottom: 1px solid #56536A;    
    border-radius: 4px;    
    background-color: #E0FFFF ;    
}    
.but{    
    width: 140px;    
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
<body>
    <div  id= "login">
        <h1>login</h1>
            <form id="indexform" name="indexForm" action="indexcheck.jsp" method="post">
          <table border="1" width=295 >
          <tr> <th>身份：</th><td>&nbsp;&nbsp;&nbsp;<input type="radio" name="shenfen" value="房东">房东
          &nbsp;&nbsp;&nbsp;<input type="radio" name="shenfen"value="租户">租户</td>
          </tr>
          </table>
          <table>
               	<tr>
                		
                    <tr>
                      
                      <td>&nbsp;<input type="text"  placeholder="账号"name="username" size="35"></td>
                    </tr>
                    <tr>
                       
                        <td>&nbsp;<input type="password"  placeholder="密码"name="password" size="35">
                        </td>
                    </tr>
                </table>
             <table>
              <tr>
            	<td><button  type="button" class=but    onclick="window.location.href='register.jsp'" >注册</button></td>
               <td><button class="but" type="submit">登录</button></td>
            </tr>
            </table>
            </form>
            </div>
   
</body>
</html>