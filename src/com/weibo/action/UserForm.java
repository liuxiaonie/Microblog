package com.weibo.action;

import org.apache.struts.action.ActionForm;

/**
 * @author liuwei
 *
 */
public class UserForm extends ActionForm{
	private Integer id;
	private String username;
	private String  password;
	private String  conpassword;
	private String  sex;
 	private String  intro;
 	private String nickname;
 	private Boolean isAutoLogin;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	/**
	 * @return the username
	 */
	public String getUsername() {
		return username;
	}
	/**
	 * @param username the username to set
	 */
	public void setUsername(String username) {
		this.username = username;
	}
	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}
	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}
	/**
	 * @return the conpassword
	 */
	public String getConpassword() {
		return conpassword;
	}
	/**
	 * @param conpassword the conpassword to set
	 */
	public void setConpassword(String conpassword) {
		this.conpassword = conpassword;
	}
	
	
	/**
	 * @return the sex
	 */
	public String getSex() {
		return sex;
	}
	/**
	 * @param sex the sex to set
	 */
	public void setSex(String sex) {
		this.sex = sex;
	}
	/**
	 * @return the intro
	 */
	public String getIntro() {
		return intro;
	}
	/**
	 * @param intro the intro to set
	 */
	public void setIntro(String intro) {
		this.intro = intro;
	}
	/**
	 * @return the nickname
	 */
	public String getNickname() {
		return nickname;
	}
	/**
	 * @param nickname the nickname to set
	 */
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	/**
	 * @return the isAutoLogin
	 */
	public Boolean getIsAutoLogin() {
		return isAutoLogin;
	}
	/**
	 * @param isAutoLogin the isAutoLogin to set
	 */
	public void setIsAutoLogin(Boolean isAutoLogin) {
		this.isAutoLogin = isAutoLogin;
	}
	
 	  
}
