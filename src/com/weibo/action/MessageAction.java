package com.weibo.action;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.actions.DispatchAction;
import org.springframework.stereotype.Controller;

import com.weibo.bean.Message;
import com.weibo.bean.User;
import com.weibo.formbean.MessageForm;
import com.weibo.service.inter.MessageService;

/**
 * @author liuwei
 *
 */
@Controller("/message")
public class MessageAction extends DispatchAction{
	
	@Resource MessageService ms;
	/* 
	 * @see org.apache.struts.actions.DispatchAction#execute(org.apache.struts.action.ActionMapping, org.apache.struts.action.ActionForm, javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
	 */
	
	public ActionForward publish(ActionMapping action, ActionForm form,
			HttpServletRequest request, HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
		Message msg = new Message();
		MessageForm formbean = (MessageForm) form;
		System.out.println(form);
		System.out.println(formbean.getMcontent());
		
		User user = new User(); 
		user = (User) request.getSession().getAttribute("User");
		//System.out.println(request.getSession().getAttribute("User"));
		if(user!=null){
			if(formbean.getMcontent()!=null){		
			msg.setUser(new User(user.getUid()));
			msg.setMcontent(formbean.getMcontent());		
			ms.save(msg);
			request.setAttribute("message", "发表成功...");
			request.setAttribute("jumpurl", "/message.do?method=all");	
			return action.findForward("message");
			}
			else {
				request.setAttribute("message", "微博内容不能为空...");
				request.setAttribute("jumpurl", "/message.do?method=all");	
				return action.findForward("message");
			}

		}
		else {
			request.setAttribute("message", "发表失败...");
			request.setAttribute("jumpurl", "/message.do?method=all");
			return action.findForward("message");
		
		}
	}
	public ActionForward all(ActionMapping action, ActionForm form,
			HttpServletRequest request, HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
		List list = new ArrayList();	
		User user = new User(); 
		user = (User) request.getSession().getAttribute("User");
		list = ms.showMessage(user.getUid(), 10);
		request.setAttribute("messageList", list);
		return action.findForward("/");
	}
	
}
