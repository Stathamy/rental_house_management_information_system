package Bean;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
public class chuzufabu {
	private String connStr = "jdbc:mysql://119.29.8.35:3306/RentingHouseMSDB?useUnicode=true&characterEncoding=utf-8&useSSL=false";
private String dbusername = "RentingHouseMSDB";
private String dbpassword = "hzau123456";
public int chuzufabufabu1(String fangzhushenfenzhenghao,String fangwusuozaisheng,String fangwusuozaishi,String mianji,String fangwuhuxing,String zujin,String fangwubianhao)
{
	java.sql.Connection conn = null;
    java.sql.Statement stmt = null;
    int rs1=0;
    try{
        // ע�� JDBC ����
        Class.forName("com.mysql.jdbc.Driver");
    
        // ������
        conn = DriverManager.getConnection(connStr,dbusername,dbpassword);
    
        stmt = conn.createStatement();
        String sql;
        sql="INSERT INTO ���ⷢ���� VALUES ("+"\""+fangzhushenfenzhenghao+"\","+"\""+fangwusuozaisheng+"\","+"\""+fangwusuozaishi+"\","+"\""+mianji+"\","+"\""+fangwuhuxing+"\","+"\""+zujin+"\","+"\""+fangwubianhao+"\"";
        		 rs1 = stmt.executeUpdate(sql);
        
    }catch(SQLException se){
        // ���� JDBC ����
        se.printStackTrace();
    }catch(Exception e){
        // ���� Class.forName ����
        e.printStackTrace();
    }
	return rs1;
    }
}