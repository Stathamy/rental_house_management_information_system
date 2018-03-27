package Bean;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
public class renYuanZuLinJiLuChaXun {
    private String connStr = "jdbc:mysql://119.29.8.35:3306/RentingHouseMSDB?useUnicode=true&characterEncoding=utf-8&useSSL=false";
    private String dbusername = "RentingHouseMSDB";
    private String dbpassword = "hzau123456";
    public ResultSet renYuanZuLinLiShiChaXun1(String zuhushenfenzhenghao){
	java.sql.Connection conn = null;
    java.sql.Statement stmt = null;
    ResultSet rs=null;
    
    String sqlf;
	sqlf="SELECT  租户身份证号,房屋编号 ,入住日期, 离开日期    FROM 出租屋历史查询表  WHERE 租户身份证号= '"+ zuhushenfenzhenghao +"'";;
	
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
