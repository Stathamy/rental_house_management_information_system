package Bean;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
public class qiuzuxinxifabu {
	private String connStr = "jdbc:mysql://119.29.8.35:3306/RentingHouseMSDB?useUnicode=true&characterEncoding=utf-8&useSSL=false";
private String dbusername = "RentingHouseMSDB";
private String dbpassword = "hzau123456";
public int qiuzuxinxifabu1(String qiuzurenshenfenzhenghao,String fangwusuozaisheng,String fangwusuozaishi,String fangwuhuxing,String jiagexiajie,String jiageshangjie)
{
	java.sql.Connection conn = null;
    java.sql.Statement stmt = null;
    int rs1=0;
    try{
        // 注册 JDBC 驱动
        Class.forName("com.mysql.jdbc.Driver");
    
        // 打开链接
        conn = DriverManager.getConnection(connStr,dbusername,dbpassword);
    
        stmt = conn.createStatement();
        String sql;
        sql="INSERT INTO 求租发布表 VALUES ("+"\""+qiuzurenshenfenzhenghao+"\","+"\""+fangwusuozaisheng+"\","+"\""+fangwusuozaishi+"\","+"\""+fangwuhuxing+"\","+"\""+jiagexiajie+"\","+"\""+jiageshangjie+"\"";
        		 rs1 = stmt.executeUpdate(sql);
        
    }catch(SQLException se){
        // 处理 JDBC 错误
        se.printStackTrace();
    }catch(Exception e){
        // 处理 Class.forName 错误
        e.printStackTrace();
    }finally{
    	
        // 关闭资源
        try{
            if(stmt!=null) stmt.close();
        }catch(SQLException se2){
        }// 什么都不做
        try{
            if(conn!=null) conn.close();
        }catch(SQLException se){
            se.printStackTrace();
        }
    }
	return rs1;
    }
}