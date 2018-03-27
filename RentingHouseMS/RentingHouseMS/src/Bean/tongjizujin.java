package Bean;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class tongjizujin {
	  /*private String connStr = "jdbc:mysql://localhost:3306/testdb?useUnicode=true&characterEncoding=utf-8&useSSL=false";
    private String dbusername = "root";
    private String dbpassword = "12345678";*/
    private String connStr = "jdbc:mysql://119.29.8.35:3306/RentingHouseMSDB?useUnicode=true&characterEncoding=utf-8&useSSL=false";
    private String dbusername = "RentingHouseMSDB";
    private String dbpassword = "hzau123456";
	@SuppressWarnings("null")
	public ResultSet tongjizujin11(){
		java.sql.Connection conn = null;
	    java.sql.Statement stmt = null;
	    ResultSet rs=null;

	    String sqlf;
		sqlf="SELECT COUNT(租金)  FROM 房屋信息表  WHERE 租金 BETWEEN 0 AND  499";
		//sqlf2="SELECT COUNT(租金)  FROM 房屋信息表  WHERE 租金 BETWEEN 500 AND  999";
		//sqlf3="SELECT COUNT(租金)  FROM 房屋信息表  WHERE 租金 BETWEEN 1000 AND  1499";
		//sqlf4="SELECT COUNT(租金)  FROM 房屋信息表  WHERE 租金 BETWEEN 1500 AND  1999";
		try{
			// 注册 JDBC 驱动
			Class.forName("com.mysql.jdbc.Driver");
			// 打开链接
			
			conn = DriverManager.getConnection(connStr,dbusername,dbpassword);
	
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sqlf);
			
		    }catch(SQLException se){
		       // 处理 JDBC 错误
		       se.printStackTrace();
		    }catch(Exception e){
		       // 处理 Class.forName 错误
		       e.printStackTrace();
	    	}
		return rs;
			}
	
	}
	
