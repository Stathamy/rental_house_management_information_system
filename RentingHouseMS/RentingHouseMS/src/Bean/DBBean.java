package Bean;

import java.sql.*;

public class DBBean {
    private String driverStr = "com.mysql.jdbc.Driver";
    /*private String connStr = "jdbc:mysql://localhost:3306/testdb?useUnicode=true&characterEncoding=utf-8&useSSL=false";
    private String dbusername = "root";
    private String dbpassword = "12345678";*/
    private String connStr = "jdbc:mysql://119.29.8.35:3306/RentingHouseMSDB?useUnicode=true&characterEncoding=utf-8&useSSL=false";
    private String dbusername = "RentingHouseMSDB";
    private String dbpassword = "hzau123456";
    private Connection conn = null;
    private Statement stmt = null;

    public DBBean()
    {
        try
        {
            Class.forName(driverStr);
            conn = DriverManager.getConnection(connStr, dbusername, dbpassword);
            stmt = conn.createStatement();
        } 
        catch (Exception ex) {
        	ex.printStackTrace();
            System.out.println("数据连接失败！");
        } 
        
    }

    public int executeUpdate(String s) {
        int result = 0;
        System.out.println("--更新语句:"+s+"\n");
        try {
            result = stmt.executeUpdate(s);
        } catch (Exception ex) {
            System.out.println("执行更新错误！");
        }
        return result;
    }

    public ResultSet executeQuery(String s) throws SQLException {
        ResultSet rs = null;
        System.out.print("--查询语句:"+s+"\n");
        try {
        	//System.out.println(stmt);
            rs = stmt.executeQuery(s);
        } catch (Exception ex) {
        	ex.printStackTrace();
            System.out.println("执行查询错误！");
        }  
        return rs;
    }
    public void execQuery(String s){
        try {
            stmt.executeUpdate(s);
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            System.out.println("执行插入错误！");
        }
    }

    public void close() {
        try {
            stmt.close();
            conn.close();
        } catch (Exception e) {
        }
    }
    /*public static void main(String[] args){
    	DBBean aaaa = new DBBean();
    	String mima="123456"; 
    	String sql = "SELECT * FROM 用户登录信息表        where 用户名=\""+mima+"\"";
    	
		try {
			//System.out.println(aaaa.executeQuery(sql).getObject("密"));
			ResultSet rs=aaaa.executeQuery(sql);
			String name = "";
			while(rs.next()){//或者while(rs.next()) 
			   name = rs.getString("密码");
			   if(name == null){
			        name = "";
			   }
			   System.out.println(name);
			} 
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		}*/
}
