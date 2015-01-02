package com.weibo.service.impl;

import java.util.List;

import javax.persistence.Query;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.weibo.bean.Message;
import com.weibo.bean.User;
import com.weibo.service.inter.MessageService;

/**
 * @author liuwei
 *
 */
@Service
public class MessageServiceImpl extends DaoSuppot<Message> implements MessageService{
	
	
	/* 
	 * @see com.weibo.service.impl.MessageService#save(com.weibo.bean.Message)
	 */
	@Override
	public void save(Message message) {
		// TODO Auto-generated method stub
		em.persist(message);
	}

	/* 
	 * @see com.weibo.service.impl.MessageService#update(com.weibo.bean.Message)
	 */
	@Override
	public void update(Message message) {
		// TODO Auto-generated method stub
		em.merge(message);
	}

	/* 
	 * @see com.weibo.service.impl.MessageService#delete(java.lang.String)
	 */
    @Override
	public void delete(Integer id) {
		// TODO Auto-generated method stub
		em.remove(em.getReference(Message.class, id));
	}

	/* 
	 * @see com.weibo.service.impl.MessageService#find(java.lang.String)
	 */
	@Override
	public Message find(Integer id) {
		// TODO Auto-generated method stub
		
		return em.find(Message.class, id);
	}
	@Override
	public int findid(String Messagename) {
		// TODO Auto-generated method stub
		return (int) em.createQuery("select uid from message where Uname=?1").setParameter(1, Messagename).getSingleResult();
	}

	@Override
	public boolean exsit(String Messagename) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Message> showMessage(Integer uid, int maxResult){
		StringBuffer jpql = new StringBuffer();
		Query query = (Query) em.createQuery("select m from Message m where m.user.uid in(?1) order by m.mtime DESC");
		query.setParameter(1, uid);	
		query.setFirstResult(0).setMaxResults(maxResult);
		
		return query.getResultList();
	}
/*	@Override
	public List<Message> showMessage(Integer[] mids, int maxResult){
		StringBuffer jpql = new StringBuffer();
		for(int i=0 ;i<mids.length; i++){
			jpql.append('?').append(i).append(',');
		}
		jpql.deleteCharAt(jpql.length()-1);
		Query query = (Query) em.createQuery("select o from Message o where o.user.uid in("+ jpql.toString()+")");
		for(int i=0 ;i<mids.length; i++){
			query.setParameter(i, mids[i]);
		}
		query.setFirstResult(0).setMaxResults(maxResult);
		return query.getResultList();
	}
*/
			
}
