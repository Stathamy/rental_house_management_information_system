package Bean;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
public class  ShuiWuJiaoNaJiLuChaXun{
	private String connStr = "jdbc:mysql://119.29.8.35:3306/RentingHouseMSDB?useUnicode=true&characterEncoding=utf-8&useSSL=false";
    private String dbusername = "RentingHouseMSDB";
    private String dbpassword = "hzau123456";
    public ResultSet  ShuiWuJiaoNaJiLuChaXun1(String fangwubianhao){
	// * ��˰���а����ݱ�Ų�ѯ��Ϣ
	//String fangwubianhao Ϊ���ݱ����Ϣ
   	java.sql.Connection conn = null;
    java.sql.Statement stmt = null;
    ResultSet rs =null;
    try{
        // ע�� JDBC ����
        Class.forName("com.mysql.jdbc.Driver");
        // ������
        conn = DriverManager.getConnection(connStr,dbusername,dbpassword);
        stmt = conn.createStatement();
        String sql;
        sql = "SELECT ��˰����,����˰�� FROM ��˰��  WHERE ���ݱ��="+"\""+fangwubianhao+"\"";//From ��   ��˰����, 
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