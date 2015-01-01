package com.weibo.bean;

/**
 * Attention entity. @author MyEclipse Persistence Tools
 */

public class Attention extends org.apache.struts.actions.DispatchAction
		implements java.io.Serializable {

	// Fields

	private Integer uid;
	private Integer attid;

	// Constructors

	/** default constructor */
	public Attention() {
	}

	/** full constructor */
	public Attention(Integer uid, Integer attid) {
		this.uid = uid;
		this.attid = attid;
	}

	// Property accessors

	public Integer getUid() {
		return this.uid;
	}

	public void setUid(Integer uid) {
		this.uid = uid;
	}

	public Integer getAttid() {
		return this.attid;
	}

	public void setAttid(Integer attid) {
		this.attid = attid;
	}

}