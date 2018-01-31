<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'addDept.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<script type="text/javascript" src="js/jquery.min.js"></script>
	<script type="text/javascript">
	     function validate(){
	    	 $("#msg").html("");
	    	 var stuName = $("#stuName").val().trim();
	    	 if(stuName != null && stuName != ''){
	    		 $.ajax({type:"post",
	    		     url:"searchStudent3.action",
	    		     data:"{\"stuName\":\""+stuName+"\"}",
	    		     contentType:"application/json",
	    		     dataType:"json",
	    		     cache:false,
	    		     success:function(data){
	    		    	 if(data.stuId != null){
	    		    		 $("#msg").html("该学生已存在");
	    		    	 }else{
	    		    		 $("#msg").html("该学生不存在");
	    		    	 }
	    		     },
	    		     error:function(){
	    		    	 alert("程序发生异常!");
	    		     }
	    	       });
	    	 }	    	 
	     }
	</script>
  </head>
    
  <body>
       <center>
           	请输入学生信息：<br/>
           <form action="register.action" method="post" enctype="multipart/form-data">
		                学生名称：<input type="text" id="stuName" name="stuName" onblur="validate()">
		             <span id="msg" class="color:red;"></span>   
		             <br/>
		                年龄：<input type="text" name="stuAge"><br/>
		                出生日期：<input type="text" name="stuBith"><br/>
		                照片：<input type="file" name="photo"><br/>
		             <input type="submit" value="保存">   
           </form>
       </center>
  </body>
</html>
