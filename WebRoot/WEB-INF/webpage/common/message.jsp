<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/webpage/common/taglib.jsp" %>

<!DOCTYPE HTML>
<html>
  <head>
    <title>跳转中，请稍候....</title>
	<meta charset="UTF-8">
	<link rel="shortcut icon" href="/image/shortcut.png">
	<meta http-equiv="refresh" content="2;url=${jumpurl}"> 
  </head>
  
  <body>
  ${message}
  
  <%-- ${sessionScope.User.uname}  --%>
    
  </body>
</html>
