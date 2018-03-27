package Bean;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class renYuanXinXiChaXun {
	/*private String connStr = "jdbc:mysql://localhost:3306/testdb?useUnicode=true&characterEncoding=utf-8&useSSL=false";
    private String dbusername = "root";
    private String dbpassword = "12345678";*/
    private String connStr = "jdbc:mysql://119.29.8.35:3306/RentingHouseMSDB?useUnicode=true&characterEncoding=utf-8&useSSL=false";
    private String dbusername = "RentingHouseMSDB";
    private String dbpassword = "hzau123456";
	public ResultSet renyuanxinxichaxun1(String fangwubianhao,String fangzhushenfenzhenghao,String zujin,String sheng,String shi,String xiaoqu,boolean fangwuchuzuqingkuang){
		
		 /* #################################
		  * 通过房屋信息查询人员信息，人员包括房主和租户、
		  * char mubiao   若参数为h 为查询户主信息 若参数为z  则为租户信息
		  * String xinxi xinxi为查找目标的具体值 如电话号的具体值，门牌号的具体值
		  * int i为查询信息的编码，如：1代表   房屋编号 ,2代表   房主身份证号 ,3代表    租金,4代表  房屋出租情况  ,5代表    国家,6代表    省,7代表    市,
		  * 					  8代表   县 ,9代表    乡,10代表    村,11代表   街道 ,12代表   小区 ,13代表    门牌号,14代表   街道号 
		  * 					,15代表   房主姓名,16代表   房主电话;
		  * #################################
		  */

		java.sql.Connection conn = null;
	    java.sql.Statement stmt = null;
	    ResultSet rs=null;
	    String sqlf;
	    //String zuhushenfenzheng="";
		sqlf="SELECT 房主信息表.`房主姓名`,房主信息表.`房主电话`,房主信息表.`房主身份证号`  FROM 房屋信息表,房主信息表   WHERE 房屋信息表.`房主身份证号`=房主信息表.`房主身份证号` ";  
	    if(!fangwubianhao.equals("")){
	    	sqlf+=" AND 房屋信息表.`房屋编号`= '"+ fangwubianhao +"'";
	    }
		if(!fangzhushenfenzhenghao.equals("")){
			sqlf+=" AND 房屋信息表.`房主身份证号`='"+fangzhushenfenzhenghao+"'";
	    }
		if(!zujin.equals("")){
			sqlf+=" AND 房屋信息表.`租金`='"+zujin+"'";
	    }
		
		if(!sheng.equals("")){
	    	sqlf+=" AND 房屋信息表.`省`='"+sheng+"'";
	    }
		if(!shi.equals("")){
	    	sqlf+=" AND 房屋信息表.`市`='"+shi+"'";
	    }
		if(!xiaoqu.equals("")){
	    	sqlf+=" AND 房屋信息表.`小区`='"+xiaoqu+"'";
	    }
		if(fangwuchuzuqingkuang){
	    	sqlf+=" AND 房屋信息表.`房屋出租情况`='1'";
	    }
		else{
			sqlf+=" AND 房屋信息表.`房屋出租情况`='0'";
		}
		System.out.println(sqlf);
		 try{
				// 注册 JDBC 驱动
				Class.forName("com.mysql.jdbc.Driver");
				// 打开链接
				conn = DriverManager.getConnection(connStr,dbusername,dbpassword);
				stmt = conn.createStatement();
				rs = stmt.executeQuery(sqlf);
		 	}catch(SQLException se){
		       // 处理 JDBC 错误
		    	System.out.println("SQL错误");
		       se.printStackTrace();
		    }catch(Exception e){
		       // 处理 Class.forName 错误
		       e.printStackTrace();
	    	}
		 
			return rs;
			}
}
