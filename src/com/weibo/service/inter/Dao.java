﻿package com.weibo.service.inter;

import java.io.Serializable;

/**
 * @author liuwei
 *
 * 
 */
public interface Dao<T> {
	
	public Class<T> getEntityClass();
	public void save(T entity); 
	public void update(T entity);
	public void delete(Serializable entityid);  
	public T find(Serializable entityid);
	public long getCount();
}
