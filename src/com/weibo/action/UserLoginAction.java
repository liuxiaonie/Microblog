package com.weibo.action;

import java.io.PrintWriter;

import javax.annotation.Resource;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.actions.DispatchAction;
import org.springframework.stereotype.Controller;

import com.weibo.bean.User;
import com.weibo.formbean.UserForm;
import com.weibo.service.inter.UserService;

/**
 * @author liuwei
 *
 */
@Controller("/login") 
public class UserLoginAction extends DispatchAction{
	@Resource UserService us;
	/* 
	 * @see org.apache.struts.actions.DispatchAction#execute(org.apache.struts.action.ActionMapping, org.apache.struts.action.ActionForm, javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
	 * 显示登录界面
	 */
	public ActionForward loginUI(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
	
		return mapping.findForward("login");
	}
	/* 
	 * @see org.apache.struts.actions.DispatchAction#execute(org.apache.struts.action.ActionMapping, org.apache.struts.action.ActionForm, javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
	 * 登陆验证
	 */
	public ActionForward login(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
		response.setCharacterEncoding("UTF-8");
		UserForm formbean = (UserForm) form;
		User user = new User();
		String username = formbean.getUsername();
		String password = formbean.getPassword();
		//System.out.println(formbean.getIsAutoLogin());
	 
		if(username != ""){
			if(password != ""){
				if(us.exsit(username)){
					int uid = us.findid(username); 
					if(us.find(uid).getUpwd().equals(password)){
						
						request.getSession().setAttribute("User", us.find(uid));
						request.setAttribute("message", "登陆成功，正在跳转，请稍候...");
						request.setAttribute("jumpurl", "/");
						
						if(formbean.getIsAutoLogin()){ //如果用户勾选了自动登陆
							Cookie cookie = new Cookie("userCookie", username+"-"+password);
							cookie.setPath("/");
							cookie.setMaxAge(3600*24*30*12);
							response.addCookie(cookie);
						}
						return mapping.findForward("message");
					}
					else {
						request.setAttribute("loginError", "密码错误");
						return mapping.findForward("login");
					}
				}
				else{
					request.setAttribute("loginError", "对不起，该用户不存在");
					return mapping.findForward("login");
				}
			}
			else {
				request.setAttribute("loginError", "请输入密码");
				return mapping.findForward("login");
			}
		}
		else {
			request.setAttribute("loginError", "请输入用户名");
			//return mapping.findForward("login");
			return mapping.findForward("login");
		}
	}
	/* 
	 * @see org.apache.struts.actions.DispatchAction#execute(org.apache.struts.action.ActionMapping, org.apache.struts.action.ActionForm, javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
	 * 自动登陆
	 *ActionForward
	 */
	
	public ActionForward home(ActionMapping mapping, ActionForm ac,
			HttpServletRequest request, HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
		Cookie[] cookies = request.getCookies();    
		String cookieValue = "";
		String username = "";
		String password = "";
		if(cookies != null){
			
			for (Cookie cookie : cookies) {
				
				if(cookie.getName().equals("userCookie")){
					User user = new User();
					cookieValue = cookie.getValue(); //取cookie值
					
					username = cookieValue.split("-")[0].trim();
					password = cookieValue.split("-")[1].trim();		
					int uid = us.findid(username); 
					
					if(us.find(uid).getUpwd().equals(password)){
						
						
						request.getSession().setAttribute("User", us.find(uid));
						return mapping.findForward("/");
					}
				}
			}
			return mapping.findForward("login");
		}
		else {
			return mapping.findForward("login");
		}
		//return super.execute(arg0, arg1, arg2, arg3);
		
	}
	
}
