package Bean;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
public class  weiguixinxichaxun{
 private String connStr = "jdbc:mysql://119.29.8.35:3306/RentingHouseMSDB?useUnicode=true&characterEncoding=utf-8&useSSL=false";
    private String dbusername = "RentingHouseMSDB";
    private String dbpassword = "hzau123456";


public ResultSet weiguixinxichaxun1(String fangzhushenfenzhenghao,String fangwubianhao,String zuhushenfenzhenghao,String hetongbianhao,String weiguileixing){

	   	String sqlf = "SELECT 房屋编号,租户身份证号,合同编号,违规类型,违规信息 FROM 违规信息表  WHERE ";
	   	boolean flag = false;
	   	java.sql.Connection conn = null;
	   	java.sql.Statement stmt = null;
	   	ResultSet rs =null;
	   	
	   	
	   	if(!fangzhushenfenzhenghao.equals("")){
	    	sqlf+=" 房主身份证号= '"+ fangzhushenfenzhenghao +"'";
	    	flag=true;
	    }
		if(!fangwubianhao.equals("")){
			if(flag) sqlf+=" AND ";
			sqlf+="房屋编号='"+fangwubianhao+"'";
			flag=true;
	    }
		if(!zuhushenfenzhenghao.equals("")){
			if(flag) sqlf+=" AND ";
	    	sqlf+="租户身份证号='"+zuhushenfenzhenghao+"'";
	    	flag=true;
	    }
		if(!hetongbianhao.equals("")){
			if(flag) sqlf+=" AND ";
	    	sqlf+="合同编号='"+hetongbianhao+"'";
	    	flag=true;
	    }
		if(!weiguileixing.equals("")){
			if(flag) sqlf+=" AND ";
	    	sqlf+="违规类型 ='"+weiguileixing+"'";
	    	flag=true;
	    }
		
	   	
	   	
	        try{
	            // 注册 JDBC 驱动
	            Class.forName("com.mysql.jdbc.Driver");
	            conn = DriverManager.getConnection(connStr,dbusername,dbpassword);
	            // 执行查询
	            System.out.println(" 实例化Statement对...");
	            stmt = conn.createStatement();
	            rs = stmt.executeQuery(sqlf);
	            System.out.println(sqlf);
	            System.out.println(rs);
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