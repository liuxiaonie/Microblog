package com.weibo.formbean;

import org.apache.struts.action.ActionForm;

/**
 * @author liuwei
 *
 */
public class TitleForm extends ActionForm{
	private Integer id;
	private String tname;
 	private String  tintro;

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getTname() {
		return tname;
	}
	public void setTname(String tname) {
		this.tname = tname;
	}
	public String getTintro() {
		return tintro;
	}
	public void setTintro(String tintro) {
		this.tintro = tintro;
	}
	
	
 	  
}
