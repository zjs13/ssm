<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'ok.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <body>
                   恭喜你注册成功！学生信息如下：<br/> 
                   姓名：${requestScope.student.stuName }<br/> 
                   年龄：${requestScope.student.stuAge }<br/>
                   出生日期：${requestScope.student.stuBith }<br/> 
                   照片：<a href="download.action?filename=${requestScope.student.stuPhoto }">
              <img src="photoes/${requestScope.student.stuPhoto }" width="300" height="300">
           </a>        
                   <br/> 
  </body>
</html>
