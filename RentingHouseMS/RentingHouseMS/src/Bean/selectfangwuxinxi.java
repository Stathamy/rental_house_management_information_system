package Bean;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class selectfangwuxinxi {
    /*private String connStr = "jdbc:mysql://localhost:3306/testdb?useUnicode=true&characterEncoding=utf-8&useSSL=false";
    private String dbusername = "root";
    private String dbpassword = "12345678";*/
    private String connStr = "jdbc:mysql://119.29.8.35:3306/RentingHouseMSDB?useUnicode=true&characterEncoding=utf-8&useSSL=false";
    private String dbusername = "RentingHouseMSDB";
    private String dbpassword = "hzau123456";

public ResultSet FangWuXinXiChaXun(String fangzhubianhao,String fangwubianhao,String sheng,String shi,String xiaoqu,boolean chuzuqingkuang)
{
	java.sql.Connection conn = null;
    java.sql.Statement stmt = null;
    ResultSet rs=null;
    boolean flag=false;
    String sqlf;
	sqlf="SELECT 房屋信息表.房屋编号,租金, 房屋出租情况 ,国家,省, 市,县 , 乡, 村, 街道 , 小区  , 门牌号, 街道号,房屋出租情况     FROM 房屋信息表      WHERE ";  
    if(!fangzhubianhao.equals("")){
    	sqlf+=" 房屋信息表.`房主身份证号`= '"+ fangzhubianhao +"'";
    	flag=true;
    }
	if(!fangwubianhao.equals("")){
		if(flag) sqlf+=" AND ";
		sqlf+="房屋信息表.`房屋编号`='"+fangwubianhao+"'";
		flag=true;
    }
	if(!sheng.equals("")){
		if(flag) sqlf+=" AND ";
    	sqlf+="房屋信息表.`省`='"+sheng+"'";
    	flag=true;
    }
	if(!shi.equals("")){
		if(flag) sqlf+=" AND ";
    	sqlf+="房屋信息表.`市`='"+shi+"'";
    	flag=true;
    }
	if(!xiaoqu.equals("")){
		if(flag) sqlf+=" AND ";
    	sqlf+="房屋信息表.`小区`='"+xiaoqu+"'";
    	flag=true;
    }
	if(chuzuqingkuang){
		if(flag) sqlf+=" AND ";
    	sqlf+="房屋信息表.`房屋出租情况`='1'";
    	System.out.println(sqlf);
    }
	else{
		if(flag) sqlf+=" AND ";
		sqlf+="房屋信息表.`房屋出租情况`='0'";
	}
	
    try{
		// 注册 JDBC 驱动
		Class.forName("com.mysql.jdbc.Driver");
		// 打开链接
		System.out.println("FangWuXinXiChaXun查询...");
		conn = DriverManager.getConnection(connStr,dbusername,dbpassword);
		System.out.println(" 房主身份证查询");
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
	/*public static void main(String[] args){
		selectfangwuxinxi ssss = new selectfangwuxinxi();
		ResultSet rs;
		rs = ssss.FangWuXinXiChaXun(null,"333",null,null,null,true);//"410702199606022514"
		try {
		while(rs.next()){
            // 通过字段检索
        	String fangwubianhao= rs.getString("房屋编号");
        	String zujin  = rs.getString("租金");
        	String fangwuchuzuqingk  = rs.getString("房屋出租情况");
        	String guojia  = rs.getString("国家");
        	String sheng  = rs.getString("省");
        	String shi = rs.getString("市");
        	String xian  = rs.getString("县");
        	String xiang = rs.getString("乡");
            String cun =rs.getString("村");
            String jiedao =rs.getString("街道");
            String xiaoqu =rs.getString("小区");
            String  menpaihao =rs.getString("门牌号");
            String jiedaohao =rs.getString("街道号");
            String fangwuchuzuqingkuang =rs.getString("房屋出租情况");

            // 输出数据
             System.out.print(" 房屋编号: " + fangwubianhao);
             System.out.print(", 租金: " + zujin);
             System.out.print(", 房屋出租情况: " + fangwuchuzuqingk);
             System.out.print(", 国家: " + guojia);
             System.out.print(", 省: " + sheng);
             System.out.print(", 市: " + shi);
             System.out.print(", 县: " + xian);
             System.out.print(", 乡: " + xiang);
             System.out.print(", 村: " + cun);
             System.out.print(", 街道: " + jiedao);
             System.out.print(", 小区: " + xiaoqu);
             System.out.print(", 门牌号: " + menpaihao);
             System.out.print(", 街道号: " + jiedaohao);
             System.out.print(", 房屋出租情况: " + fangwuchuzuqingkuang);
             System.out.print("\n");
        }
    	rs.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}*/
}

