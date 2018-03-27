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
		  * 该函数用于查询HeTong表的信息
		  * String name1为所查的数据具体内容，如：身份证具体号码，合同编号信息
		  * int i为所查内容编号，如:1代表    房主身份证号, 2代表    租户身份证号,  3代表   合同编号  , 4代表     房屋编号
		  */
		java.sql.Connection conn = null;
		    java.sql.Statement stmt = null;
		    ResultSet rs=null;
		    boolean flag=false;
		    String sqlf;
			sqlf= "SELECT 房主身份证号, 租户身份证号,  合同编号  ,  房屋编号   FROM 合同表  WHERE ";
	            //name1为String类型需要加入双引号再用SQL查询 
			if(!fangzhushenfenzhenghao.equals("")){
		    	sqlf+=" 合同表.`房主身份证号`= '"+ fangzhushenfenzhenghao +"'";
		    	flag=true;
		    }
			if(!zuhushenfenzhenghao.equals("")){
				if(flag) sqlf+=" AND ";
		    	sqlf+=" 合同表.`租户身份证号`= '"+ zuhushenfenzhenghao +"'";
		    	flag=true;
		    }
			if(!hetongbianhao.equals("")){
				if(flag) sqlf+=" AND ";
		    	sqlf+=" 合同表.`合同编号`= '"+ hetongbianhao +"'";
		    	flag=true;
		    }
			
			if(!fangwubianhao.equals("")){
				if(flag) sqlf+=" AND ";
		    	sqlf+=" 合同表.`房屋编号`= '"+ fangwubianhao +"'";
		    	flag=true;
		    }
			
	           
	            
	            
	            try{
	        		// 注册 JDBC 驱动
	        		Class.forName("com.mysql.jdbc.Driver");
	        		// 打开链接
	        		System.out.println("HeTongXinXiChaXun查询...");
	        		conn = DriverManager.getConnection(connStr,dbusername,dbpassword);
	        		System.out.println(" 合同信息查询");
	        		stmt = conn.createStatement();
	        		rs = stmt.executeQuery(sqlf);
	        		
	        	    }catch(SQLException se){
	        	       // 处理 JDBC 错误
	        	       se.printStackTrace();
	        	    }catch(Exception e){
	        	       // 处理 Class.forName 错误
	        	       e.printStackTrace();
	            	}
	        	return rs;
	        }  
	        /*    ResultSet rs = stmt.executeQuery(sql);
	        
	            // 展开结果集数据库
	            while(rs.next()){
	                // 通过字段检索
	            	String fangzhushenfenzhenghao  = rs.getString("房主身份证号");
	                 String zuhushenfenzhenghao  = rs.getString("租户身份证号");
	                 String hetongbiaohao = rs.getString("合同编号");
	                 String fangwubianhao= rs.getString("房屋编号");
	                
	    
	                // 输出数据
	                 System.out.print("房主身份证号: " + fangzhushenfenzhenghao);
	                 System.out.print(", 租户身份证号: " + zuhushenfenzhenghao);
	                 System.out.print(", 合同编号: " + hetongbiaohao);
	                 System.out.print(", 房屋编号: " + fangwubianhao);
	                 System.out.print("\n");
	            }
	            // 完成后关闭
	            rs.close();
	            stmt.close();
	            conn.close();*/
	}
	
	

