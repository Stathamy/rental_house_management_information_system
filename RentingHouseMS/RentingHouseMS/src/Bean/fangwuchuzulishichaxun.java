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
        // ע�� JDBC ����
        try {
			Class.forName("com.mysql.jdbc.Driver");
		
        
			conn = DriverManager.getConnection(connStr,dbusername,dbpassword);
        // ִ�в�ѯ
        System.out.println(" ʵ����Statement��...");
        stmt = conn.createStatement();
        String sql;
        sql = "SELECT ���ݱ��,��ס����,�⻧���֤��,�뿪���� FROM ��������ʷ��ѯ�� WHERE ���ݱ��='"+fangwubianhao+"'";//From ��   ��˰����, 
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


