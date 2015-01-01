package com.weibo.action;

import java.io.PrintWriter;
import java.io.WriteAbortedException;
import java.io.Writer;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.actions.DispatchAction;
import org.springframework.stereotype.Controller;

import com.weibo.bean.User;
import com.weibo.formbean.Sex;
import com.weibo.formbean.UserForm;
import com.weibo.service.inter.UserService;

/**
 * @author liuwei
 *
 */
@Controller("/register") 
public class UserRegisterAction extends DispatchAction {
	@Resource UserService us;
	/* 
	 * @see org.apache.struts.actions.DispatchAction#execute(org.apache.struts.action.ActionMapping, org.apache.struts.action.ActionForm, javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
	 *
	 * 显示注册界面
	 */
	
	public ActionForward regUI (ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
		return mapping.findForward("reg");
	}

	/**
	 * reg
	 * 
	 * 用户注册
	 * @param  
	 */
	public ActionForward reg (ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
		UserForm formbean = (UserForm) form;
		User user = new User();
		if(!us.exsit(formbean.getUsername())){
			user.setUname(formbean.getUsername());
			user.setUpwd(formbean.getPassword());		
			user.setUnickname(formbean.getNickname());
			user.setUsex(formbean.getSex());
			user.setUintro(formbean.getIntro());
			//User user = new User(formbean.getUsername(),formbean.getPassword(),formbean.getSex(),formbean.getIntro());
			us.save(user);
			request.getSession().setAttribute("User", user);
			request.setAttribute("jumpurl", "/");
			request.setAttribute("message", "注册成功，正在跳转，请稍候...");
			//System.out.println(formbean.getSex());
			return mapping.findForward("message");
		}
		else{
			//System.out.println("�û��Ѵ���");
			request.setAttribute("message", "该用户已经存在");
			request.getSession().setAttribute("user", user);
			return mapping.findForward("reg");
		}
		
	}
	
	/* 
	 * @see org.apache.struts.actions.DispatchAction#execute(org.apache.struts.action.ActionMapping, org.apache.struts.action.ActionForm, javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
	 *
	 *  判断用户是否存在
	 */
	
	public void uesrIsExsit (ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
		UserForm formbean = (UserForm) form;
		PrintWriter out = response.getWriter();
		response.setCharacterEncoding("UTF-8");
		
		if(us.exsit(formbean.getUsername())){
			out.print("true");
		}
		else {
			out.print("false");
		}
		//System.out.println(formbean.getUsername());
		//return mapping.findForward("");
	}
}
