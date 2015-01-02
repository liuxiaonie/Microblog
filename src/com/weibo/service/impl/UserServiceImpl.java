package com.weibo.service.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.weibo.bean.Message;
import com.weibo.bean.User;
import com.weibo.service.inter.UserService;

/**
 * @author liuwei
 *
 */
@Service
public class UserServiceImpl extends DaoSuppot<User> implements UserService{
	
	
	/* 
	 * @see com.weibo.service.impl.UserService#save(com.weibo.bean.User)
	 */
	@Override
	public void save(User user) {
		// TODO Auto-generated method stub
		em.persist(user);
	}

	/* 
	 * @see com.weibo.service.impl.UserService#update(com.weibo.bean.User)
	 */
	@Override
	public void update(User user) {
		// TODO Auto-generated method stub
		em.merge(user);
	}

	/* 
	 * @see com.weibo.service.impl.UserService#delete(java.lang.String)
	 */
    @Override
	public void delete(Integer id) {
		// TODO Auto-generated method stub
		em.remove(em.getReference(User.class, id));
	}

	/* 
	 * @see com.weibo.service.impl.UserService#find(java.lang.String)
	 */
	@Override
	public User find(Integer id) {
		// TODO Auto-generated method stub
		
		return em.find(User.class, id);
	}
	/*
	 * �ж��û��Ƿ����
	 */
	@Override @Transactional(propagation=Propagation.NOT_SUPPORTED,readOnly=true)
	public boolean exsit(String username) {
		long count = (long) em.createQuery("select count(*) from User where Uname = ?1").setParameter(1, username).getSingleResult();
		return count>0;
	}

	@Override
	public int findid(String username) {
		// TODO Auto-generated method stub
		return (int) em.createQuery("select uid from User where Uname=?1").setParameter(1, username).getSingleResult();
	}
		
}
