<%@ page language="java" contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/webpage/common/taglib.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
	<title>我的首页</title>
	<!-- <meta charset="UTF-8"> -->
	<link rel="shortcut icon" href="/image/shortcut.png" />
	<link rel="stylesheet" type="text/css" href="/css/font-icon.css" />
	<link rel="stylesheet" type="text/css" href="/css/globle.css" />
	<script type="text/javascript" src="/js/jquery-1.8.0.js"></script>
</head>
<body>
    <!-- 上侧导航 -->
	<%@ include file="/WEB-INF/webpage/common/head.jsp" %>
	
	<!-- 主页面 -->
	<div class="main">
		<%@ include file="/WEB-INF/webpage/common/leftnav.jsp" %>
			<div class="content">
				<div class="wb-content radius">
					<div class="wb-content-head f">
						<a>
							<img alt="头像" src="/image/2.jpg" />
						</a>
					</div>
					<div class="wb-content-details f">
						<div class="nickname">
							<a href="javascript:void(0)">小P要努力睡觉</a>
						</div>
						<div class="wb-text">
						今天你吃了么？,我爱吃饭，爱手机号大家圣诞节圣诞回家睡觉的还是介绍的就是的很多很多很多很多很多很多话</div> <!-- weibo content -->
						<div class="sub-time">
							<a class="atags">7分钟前</a>
						</div>
					</div>
					<div class="clearfix"></div>
					<div class="wb-operator">
								<a>回复</a>				
					</div>
				</div><!-- wb-content end-->
			</div>
	</div>
	<script type="text/javascript" src="js/globle.js"></script>
  </body>
</html>
