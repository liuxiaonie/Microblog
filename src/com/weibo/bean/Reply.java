package com.weibo.bean;

import java.sql.Timestamp;
import java.util.HashSet;
import java.util.Set;

/**
 * Reply entity. @author MyEclipse Persistence Tools
 */

public class Reply extends org.apache.struts.actions.DispatchAction implements
		java.io.Serializable {

	// Fields

	private Integer rid;
	private User userByUid;
	private Message message;
	private User userByRuid;
	private Timestamp rtime;
	private Set messages = new HashSet(0);

	// Constructors

	/** default constructor */
	public Reply() {
	}

	/** minimal constructor */
	public Reply(User userByUid, Message message, User userByRuid,
			Timestamp rtime) {
		this.userByUid = userByUid;
		this.message = message;
		this.userByRuid = userByRuid;
		this.rtime = rtime;
	}

	/** full constructor */
	public Reply(User userByUid, Message message, User userByRuid,
			Timestamp rtime, Set messages) {
		this.userByUid = userByUid;
		this.message = message;
		this.userByRuid = userByRuid;
		this.rtime = rtime;
		this.messages = messages;
	}

	// Property accessors

	public Integer getRid() {
		return this.rid;
	}

	public void setRid(Integer rid) {
		this.rid = rid;
	}

	public User getUserByUid() {
		return this.userByUid;
	}

	public void setUserByUid(User userByUid) {
		this.userByUid = userByUid;
	}

	public Message getMessage() {
		return this.message;
	}

	public void setMessage(Message message) {
		this.message = message;
	}

	public User getUserByRuid() {
		return this.userByRuid;
	}

	public void setUserByRuid(User userByRuid) {
		this.userByRuid = userByRuid;
	}

	public Timestamp getRtime() {
		return this.rtime;
	}

	public void setRtime(Timestamp rtime) {
		this.rtime = rtime;
	}

	public Set getMessages() {
		return this.messages;
	}

	public void setMessages(Set messages) {
		this.messages = messages;
	}

}