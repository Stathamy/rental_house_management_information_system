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
	sqlf="SELECT ������Ϣ��.���ݱ��,���, ���ݳ������ ,����,ʡ, ��,�� , ��, ��, �ֵ� , С��  , ���ƺ�, �ֵ���,���ݳ������     FROM ������Ϣ��      WHERE ";  
    if(!fangzhubianhao.equals("")){
    	sqlf+=" ������Ϣ��.`�������֤��`= '"+ fangzhubianhao +"'";
    	flag=true;
    }
	if(!fangwubianhao.equals("")){
		if(flag) sqlf+=" AND ";
		sqlf+="������Ϣ��.`���ݱ��`='"+fangwubianhao+"'";
		flag=true;
    }
	if(!sheng.equals("")){
		if(flag) sqlf+=" AND ";
    	sqlf+="������Ϣ��.`ʡ`='"+sheng+"'";
    	flag=true;
    }
	if(!shi.equals("")){
		if(flag) sqlf+=" AND ";
    	sqlf+="������Ϣ��.`��`='"+shi+"'";
    	flag=true;
    }
	if(!xiaoqu.equals("")){
		if(flag) sqlf+=" AND ";
    	sqlf+="������Ϣ��.`С��`='"+xiaoqu+"'";
    	flag=true;
    }
	if(chuzuqingkuang){
		if(flag) sqlf+=" AND ";
    	sqlf+="������Ϣ��.`���ݳ������`='1'";
    	System.out.println(sqlf);
    }
	else{
		if(flag) sqlf+=" AND ";
		sqlf+="������Ϣ��.`���ݳ������`='0'";
	}
	
    try{
		// ע�� JDBC ����
		Class.forName("com.mysql.jdbc.Driver");
		// ������
		System.out.println("FangWuXinXiChaXun��ѯ...");
		conn = DriverManager.getConnection(connStr,dbusername,dbpassword);
		System.out.println(" �������֤��ѯ");
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
	/*public static void main(String[] args){
		selectfangwuxinxi ssss = new selectfangwuxinxi();
		ResultSet rs;
		rs = ssss.FangWuXinXiChaXun(null,"333",null,null,null,true);//"410702199606022514"
		try {
		while(rs.next()){
            // ͨ���ֶμ���
        	String fangwubianhao= rs.getString("���ݱ��");
        	String zujin  = rs.getString("���");
        	String fangwuchuzuqingk  = rs.getString("���ݳ������");
        	String guojia  = rs.getString("����");
        	String sheng  = rs.getString("ʡ");
        	String shi = rs.getString("��");
        	String xian  = rs.getString("��");
        	String xiang = rs.getString("��");
            String cun =rs.getString("��");
            String jiedao =rs.getString("�ֵ�");
            String xiaoqu =rs.getString("С��");
            String  menpaihao =rs.getString("���ƺ�");
            String jiedaohao =rs.getString("�ֵ���");
            String fangwuchuzuqingkuang =rs.getString("���ݳ������");

            // �������
             System.out.print(" ���ݱ��: " + fangwubianhao);
             System.out.print(", ���: " + zujin);
             System.out.print(", ���ݳ������: " + fangwuchuzuqingk);
             System.out.print(", ����: " + guojia);
             System.out.print(", ʡ: " + sheng);
             System.out.print(", ��: " + shi);
             System.out.print(", ��: " + xian);
             System.out.print(", ��: " + xiang);
             System.out.print(", ��: " + cun);
             System.out.print(", �ֵ�: " + jiedao);
             System.out.print(", С��: " + xiaoqu);
             System.out.print(", ���ƺ�: " + menpaihao);
             System.out.print(", �ֵ���: " + jiedaohao);
             System.out.print(", ���ݳ������: " + fangwuchuzuqingkuang);
             System.out.print("\n");
        }
    	rs.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}*/
}

