package com.weibo.action;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.actions.DispatchAction;
import org.springframework.stereotype.Controller;

/**
 * @author liuwei
 *
 */
@Controller("/logout")
public class UserLogoutAction extends DispatchAction{
	/* 
	 * @see org.apache.struts.actions.DispatchAction#execute(org.apache.struts.action.ActionMapping, org.apache.struts.action.ActionForm, javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
	 * 用户登出
	 */

	public ActionForward logout(ActionMapping mapping, ActionForm ac,
			HttpServletRequest request, HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("UTF-8");
		request.getSession().removeAttribute("User");
		Cookie[] cookies = request.getCookies();
		if(cookies != null){
			
			for (Cookie cookie : cookies) {
				
				if(cookie.getName().equals("userCookie")){
					cookie.setPath("/");
					cookie.setValue("");
					cookie.setMaxAge(0);
					response.addCookie(cookie);
					
				}
			}
		}
		request.setAttribute("message", "退出登陆中...");
		request.setAttribute("jumpurl", "/");
		
		return mapping.findForward("message");
	}	
}
