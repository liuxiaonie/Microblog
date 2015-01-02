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
	
	<!-- 左侧 -->
		<div class="left-nav">
			<a href="${pageContext.request.contextPath}"><span>首页</span></a>
			<a href=""><span>消息</span></a>
			<a><span>收藏</span></a>	
			<a><span>${sessionScope.User.uname}</span></a>			
		</div><!-- left-nav end -->
		
		<!-- 中间 微博发布区 -->
		<div class="content">
			<div class="wb-frame">
				<div class="title-area">
						<span class="wb-frame-promt">有什么新鲜事想告诉大家？</span>
				</div>
					<form action="/message.do" method="post">
					<input type="hidden" name="method" value="publish"/>
						<div class="wb-input">
						
							<textarea class="wb-input-frame" name="mcontent"></textarea><!-- 这里不能留空格 -->
						</div><!--wb-input end  -->
						<div class="fun-area">			
							<input type="submit" class="sub-btn btn" value="发布" />			
						</div>
					</form>
			</div><!-- wb-frame end -->  
			
			<!-- 中间 微博显示区 -->
		<c:forEach var="msg" items="${messageList}">
			<div class="wb-content radius">
				<div class="wb-content-head f">
					<a>
						<img alt="头像" src="/image/2.jpg" />
					</a>
				</div>
				<div class="wb-content-details f">
					<div class="nickname">
						<a href="javascript:void(0)">${msg.user.unickname}</a>
					</div>
					<div class="wb-text">
					     ${msg.mcontent }	
					</div> <!-- weibo content -->
					<div class="sub-time">
						<a class="atags" >
						<fmt:formatDate value="${msg.mtime}" pattern="yyyy年M月d日 HH:mm:ss"/>
						</a>
					</div>
				</div>
				<div class="clearfix"></div>
				<div class="wb-operator">
					<ul>
						<li class="f">
							<a>收藏</a>
						</li>
						<li  class="f">
							<a>转发</a>
						</li>
						<li  class="f">
							<a>评论</a>
						</li>
						<li  class="f" id="after">
							<a><i class="icon-conmmend">&#xf087;</i></a>
						</li>
					</ul>
					<div class="clearfix"></div>
				</div>
			</div>
			</c:forEach> 
			<!-- wb-content end-->
			
			<!-- <div class="wb-content radius">
				<div class="wb-content-head f">
					<a>
						<img alt="头像" src="/image/2.jpg" />
					</a>
				</div>
				<div class="wb-content-details f">
					<div class="nickname">
						<a href="javascript:void(0)">小P要努力睡觉</a>
					</div>
					<div class="wb-text">今天你吃了么？,我爱吃饭，爱手机号大家圣诞节圣诞回家睡觉的还是介绍的就是的很多很多很多很多很多很多话</div> weibo content
					<div class="sub-time">
						<a class="atags">7分钟前</a>
					</div>
				</div>
				<div class="clearfix"></div>
				<div class="wb-operator">
					<ul>
						<li class="f">
							<a>收藏</a>
						</li>
						<li  class="f">
							<a>转发</a>
						</li>
						<li  class="f">
							<a>评论</a>
						</li>
						<li  class="f" id="after">
							<a>赞</a>
						</li>
					</ul>
					<div class="clearfix"></div>
				</div>
			</div>wb-content end
			 -->
			
		</div><!-- content end --> 
		
		<!-- 右侧 -->
		<div class="right-nav">
			<div class="userinfo radius">
				<div class="headbox">
					<a>
						<img alt="头像"  class="head-ico" src="/image/3.jpg"/>
					</a>
				</div><!-- 头像 -->
				<div class="user-wrap">
					<div class="namebox atags">
						${sessionScope.User.uname}
					</div>
					<div class="user-atten">
						<ul class="user-atten-ul">
							<li class="user-atten-li f">
								<a href="/friend.do?method=attention" class="atags">
									<strong>111</strong>
									<span>关注</span>
								</a>
							</li>
							<li class="user-atten-li f">
								<a  href="/friend.do?method=fans" class="atags">
									<strong>151</strong>
									<span>粉丝</span>
								</a>
							</li>
							<li class="user-atten-li f" id="after">
								<a class="atags">
									<strong>1112</strong>
									<span>微博</span>
								</a>
							</li>
						</ul>
						<div class="clearfix"></div>
					</div> <!-- user-atten end -->
				</div><!-- ser-wrap end -->
			</div><!-- userinfo end -->
			<div class="hot-topic radius">
				<div class="hot-topic-title atags">
					热门话题
				</div>
				<div class="hot-topic-content">
					<ul>
						<li><p><a class="atags">#寿光食品厂大火#</a><span class="hot-topic-num">222万</span></p></li>
						<li><p><a class="atags">#弃北大读技校#</a><span class="hot-topic-num">222万</span></p></li>
						<li><p><a class="atags">#周杰伦公开恋情#</a><span class="hot-topic-num">222万</span></p></li>
						<li><p><a class="atags">#沪港通#</a><span class="hot-topic-num">222万</span></p></li>
						<li><p><a class="atags">#蔡依林遇上杨幂#</a><span class="hot-topic-num">222万</span></p></li>
						<li><p><a class="atags">#百元哥被打了#</a><span class="hot-topic-num">222万</span></p></li>
						<li><p><a class="atags">#TVB金牌绿叶#</a><span class="hot-topic-num">222万</span></p></li>
						<li><p><a class="atags">#皮肤长指甲#</a><span class="hot-topic-num">222万</span></p></li>
					</ul>
				</div>
				<a class="hot-topic-foot atags">
					查看更多
				</a>
			</div>
		</div><!-- right-nav end -->
		<div class="clearfix"></div>
	</div><!-- main end -->
	
	<script type="text/javascript" src="js/globle.js"></script>
</body>
</html>