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
            // ע�� JDBC ����
            Class.forName("com.mysql.jdbc.Driver");
            // ������
           conn = DriverManager.getConnection(connStr,dbusername,dbpassword);
            // ִ�в�ѯ
            System.out.println(" ʵ����Statement��...");
            stmt = conn.createStatement();
            String sql;
            sql = "SELECT Ƿ˰��.����,������Ϣ��.* FROM Ƿ˰�� ,������Ϣ�� WHERE Ƿ˰��.����="+"\""+riqi+"\""+"AND ������Ϣ��.�������֤��=Ƿ˰��.�������֤��";//From ��   ��˰����, 
            rs = stmt.executeQuery(sql);
        }catch(SQLException se){
            // ���� JDBC ����
            se.printStackTrace();
        }catch(Exception e){
            // ���� Class.forName ����
            e.printStackTrace();
        }
    return rs;
   }
}	