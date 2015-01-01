package com.weibo.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * @author liuwei
 *
 * 
 */
@Entity
public class User {
	
	private Integer Uid;
	private String Uname;
	private String Upwd;
	private String Usex = "男";
	private String Unickname;
	private String Uintro;
	
	@Id  @GeneratedValue
	/**
	 * @return the uid
	 */
	public Integer getUid() {
		return Uid;
	}
	/**
	 * @param uid the uid to set
	 */
	public void setUid(Integer uid) {
		Uid = uid;
	}
	/**
	 * @return the uname
	 */
	public String getUname() {
		return Uname;
	}
	/**
	 * @param uname the uname to set
	 */
	public void setUname(String uname) {
		Uname = uname;
	}
	/**
	 * @return the upwd
	 */
	public String getUpwd() {
		return Upwd;
	}
	/**
	 * @param upwd the upwd to set
	 */
	public void setUpwd(String upwd) {
		Upwd = upwd;
	}
	/**
	 * @return the usex
	 */
	public String getUsex() {
		return Usex;
	}
	/**
	 * @param usex the usex to set
	 */
	public void setUsex(String usex) {
		Usex = usex;
	}
	/**
	 * @return the unickname
	 */
	public String getUnickname() {
		return Unickname;
	}
	/**
	 * @param unickname the unickname to set
	 */
	public void setUnickname(String unickname) {
		Unickname = unickname;
	}
	/**
	 * @return the uintro
	 */
	public String getUintro() {
		return Uintro;
	}
	/**
	 * @param uintro the uintro to set
	 */
	public void setUintro(String uintro) {
		Uintro = uintro;
	}
	/* 
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Uid == null) ? super.hashCode() : Uid.hashCode());
		return result;
	}
	/* 
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		if (Uid == null) {
			if (other.Uid != null)
				return false;
		} else if (!Uid.equals(other.Uid))
			return false;
		return true;
	}

	



}
