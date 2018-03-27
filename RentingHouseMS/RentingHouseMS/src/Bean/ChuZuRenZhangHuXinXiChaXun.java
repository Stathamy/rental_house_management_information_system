package Bean;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ChuZuRenZhangHuXinXiChaXun {
	 /*private String connStr = "jdbc:mysql://localhost:3306/testdb?useUnicode=true&characterEncoding=utf-8&useSSL=false";
    private String dbusername = "root";
    private String dbpassword = "12345678";*/
    private String connStr = "jdbc:mysql://119.29.8.35:3306/RentingHouseMSDB?useUnicode=true&characterEncoding=utf-8&useSSL=false";
    private String dbusername = "RentingHouseMSDB";
    private String dbpassword = "hzau123456";
	public ResultSet ChuZuRenZhangHuXinXiChaXun1(String Fangzhushenfenzhenghao){
		java.sql.Connection conn = null;
	    java.sql.Statement stmt = null;
	    ResultSet rs=null;
	   
	    String sqlf;
	  
		sqlf="SELECT 房主身份证号,账户编号,缴税日期,缴费金额 ,结余余额 FROM 房主账户信息表  WHERE 房主身份证号='"+ Fangzhushenfenzhenghao +"'";
		 try{
				// 注册 JDBC 驱动
				Class.forName("com.mysql.jdbc.Driver");
				// 打开链接
				System.out.println("ChuZuRenZhangHuXinXiChaXun1查询...");
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

