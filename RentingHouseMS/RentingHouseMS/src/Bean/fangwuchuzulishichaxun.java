package Bean;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class fangwuchuzulishichaxun
{
	private String connStr = "jdbc:mysql://119.29.8.35:3306/RentingHouseMSDB?useUnicode=true&characterEncoding=utf-8&useSSL=false";
    private String dbusername = "RentingHouseMSDB";
    private String dbpassword = "hzau123456";
	public ResultSet  fangwuchuzulishichaxun1(String fangwubianhao){
	   	java.sql.Connection conn = null;
	   	java.sql.Statement stmt = null;
	   	ResultSet rs = null;
        // 注册 JDBC 驱动
        try {
			Class.forName("com.mysql.jdbc.Driver");
		
        
			conn = DriverManager.getConnection(connStr,dbusername,dbpassword);
        // 执行查询
        System.out.println(" 实例化Statement对...");
        stmt = conn.createStatement();
        String sql;
        sql = "SELECT 房屋编号,入住日期,租户身份证号,离开日期 FROM 出租屋历史查询表 WHERE 房屋编号='"+fangwubianhao+"'";//From 表   缴税日期, 
        rs = stmt.executeQuery(sql);
        } catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        return rs;
        
		}
	}


