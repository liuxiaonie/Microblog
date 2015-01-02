package com.weibo.formbean;

import java.util.Date;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;


public class MessageForm extends ActionForm{
	private String title;
	private String mcontent;
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getMcontent() {
		System.out.println(mcontent);
		return mcontent;
	}
	public void setMcontent(String mcontent) {
		this.mcontent = mcontent;
	}
	
}
