package com.weibo.service.impl;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

import javax.lang.model.element.Parameterizable;
import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.transaction.annotation.Transactional;

import com.weibo.service.inter.Dao;

/**
 * @author liuwei
 *
 */
@Transactional
public abstract class DaoSuppot<T> implements Dao<T> {

    @PersistenceContext protected EntityManager em;//ע��EntityManager
    protected Class<T> entityClass = getEntityClass();
    
  /*  public QueryResult<T> getScrollData(int firstResult,int maxResult){
    	String entityName = getEntityName(entityClass);
    }
    	*/
	/**
	 * getEntityClass
	 */
	@SuppressWarnings("unchecked")
	public Class<T> getEntityClass() {
		// TODO Auto-generated method stub
		Type t = getClass().getGenericSuperclass(); 
		ParameterizedType pt = (ParameterizedType)t; //ת�����Ͷ���
		return (Class)pt.getActualTypeArguments()[0]; //�õ����Ͳ���

	}
	/**
	 * getEntityName 
	 */
	public String getEntityName(){
		String entityName = this.entityClass.getSimpleName();
		Entity en = this.entityClass.getAnnotation(Entity.class);
		if(en.name() != null && !"".equals(en.name())){
			entityName = en.name();
		}
		return entityName;
	}
	
	/* 
	 * @see com.weibo.dao.inter.Base#save(java.lang.Object)
	 */
	@Override
	public void save(T entity) {
		// TODO Auto-generated method stub
		em.persist(entity);
	}

	/* 
	 * @see com.weibo.dao.inter.Base#update(java.lang.Object)
	 */
	@Override
	public void update(T entity) {
		// TODO Auto-generated method stub
		em.merge(entity);
	}

	/* 
	 * @see com.weibo.dao.inter.Base#delete(java.io.Serializable)
	 */
	@Override
	public void delete(Serializable entityname) {
		// TODO Auto-generated method stub	
		em.remove(em.getReference(entityClass, entityname));
	}

	/* 
	 * @see com.weibo.dao.inter.Base#find(java.io.Serializable)
	 */
	@Override
	public T find(Serializable entityname) {
		// TODO Auto-generated method stub
		return em.find(entityClass, entityname);
	}

	/* 
	 * @see com.weibo.dao.inter.Base#getCount()
	 */
	@Override
	public long getCount() {
		// TODO Auto-generated method stub
		return (Long)em.createQuery("select count(x) from "+getEntityName()+ " x").getSingleResult();
			
	}


}
