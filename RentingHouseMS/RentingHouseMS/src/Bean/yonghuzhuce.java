package Bean;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class yonghuzhuce {
	private String connStr = "jdbc:mysql://119.29.8.35:3306/RentingHouseMSDB?useUnicode=true&characterEncoding=utf-8&useSSL=false";
	private String dbusername = "RentingHouseMSDB";
	private String dbpassword = "hzau123456";//issuccess�ж��Ƿ��ظ��û���
	public int  yonghuzhuce1(String yonghuming,String mima,String xingming,String shenfenzhenghao,String dianhua,int yonghuleixing){
		
		java.sql.Connection conn = null;
	    java.sql.Statement stmt = null;
	    int issuccess=2;
	        try{
	            // ע�� JDBC ����
	            Class.forName("com.mysql.jdbc.Driver");
	            // ������
	            System.out.println("�������ݿ�...");
	            conn = DriverManager.getConnection(connStr,dbusername,dbpassword);
	            stmt = conn.createStatement();
	            String sql;
                sql="SELECT �û��� FROM �û���¼��Ϣ��  WHERE �û���="+"\""+yonghuming+"\"";
                ResultSet rs2 = stmt.executeQuery(sql);
                if(rs2.next())
                {
                	issuccess=0;
                }
                else if(yonghuleixing==1)
	            {
                    sql = " INSERT INTO �û���¼��Ϣ�� VALUES ("+"\""+yonghuming+"\","+"\""+mima+"\","+"\""+shenfenzhenghao+"\")";
                    stmt.executeUpdate(sql);
	                sql = " INSERT INTO ������Ϣ�� VALUES ("+"\""+shenfenzhenghao+"\","+"\""+xingming+"\","+"\""+dianhua+"\")";
	                stmt.executeUpdate(sql);
                    issuccess=1;
                }
                else if(yonghuleixing==2)
                {
                    sql = "INSERT INTO �û���¼��Ϣ�� VALUES ("+"\""+yonghuming+"\","+"\""+mima+"\","+"\""+shenfenzhenghao+"\")";
                    stmt.executeUpdate(sql);
                    System.out.println(sql);
	                sql = "INSERT INTO �⻧��Ϣ�� VALUES ("+"\""+xingming+"\","+"\""+shenfenzhenghao+"\","+"\""+dianhua+"\")";
	                System.out.println(sql);
	                stmt.executeUpdate(sql);
                    issuccess=1;
                }
                else if(yonghuleixing==3)
                {
                	sql = "INSERT INTO �û���¼��Ϣ�� VALUES ("+"\""+yonghuming+"\","+"\""+mima+"\","+"\""+shenfenzhenghao+"\")";
                    stmt.executeUpdate(sql);
	                sql = "INSERT INTO �������˻���Ϣ�� VALUES ("+"\""+xingming+"\","+"\""+shenfenzhenghao+"\","+"\""+dianhua+"\")";
	                stmt.executeUpdate(sql);
                    issuccess=1;
                }
	        }catch(SQLException se){
	            // ���� JDBC ����
	            se.printStackTrace();
	        }catch(Exception e){
	            // ���� Class.forName ����
	            e.printStackTrace();
	        }
	        return issuccess;
	}
	
}