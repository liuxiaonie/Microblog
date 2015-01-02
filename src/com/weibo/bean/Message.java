package com.weibo.bean;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.apache.struts.actions.DispatchAction;

/**
 * Message entity. @author MyEclipse Persistence Tools
 */
@Entity
public class Message extends DispatchAction implements
		java.io.Serializable {

	// Fields
	
	private Integer Mid;
	private Title title;
	private User user;
	private Reply reply;
	private Date Mtime;
	private String Mcontent;


	// Constructors

	/** default constructor */
	public Message() {
	}

	/** minimal constructor */
	public Message(String mcontent) {
		this.Mcontent = mcontent;
	}

	/** full constructor */
	public Message(Title title, User user, Reply reply, Date mtime,
			String mcontent, Set comments, Set replies) {
		this.title = title;
		this.user = user;
		this.reply = reply;
		this.Mtime = mtime;
		this.Mcontent = mcontent;
	}

	// Property accessors
	@Id @GeneratedValue
	public Integer getMid() {
		return this.Mid;
	}

	public void setMid(Integer mid) {
		this.Mid = mid;
	}
	@ManyToOne(cascade = CascadeType.REFRESH)
	@JoinColumn(name = "Tid")
	public Title getTitle() {
		return this.title;
	}

	public void setTitle(Title title) {
		this.title = title;
	}
	@ManyToOne(cascade = CascadeType.REFRESH)
	@JoinColumn(name = "Uid")
	public User getUser() {
		return this.user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	@JoinColumn(name = "Rid")
	public Reply getReply() {
		return this.reply;
	}

	public void setReply(Reply reply) {
		this.reply = reply;
	}
	@Temporal(TemporalType.TIMESTAMP)
	public Date getMtime() {
		return this.Mtime;
	}

	public void setMtime(Date mtime) {
		this.Mtime = mtime;
	}

	public String getMcontent() {
		return this.Mcontent;
	}

	public void setMcontent(String mcontent) {
		this.Mcontent = mcontent;
	}

}