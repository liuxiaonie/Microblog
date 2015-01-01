package com.weibo.service.inter;

import com.weibo.bean.User;

/**
 * @author liuwei
 *
 * �û�ҵ����
 */
public interface UserService extends Dao<User>{
	public void save(User user);
	public void update(User user);
	public void delete(Integer uid);
	public User find(Integer uid);
	public int findid(String username);
	public boolean exsit(String username);
}
