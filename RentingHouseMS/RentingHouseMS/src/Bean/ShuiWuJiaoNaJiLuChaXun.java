package Bean;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
public class  ShuiWuJiaoNaJiLuChaXun{
	private String connStr = "jdbc:mysql://119.29.8.35:3306/RentingHouseMSDB?useUnicode=true&characterEncoding=utf-8&useSSL=false";
    private String dbusername = "RentingHouseMSDB";
    private String dbpassword = "hzau123456";
    public ResultSet  ShuiWuJiaoNaJiLuChaXun1(String fangwubianhao){
	// * 缴税表中按房屋编号查询信息
	//String fangwubianhao 为房屋编号信息
   	java.sql.Connection conn = null;
    java.sql.Statement stmt = null;
    ResultSet rs =null;
    try{
        // 注册 JDBC 驱动
        Class.forName("com.mysql.jdbc.Driver");
        // 打开链接
        conn = DriverManager.getConnection(connStr,dbusername,dbpassword);
        stmt = conn.createStatement();
        String sql;
        sql = "SELECT 缴税日期,所缴税务 FROM 缴税表  WHERE 房屋编号="+"\""+fangwubianhao+"\"";//From 表   缴税日期, 
       rs = stmt.executeQuery(sql);
        }catch(SQLException se){
            // 处理 JDBC 错误
            se.printStackTrace();
        }catch(Exception e){
            // 处理 Class.forName 错误
            e.printStackTrace();
        }
    return rs;
   }
}