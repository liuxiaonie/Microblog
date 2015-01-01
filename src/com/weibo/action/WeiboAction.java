package com.weibo.action;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.actions.DispatchAction;
import org.springframework.stereotype.Controller;

import com.weibo.service.inter.UserService;

/**
 * @author liuwei
 *
 */
@Controller("/index")
public class WeiboAction extends DispatchAction{
	
	@Resource UserService us;
	/* 
	 * @see org.apache.struts.actions.DispatchAction#execute(org.apache.struts.action.ActionMapping, org.apache.struts.action.ActionForm, javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
	 */
	
	public ActionForward index(ActionMapping mapping, ActionForm ac,
			HttpServletRequest request, HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
		
		return null;//super.execute(arg0, arg1, arg2, arg3);
	}
	
}
