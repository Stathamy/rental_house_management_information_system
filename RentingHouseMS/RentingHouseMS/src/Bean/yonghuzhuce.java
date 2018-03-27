package Bean;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class yonghuzhuce {
	private String connStr = "jdbc:mysql://119.29.8.35:3306/RentingHouseMSDB?useUnicode=true&characterEncoding=utf-8&useSSL=false";
	private String dbusername = "RentingHouseMSDB";
	private String dbpassword = "hzau123456";//issuccess判断是否重复用户名
	public int  yonghuzhuce1(String yonghuming,String mima,String xingming,String shenfenzhenghao,String dianhua,int yonghuleixing){
		
		java.sql.Connection conn = null;
	    java.sql.Statement stmt = null;
	    int issuccess=2;
	        try{
	            // 注册 JDBC 驱动
	            Class.forName("com.mysql.jdbc.Driver");
	            // 打开链接
	            System.out.println("连接数据库...");
	            conn = DriverManager.getConnection(connStr,dbusername,dbpassword);
	            stmt = conn.createStatement();
	            String sql;
                sql="SELECT 用户名 FROM 用户登录信息表  WHERE 用户名="+"\""+yonghuming+"\"";
                ResultSet rs2 = stmt.executeQuery(sql);
                if(rs2.next())
                {
                	issuccess=0;
                }
                else if(yonghuleixing==1)
	            {
                    sql = " INSERT INTO 用户登录信息表 VALUES ("+"\""+yonghuming+"\","+"\""+mima+"\","+"\""+shenfenzhenghao+"\")";
                    stmt.executeUpdate(sql);
	                sql = " INSERT INTO 房主信息表 VALUES ("+"\""+shenfenzhenghao+"\","+"\""+xingming+"\","+"\""+dianhua+"\")";
	                stmt.executeUpdate(sql);
                    issuccess=1;
                }
                else if(yonghuleixing==2)
                {
                    sql = "INSERT INTO 用户登录信息表 VALUES ("+"\""+yonghuming+"\","+"\""+mima+"\","+"\""+shenfenzhenghao+"\")";
                    stmt.executeUpdate(sql);
                    System.out.println(sql);
	                sql = "INSERT INTO 租户信息表 VALUES ("+"\""+xingming+"\","+"\""+shenfenzhenghao+"\","+"\""+dianhua+"\")";
	                System.out.println(sql);
	                stmt.executeUpdate(sql);
                    issuccess=1;
                }
                else if(yonghuleixing==3)
                {
                	sql = "INSERT INTO 用户登录信息表 VALUES ("+"\""+yonghuming+"\","+"\""+mima+"\","+"\""+shenfenzhenghao+"\")";
                    stmt.executeUpdate(sql);
	                sql = "INSERT INTO 求租人账户信息表 VALUES ("+"\""+xingming+"\","+"\""+shenfenzhenghao+"\","+"\""+dianhua+"\")";
	                stmt.executeUpdate(sql);
                    issuccess=1;
                }
	        }catch(SQLException se){
	            // 处理 JDBC 错误
	            se.printStackTrace();
	        }catch(Exception e){
	            // 处理 Class.forName 错误
	            e.printStackTrace();
	        }
	        return issuccess;
	}
	
}