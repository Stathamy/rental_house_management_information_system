package Bean;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class renYuanXinXiChaXun {
	/*private String connStr = "jdbc:mysql://localhost:3306/testdb?useUnicode=true&characterEncoding=utf-8&useSSL=false";
    private String dbusername = "root";
    private String dbpassword = "12345678";*/
    private String connStr = "jdbc:mysql://119.29.8.35:3306/RentingHouseMSDB?useUnicode=true&characterEncoding=utf-8&useSSL=false";
    private String dbusername = "RentingHouseMSDB";
    private String dbpassword = "hzau123456";
	public ResultSet renyuanxinxichaxun1(String fangwubianhao,String fangzhushenfenzhenghao,String zujin,String sheng,String shi,String xiaoqu,boolean fangwuchuzuqingkuang){
		
		 /* #################################
		  * ͨ��������Ϣ��ѯ��Ա��Ϣ����Ա�����������⻧��
		  * char mubiao   ������Ϊh Ϊ��ѯ������Ϣ ������Ϊz  ��Ϊ�⻧��Ϣ
		  * String xinxi xinxiΪ����Ŀ��ľ���ֵ ��绰�ŵľ���ֵ�����ƺŵľ���ֵ
		  * int iΪ��ѯ��Ϣ�ı��룬�磺1����   ���ݱ�� ,2����   �������֤�� ,3����    ���,4����  ���ݳ������  ,5����    ����,6����    ʡ,7����    ��,
		  * 					  8����   �� ,9����    ��,10����    ��,11����   �ֵ� ,12����   С�� ,13����    ���ƺ�,14����   �ֵ��� 
		  * 					,15����   ��������,16����   �����绰;
		  * #################################
		  */

		java.sql.Connection conn = null;
	    java.sql.Statement stmt = null;
	    ResultSet rs=null;
	    String sqlf;
	    //String zuhushenfenzheng="";
		sqlf="SELECT ������Ϣ��.`��������`,������Ϣ��.`�����绰`,������Ϣ��.`�������֤��`  FROM ������Ϣ��,������Ϣ��   WHERE ������Ϣ��.`�������֤��`=������Ϣ��.`�������֤��` ";  
	    if(!fangwubianhao.equals("")){
	    	sqlf+=" AND ������Ϣ��.`���ݱ��`= '"+ fangwubianhao +"'";
	    }
		if(!fangzhushenfenzhenghao.equals("")){
			sqlf+=" AND ������Ϣ��.`�������֤��`='"+fangzhushenfenzhenghao+"'";
	    }
		if(!zujin.equals("")){
			sqlf+=" AND ������Ϣ��.`���`='"+zujin+"'";
	    }
		
		if(!sheng.equals("")){
	    	sqlf+=" AND ������Ϣ��.`ʡ`='"+sheng+"'";
	    }
		if(!shi.equals("")){
	    	sqlf+=" AND ������Ϣ��.`��`='"+shi+"'";
	    }
		if(!xiaoqu.equals("")){
	    	sqlf+=" AND ������Ϣ��.`С��`='"+xiaoqu+"'";
	    }
		if(fangwuchuzuqingkuang){
	    	sqlf+=" AND ������Ϣ��.`���ݳ������`='1'";
	    }
		else{
			sqlf+=" AND ������Ϣ��.`���ݳ������`='0'";
		}
		System.out.println(sqlf);
		 try{
				// ע�� JDBC ����
				Class.forName("com.mysql.jdbc.Driver");
				// ������
				conn = DriverManager.getConnection(connStr,dbusername,dbpassword);
				stmt = conn.createStatement();
				rs = stmt.executeQuery(sqlf);
		 	}catch(SQLException se){
		       // ���� JDBC ����
		    	System.out.println("SQL����");
		       se.printStackTrace();
		    }catch(Exception e){
		       // ���� Class.forName ����
		       e.printStackTrace();
	    	}
		 
			return rs;
			}
}
