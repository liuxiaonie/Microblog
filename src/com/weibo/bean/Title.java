package com.weibo.bean;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Title entity. @author MyEclipse Persistence Tools
 */
@Entity
public class Title extends org.apache.struts.actions.DispatchAction implements
		java.io.Serializable {

	// Fields

	private Integer tid;
	private String tname;
	private String tinfo;

	// Constructors

	/** default constructor */
	public Title() {
	}

	/** minimal constructor */
	public Title(String tname, String tinfo) {
		this.tname = tname;
		this.tinfo = tinfo;
	}

	/** full constructor */
	public Title(String tname, String tinfo, Set messages) {
		this.tname = tname;
		this.tinfo = tinfo;
	}

	// Property accessors
	@Id @GeneratedValue
	public Integer getTid() {
		return this.tid;
	}

	public void setTid(Integer tid) {
		this.tid = tid;
	}

	public String getTname() {
		return this.tname;
	}

	public void setTname(String tname) {
		this.tname = tname;
	}

	public String getTinfo() {
		return this.tinfo;
	}

	public void setTinfo(String tinfo) {
		this.tinfo = tinfo;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((tid == null) ? super.hashCode() : tid.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Title other = (Title) obj;
		if (tid == null) {
			if (other.tid != null)
				return false;
		} else if (!tid.equals(other.tid))
			return false;
		return true;
	}
	
	

}