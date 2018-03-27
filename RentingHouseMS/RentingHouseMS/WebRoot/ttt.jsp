<%@ page language="java" import="java.util.*" import="java.sql.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE html>
<html>
<head>
	<style type="text/css">
	html{    
    width: 100%;    
    height: 100%;    
    overflow: hidden;    
    font-style: sans-serif;    
}    
body{   
    background-color:#b0c4de; 
    width: 100%;    
    height: 100%;    
    font-family: 'Open Sans',sans-serif;    
    margin: 0;    
      
}    
	</style>
    <meta charset="utf-8">
    <title>ECharts</title>
    <!-- 引入 echarts.js -->
    <script src="echarts.simple.min.js"></script>
</head>
<body>
<center>
	<h1>价格分布图</h1>
	<%! int i=0,j=0,k=0,l=0; %>
    <!-- 为ECharts准备一个具备大小（宽高）的Dom -->
    <div id="main" style="width: 600px;height:400px;"></div>
    <script type="text/javascript">
    <jsp:useBean id="db" class="Bean.tongjizujin" scope="page" />
	<jsp:useBean id="db1" class="Bean.tongjizujin1" scope="page" />
	<jsp:useBean id="db2" class="Bean.tongjizujin2" scope="page" />
	<jsp:useBean id="db3" class="Bean.tongjizujin3" scope="page" />
<%
    ResultSet rs1=db1.tongjizujin21();
    ResultSet rs=db.tongjizujin11();
    ResultSet rs2=db2.tongjizujin31();
    ResultSet rs3=db3.tongjizujin41();
    rs.last(); 
	i = rs.getRow(); 
	rs1.last(); 
	j = rs1.getRow(); 
	rs2.last(); 
	k = rs2.getRow(); 
	rs3.last(); 
	l = rs3.getRow(); 
 %>
        // 基于准备好的dom，初始化echarts实例
        var myChart = echarts.init(document.getElementById('main'));

        // 指定图表的配置项和数据
        var option = {
    	backgroundColor: '#2c343c',

    	title: {
        text: 'Customized Pie',
        left: 'center',
        top: 20,
        textStyle: {
            color: '#ccc'
        }
    },

    tooltip : {
        trigger: 'item',
        formatter: "{a} <br/>{b} : {c} ({d}%)"
    },

    visualMap: {
        show: false,
        min: 80,
        max: 600,
        inRange: {
            colorLightness: [0, 1]
        }
    },
    series : [
        {
            name:'访问来源',
            type:'pie',
            radius : '55%',
            center: ['50%', '50%'],
            data:[
                {value:<%=i%>, name:'0-499'},
                {value:<%=j%>, name:'500-999'},
                {value:<%=k%>, name:'1000-1499'},
                {value:<%=l%>, name:'1500-1999'},
            ].sort(function (a, b) { return a.value - b.value; }),
            roseType: 'radius',
            label: {
                normal: {
                    textStyle: {
                        color: 'rgba(255, 255, 255, 0.3)'
                    }
                }
            },
            labelLine: {
                normal: {
                    lineStyle: {
                        color: 'rgba(255, 255, 255, 0.3)'
                    },
                    smooth: 0.2,
                    length: 10,
                    length2: 20
                }
            },
            itemStyle: {
                normal: {
                    color: '#c23531',
                    shadowBlur: 200,
                    shadowColor: 'rgba(0, 0, 0, 0.5)'
                }
            },

            animationType: 'scale',
            animationEasing: 'elasticOut',
            animationDelay: function (idx) {
                return Math.random() * 200;
            }
        }
    ]
};
        // 使用刚指定的配置项和数据显示图表
        myChart.setOption(option);
    </script>
</center>
</body>
</html>