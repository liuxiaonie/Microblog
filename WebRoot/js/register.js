$(document).ready(
	function() {
		//获取页面元素
		$username = $("#username");
		$password = $("#password");
		$conpwd = $("#conpassword");
		$nickname = $("#nickname");
		$intro = $("#intro");
		$sub = $(".sb-reg");
		$frame = $(".frame-reg");
		$msg = $(".msg");
		//获取输出元素
		$namemsg = $("#namemsg");	
		$pwdmsg = $("#pwdmsg");	
		$conpwdmsg = $("#conpwdmsg");	
		$nickmsg = $("#nickmsg");
		
		nameError = false;
		
		//用户名校验
		$username.blur(
			function(){	
				username = $username.val();
				reg = /^[a-zA-Z][a-zA-Z0-9_]{4,15}$/;
				$namemsg.text("检测中...");
				
				validataUname();
			}	
		);
		
		//密码校验
		$password.blur(				
			function(){						
				reg = /^[a-zA-Z][a-zA-Z0-9_]{7,19}$/;
				pwd = $password.val();
				isTrue(validataPassword(pwd, reg),$pwdmsg);
			}	
		);	
		
		//确认密码校验
		$conpwd.blur(				
				function(){										
					pwd = $password.val();
					conpwd = $conpwd.val();
				
					isTrue(validataConPwd(pwd,conpwd),$conpwdmsg);		
				}	
		);
		
		$nickname.blur(
			function () {
				
				nickname = $nickname.val();
				reg = /^[\S]{1,10}$/;
				$nickmsg.text("检测中...");
				
				isTrue(validataNickname(nickname,reg),$nickmsg);
			}
		);
	/*	//校验表单元素是否有空值
		$sub.click(
				function() {
					checkBlank($frame);
				}	
		);*/
		$sub.click(
			function() {
				//alert(validataConPwd(pwd,conpwd)+" "+validataPassword(pwd, reg)+" "+validataUname());
				if(validataConPwd(pwd,conpwd)&&validataPassword(pwd, reg)&&validataUname()&&validataNickname(nickname,reg)){
					
					$sub.attr("disabled",false);
				}
				else {
					$sub.attr("disabled",true);
					alert("请完善注册信息");
									
				}
		});
	}
	
);

function validataNickname(nickname,reg){
	var nickError = false;
	if(nickname == ""){
		$nickmsg.text("请输入昵称");
		
	}else{
		if(!nickname.match(reg)){ 
			$nickmsg.text("昵称不能大于10个汉字");		
		}
		else{
			$nickmsg.text("可以使用");
			nickError = true;
		}
	}
	return nickError;
}
function validataConPwd(pwd,conpwd) {
	conpwdError = false;
	if(pwd == ""){
		$pwdmsg.text("请先输入密码");
	}
	else{
		if(conpwd == ""){
			$conpwdmsg.text("确认密码不能为空");
		}
		else {
			if(pwd != conpwd){
				$conpwdmsg.text("两次输入密码不一致，请重新输入");
			}
			else {
				$conpwdmsg.text("可以使用");
				conpwdError = true;
			}
		}
	}
	return conpwdError;
}
function validataPassword(pwd,reg){
	var pwdError = false;
	if(pwd==""){
		$pwdmsg.text("请输入密码");
		
	}else{
		if(!pwd.match(reg)){ 
			$pwdmsg.text("密码必须为8-20位，且首位必须为字母");		
		}
		else{
			$pwdmsg.text("可以使用");
			pwdError = true;
		}
	}
	return pwdError;
}
function validataUname() {
	
	if(username==""){
		$namemsg.text("请输入用户名");
		nameError = false;
		$sub.attr("disabled",true);
		$namemsg.css("color","#E64141");
	}
	else{
		if(!username.match(reg)){ 
			$namemsg.text("用户名为5-16位，且首位必须为字母");
			nameError = false;
			$sub.attr("disabled",true);
			$namemsg.css("color","#E64141");
		}
		else {
			//用户存在验证
			$.ajax({
				type:"post",
				url:"/register.do?method=uesrIsExsit",
				dataType:"text",
				data:"username="+username,
				success:function(data){
					
					//alert(data.trim());
					if(data == "true"){
						$namemsg.text("该用户已经存在");
						nameError = false;
						$sub.attr("disabled",true);
						$namemsg.css("color","#E64141");
					}
					else {		
						$namemsg.text("可以使用");
						nameError = true;
						$sub.attr("disabled",false);	
						$namemsg.css("color","green");
					}
				}					
			});
			
		}	
	}
	return nameError;
}

function checkBlank(frame){
	   $sub.attr("disabled","false");	
	   frame.each(
			function(i){
				//alert($(this).val()=="");
				if($(this).val()==""){
					alert("请填写完注册信息");
					$sub.attr("disabled","true");
					return false;
					
				}
			}
		);
}

function isExsit(uname) {
	//var isExsit = false;
	//alert(uname);
	
	return $nameIsExsit;
}

function isTrue(istrue,el) {
	
	if(istrue){
		$sub.attr("disabled",false);	
		el.css("color","green");
	}
	else{
		$sub.attr("disabled",true);
		el.css("color","#E64141");
	}	
}