package Bean;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
public class  weiguixinxichaxun{
 private String connStr = "jdbc:mysql://119.29.8.35:3306/RentingHouseMSDB?useUnicode=true&characterEncoding=utf-8&useSSL=false";
    private String dbusername = "RentingHouseMSDB";
    private String dbpassword = "hzau123456";


public ResultSet weiguixinxichaxun1(String fangzhushenfenzhenghao,String fangwubianhao,String zuhushenfenzhenghao,String hetongbianhao,String weiguileixing){

	   	String sqlf = "SELECT ���ݱ��,�⻧���֤��,��ͬ���,Υ������,Υ����Ϣ FROM Υ����Ϣ��  WHERE ";
	   	boolean flag = false;
	   	java.sql.Connection conn = null;
	   	java.sql.Statement stmt = null;
	   	ResultSet rs =null;
	   	
	   	
	   	if(!fangzhushenfenzhenghao.equals("")){
	    	sqlf+=" �������֤��= '"+ fangzhushenfenzhenghao +"'";
	    	flag=true;
	    }
		if(!fangwubianhao.equals("")){
			if(flag) sqlf+=" AND ";
			sqlf+="���ݱ��='"+fangwubianhao+"'";
			flag=true;
	    }
		if(!zuhushenfenzhenghao.equals("")){
			if(flag) sqlf+=" AND ";
	    	sqlf+="�⻧���֤��='"+zuhushenfenzhenghao+"'";
	    	flag=true;
	    }
		if(!hetongbianhao.equals("")){
			if(flag) sqlf+=" AND ";
	    	sqlf+="��ͬ���='"+hetongbianhao+"'";
	    	flag=true;
	    }
		if(!weiguileixing.equals("")){
			if(flag) sqlf+=" AND ";
	    	sqlf+="Υ������ ='"+weiguileixing+"'";
	    	flag=true;
	    }
		
	   	
	   	
	        try{
	            // ע�� JDBC ����
	            Class.forName("com.mysql.jdbc.Driver");
	            conn = DriverManager.getConnection(connStr,dbusername,dbpassword);
	            // ִ�в�ѯ
	            System.out.println(" ʵ����Statement��...");
	            stmt = conn.createStatement();
	            rs = stmt.executeQuery(sqlf);
	            System.out.println(sqlf);
	            System.out.println(rs);
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