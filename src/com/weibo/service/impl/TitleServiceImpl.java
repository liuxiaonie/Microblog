package com.weibo.service.impl;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.weibo.bean.Title;
import com.weibo.service.inter.TitleService;

/**
 * @author liuwei
 *
 */
@Service
public class TitleServiceImpl extends DaoSuppot<Title> implements TitleService{
	
	
	/* 
	 * @see com.weibo.service.impl.TitleService#save(com.weibo.bean.Title)
	 */
	@Override
	public void save(Title title) {
		// TODO Auto-generated method stub
		em.persist(title);
	}

	/* 
	 * @see com.weibo.service.impl.TitleService#update(com.weibo.bean.Title)
	 */
	@Override
	public void update(Title title) {
		// TODO Auto-generated method stub
		em.merge(title);
	}

	/* 
	 * @see com.weibo.service.impl.TitleService#delete(java.lang.String)
	 */
    @Override
	public void delete(Integer id) {
		// TODO Auto-generated method stub
		em.remove(em.getReference(Title.class, id));
	}

	/* 
	 * @see com.weibo.service.impl.TitleService#find(java.lang.String)
	 */
	@Override
	public Title find(Integer id) {
		// TODO Auto-generated method stub
		
		return em.find(Title.class, id);
	}
	@Override
	public int findid(String Titlename) {
		// TODO Auto-generated method stub
		return (int) em.createQuery("select uid from Title where Uname=?1").setParameter(1, Titlename).getSingleResult();
	}

	@Override
	public boolean exsit(String titlename) {
		// TODO Auto-generated method stub
		return false;
	}
		
}
