<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/webpage/common/taglib.jsp" %>
<!DOCTYPE HTML>
<html>
  <head lang="zh">
    <title>用户注册</title>
	<meta charset="UTF-8">
	<link rel="shortcut icon" href="/image/shortcut.png">
	<link rel="stylesheet" type="text/css" href="/css/common.css">
	<script type="text/javascript" src="/js/jquery-1.8.0.js"></script>

  </head>
  
  <body>
  	<div class="page">
  		<div class="banner">
		</div>
		<div class="middle">
			<div class="form-reg">
			  <div class="title">用户注册</div>
			  <form action="/register.do" method="post">
			  <input type="hidden" name="method" value="reg">
			 	 <table class="table-reg">
			 	 	<tbody>
				 	 	<tr>
				 	 		<td class="lb-reg">用户名：</td>
				 	 		<td> <input type="text" class="frame-reg" name="username" id="username"></td>
				 	 		<td><span id="namemsg" class="msg"></span> </td>
				 	 	</tr>
				 	 	<tr>
				 	 		<td class="lb-reg">密码：</td>
				 	 		<td><input type="password" class="frame-reg"  name="password" id="password"></td>
				 	 		<td><span id="pwdmsg" class="msg"></span></td>
				 	 	</tr>
				 	 	<tr>
				 	 		<td class="lb-reg">确认密码：</td>
				 	 		<td><input type="password" class="frame-reg"  name="conpassword" id="conpassword"></td>
				 	 		<td><span id="conpwdmsg" class="msg"></span></td>
				 	 	</tr>
				 	 	<tr>
				 	 		<td class="lb-reg">昵称：</td>
				 	 		<td> 
				 	 		  <input type="text" class="frame-reg"  name="nickname" id="nickname"></td>
				 	 		<td><span id="nickmsg" class="msg"></span></td>
				 	 	</tr>
				 	 	<tr>
				 	 		<td class="lb-reg">性别：</td>
				 	 		<td> 
				 	 		  <input type="radio" name="sex" value="男" checked="checked">男
						   	  <input type="radio" name="sex" value="女" >女</td>
				 	 		<td></td>
				 	 	</tr>
				 	 	
				 	 	<tr>
				 	 		<td class="lb-reg">个人介绍</td>
				 	 		<td> <textarea name="intro" class="ta-reg" id="intro"></textarea></td>
				 	 		<td></td>
				 	 	</tr>
				 	 	<tr>
				 	 		<td></td>
				 	 		<td>  <input type="submit" class="sb-reg" /></td>
				 	 		<td></td>
				 	 	</tr>			   	
			   		  </tbody>
			   	  </table>
			  </form>
		   </div>
		   <div class="right-reg">
		   
		   </div>
		   <div class="clearfix"></div>
	   </div>
	   <div class="footer"></div>
   	</div>
   	<script type="text/javascript" src="/js/register.js">
   	</script>
  </body>
</html>
