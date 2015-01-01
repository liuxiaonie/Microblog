<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE HTML>
<html lang="zh">
  <head> 
    <title>用户登陆</title>
	<meta charset="UTF-8">
	<link rel="shortcut icon" href="/image/shortcut.png">
	<link rel="stylesheet" type="text/css" href="css/common.css">	
  </head>
  
  <body>	
  	<div class="page">
	  	<div class="banner">
	  	</div>
	  	<div class="middle">
	  		<div class="left">
	  			<div class="go-regist">
	  				还没有微博账号？现在加入
	  				<a class="go-regist-bt">
	  					
	  				</a>
	  			</div>
	  			<div class="left-logo">
	  				
	  			</div>
	  		</div>
	  		<div class="right">
	  			<form action="/login.do" method="post">
	  			<input type="hidden" name="method" value="login">
	  				<table class="tb-login">
	  					<thead>
	  						<tr>
	  							<td>登陆</td>
	  						</tr>
	  					</thead>
	  					<tbody>
	  						<tr>
	  							<td  class="loginError" colspan="2">${loginError}</td>  							
	  						</tr>
	  						<tr>
	  							<td class="title-login">用户名：</td>
	  							<td><input type="text" name="username" class="frame-login"/></td>
	  						</tr>
	  						<tr>
	  							<td class="title-login">密码：</td>
	  							<td><input type="password" name="password" class="frame-login"/></td>
	  						</tr>
	  							<tr>
	  							<td class="islogin" colspan="2"><input type="checkbox" name="isAutoLogin" checked="checked"/>下次自动登陆</td>
	  							
	  						</tr>
	  					</tbody>
	  					<tfoot>
	  						<tr>
	  							<td><span class="bt-wrap"><input type="submit" value="登 陆" id="btlogin"/> </span> </td>
	  						</tr>
	  					</tfoot>
	  				</table>
	  			</form>
	  		</div>
	  	</div>
	  	<div class="clearfix"></div>
	  	<div class="footer">
	  	</div>
  	</div>
  </body>
</html>
