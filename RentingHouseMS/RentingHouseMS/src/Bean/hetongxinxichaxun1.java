package Bean;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class hetongxinxichaxun1 {
	  /*private String connStr = "jdbc:mysql://localhost:3306/testdb?useUnicode=true&characterEncoding=utf-8&useSSL=false";
    private String dbusername = "root";
    private String dbpassword = "12345678";*/
    private String connStr = "jdbc:mysql://119.29.8.35:3306/RentingHouseMSDB?useUnicode=true&characterEncoding=utf-8&useSSL=false";
    private String dbusername = "RentingHouseMSDB";
    private String dbpassword = "hzau123456";
	public ResultSet HeTongXinXiChaXun1(String fangzhushenfenzhenghao,String zuhushenfenzhenghao,String hetongbianhao,String fangwubianhao){
		 /*
		  * �ú������ڲ�ѯHeTong�����Ϣ
		  * String name1Ϊ��������ݾ������ݣ��磺���֤������룬��ͬ�����Ϣ
		  * int iΪ�������ݱ�ţ���:1����    �������֤��, 2����    �⻧���֤��,  3����   ��ͬ���  , 4����     ���ݱ��
		  */
		java.sql.Connection conn = null;
		    java.sql.Statement stmt = null;
		    ResultSet rs=null;
		    boolean flag=false;
		    String sqlf;
			sqlf= "SELECT �������֤��, �⻧���֤��,  ��ͬ���  ,  ���ݱ��   FROM ��ͬ��  WHERE ";
	            //name1ΪString������Ҫ����˫��������SQL��ѯ 
			if(!fangzhushenfenzhenghao.equals("")){
		    	sqlf+=" ��ͬ��.`�������֤��`= '"+ fangzhushenfenzhenghao +"'";
		    	flag=true;
		    }
			if(!zuhushenfenzhenghao.equals("")){
				if(flag) sqlf+=" AND ";
		    	sqlf+=" ��ͬ��.`�⻧���֤��`= '"+ zuhushenfenzhenghao +"'";
		    	flag=true;
		    }
			if(!hetongbianhao.equals("")){
				if(flag) sqlf+=" AND ";
		    	sqlf+=" ��ͬ��.`��ͬ���`= '"+ hetongbianhao +"'";
		    	flag=true;
		    }
			
			if(!fangwubianhao.equals("")){
				if(flag) sqlf+=" AND ";
		    	sqlf+=" ��ͬ��.`���ݱ��`= '"+ fangwubianhao +"'";
		    	flag=true;
		    }
			
	           
	            
	            
	            try{
	        		// ע�� JDBC ����
	        		Class.forName("com.mysql.jdbc.Driver");
	        		// ������
	        		System.out.println("HeTongXinXiChaXun��ѯ...");
	        		conn = DriverManager.getConnection(connStr,dbusername,dbpassword);
	        		System.out.println(" ��ͬ��Ϣ��ѯ");
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
	        /*    ResultSet rs = stmt.executeQuery(sql);
	        
	            // չ����������ݿ�
	            while(rs.next()){
	                // ͨ���ֶμ���
	            	String fangzhushenfenzhenghao  = rs.getString("�������֤��");
	                 String zuhushenfenzhenghao  = rs.getString("�⻧���֤��");
	                 String hetongbiaohao = rs.getString("��ͬ���");
	                 String fangwubianhao= rs.getString("���ݱ��");
	                
	    
	                // �������
	                 System.out.print("�������֤��: " + fangzhushenfenzhenghao);
	                 System.out.print(", �⻧���֤��: " + zuhushenfenzhenghao);
	                 System.out.print(", ��ͬ���: " + hetongbiaohao);
	                 System.out.print(", ���ݱ��: " + fangwubianhao);
	                 System.out.print("\n");
	            }
	            // ��ɺ�ر�
	            rs.close();
	            stmt.close();
	            conn.close();*/
	}
	
	

