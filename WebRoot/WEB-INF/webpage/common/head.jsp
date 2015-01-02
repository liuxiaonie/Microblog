<%@ page language="java" contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<div class="top-nav">

	<div class="logo"><img src="/image/logo.png" id="toplogo"></div>
	<div class="search">
	
		<input type="text" id="search-input"/>	
		<a href="javascript:void(0);"id="search-submit" class="icon-search">&#xe66d;</a>
	</div>
	<div class="function">
		<div class="top-navi">
			<ul>
				<li>
					<a class="top-atags" href="/login.do?method=home">
						<i class="icon-home">&#xe620;<span class="t-text1 s-text">首页</span></i>

					</a>
				</li>
				<li>
					<a class="top-atags" href="/title.do?method=title">
						<i class="icon-hot">&#xe663;<span class="s-text">发现</span></i>						
					</a>
				</li>
				<li>
					<a class="top-atags">
						<i class="icon-game">&#xe676;<span class="s-text">游戏</span></i>
						
					</a>
				</li>
				<li>
					<a class="top-atags">
						<i class="icon-user">&#xe604;<span class="s-text">${sessionScope.User.unickname}</span></i>
						
					</a>
				</li>
			</ul>
			
			<div class="clearfix"></div>
		</div>
		
		<div class="top-set">
		<!-- 	<form action="/logout.do" method="post">
				<input type="hidden" name="method" value="logout">
				<input type="submit" value="退出" />
			</form> -->
			<div class="top-set-list"><a class="set-list" ><i class="icon-message">&#xf003;</i></a>
				<div class="top-menulist-wrap">
					<div class="top-triangle"></div>
					<div class="bottom-triangle"></div>
					<div class="top-menulist ">	
								
						<ul>
							<li><a href="${pageContext.request.contextPath}/opr.do?method=at">@我的</a></li>
							<li><a href="${pageContext.request.contextPath}/opr.do?method=comment">评论</a></li>
							<li><a href="${pageContext.request.contextPath}/opr.do?method=like">赞</a></li>
							<li><a class="message">私信</a></li>
						</ul>
						<div class="clearfix"></div>
					</div> 
				</div>
			</div>
			<div class="top-set-list"><a class="set-list" ><i class="icon-set">&#xe624;</i></a>
				<div class="top-menulist-wrap">
						<div class="top-triangle"></div>
						<div class="bottom-triangle"></div>
						<div class="top-menulist ">	
									
							<ul>
								<li><a>账号设置</a></li>
								<li><a href="/logout.do?method=logout">退出</a></li>
							</ul>
						</div> 
				</div>
			</div>
			<div class="top-set-list"><a class="set" id="sub-mb"><i class="icon-sub sub-mb">&#xe673;</i></a></div>
			<div class="clearfix"></div>		
		</div>
		<div class="clearfix"></div>
	</div>
	<div class="clearfix"></div>
</div>  
<div id="filter"></div>
	<div id="dialog-box" class="radius">  <!-- 弹出框 -->
		<div id="dialog-box-titile">
			有什么新鲜事想告诉大家？<span id="cancel"><i class="icon-cancel">&#xe62c;</i></span>
			<div class="clearfix"></div>
		</div>
		
		<div class="dialog-box-input">
			<div id="wb-num-wrap">
				<div id="wb-num">
					还可以输入<span id="input-num">140</span>字
				</div>
			</div>
			<div class="clearfix"></div>
			<div class="dialog-input">
				<textarea id="dialog-input"></textarea>	
			</div>
		</div>
		<div class="dialog-box-fun">			
			<a href="javascript:void(0);"  class="sub-btn btn">发布</a>			
		</div>
	</div>
