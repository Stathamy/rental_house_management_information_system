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
	sqlf="SELECT  �⻧���֤��,���ݱ�� ,��ס����, �뿪����    FROM ��������ʷ��ѯ��  WHERE �⻧���֤��= '"+ zuhushenfenzhenghao +"'";;
	
	try{
		// ע�� JDBC ����
		Class.forName("com.mysql.jdbc.Driver");
		// ������
		conn = DriverManager.getConnection(connStr,dbusername,dbpassword);
		stmt = conn.createStatement();
		rs = stmt.executeQuery(sqlf);
		
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
