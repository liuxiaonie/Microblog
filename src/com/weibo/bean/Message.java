package com.weibo.bean;

import java.util.HashSet;
import java.util.Set;

/**
 * Message entity. @author MyEclipse Persistence Tools
 */

public class Message extends org.apache.struts.actions.DispatchAction implements
		java.io.Serializable {

	// Fields

	private Integer mid;
	private Title title;
	private User user;
	private Reply reply;
	private String mtime;
	private String mcontent;
	private Set comments = new HashSet(0);
	private Set replies = new HashSet(0);

	// Constructors

	/** default constructor */
	public Message() {
	}

	/** minimal constructor */
	public Message(String mcontent) {
		this.mcontent = mcontent;
	}

	/** full constructor */
	public Message(Title title, User user, Reply reply, String mtime,
			String mcontent, Set comments, Set replies) {
		this.title = title;
		this.user = user;
		this.reply = reply;
		this.mtime = mtime;
		this.mcontent = mcontent;
		this.comments = comments;
		this.replies = replies;
	}

	// Property accessors

	public Integer getMid() {
		return this.mid;
	}

	public void setMid(Integer mid) {
		this.mid = mid;
	}

	public Title getTitle() {
		return this.title;
	}

	public void setTitle(Title title) {
		this.title = title;
	}

	public User getUser() {
		return this.user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Reply getReply() {
		return this.reply;
	}

	public void setReply(Reply reply) {
		this.reply = reply;
	}

	public String getMtime() {
		return this.mtime;
	}

	public void setMtime(String mtime) {
		this.mtime = mtime;
	}

	public String getMcontent() {
		return this.mcontent;
	}

	public void setMcontent(String mcontent) {
		this.mcontent = mcontent;
	}

	public Set getComments() {
		return this.comments;
	}

	public void setComments(Set comments) {
		this.comments = comments;
	}

	public Set getReplies() {
		return this.replies;
	}

	public void setReplies(Set replies) {
		this.replies = replies;
	}

}