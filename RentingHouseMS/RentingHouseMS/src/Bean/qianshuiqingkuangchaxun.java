package Bean;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
public class qianshuiqingkuangchaxun{

private String connStr = "jdbc:mysql://119.29.8.35:3306/RentingHouseMSDB?useUnicode=true&characterEncoding=utf-8&useSSL=false";
    private String dbusername = "RentingHouseMSDB";
    private String dbpassword = "hzau123456";

	public ResultSet qianshuiqingkuangchaxun1(String riqi){
		java.sql.Connection conn = null;
		java.sql.Statement stmt = null;
		ResultSet rs =null;
        try{
            // 注册 JDBC 驱动
            Class.forName("com.mysql.jdbc.Driver");
            // 打开链接
           conn = DriverManager.getConnection(connStr,dbusername,dbpassword);
            // 执行查询
            System.out.println(" 实例化Statement对...");
            stmt = conn.createStatement();
            String sql;
            sql = "SELECT 欠税表.日期,房主信息表.* FROM 欠税表 ,房主信息表 WHERE 欠税表.日期="+"\""+riqi+"\""+"AND 房主信息表.房主身份证号=欠税表.房主身份证号";//From 表   缴税日期, 
            rs = stmt.executeQuery(sql);
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