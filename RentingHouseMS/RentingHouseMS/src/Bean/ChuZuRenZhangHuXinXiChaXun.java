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
	  
		sqlf="SELECT �������֤��,�˻����,��˰����,�ɷѽ�� ,������� FROM �����˻���Ϣ��  WHERE �������֤��='"+ Fangzhushenfenzhenghao +"'";
		 try{
				// ע�� JDBC ����
				Class.forName("com.mysql.jdbc.Driver");
				// ������
				System.out.println("ChuZuRenZhangHuXinXiChaXun1��ѯ...");
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

