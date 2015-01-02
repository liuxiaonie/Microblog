package com.weibo.service.inter;


import java.util.List;

import com.weibo.bean.Message;
import com.weibo.bean.User;

/**
 * @author liuwei
 *
 * �û�ҵ����
 */
public interface MessageService extends Dao<Message>{
	public void save(Message message);
	public void update(Message message);
	public void delete(Integer mid);
	public Message find(Integer mid);
	public List<Message> showMessage(Integer uid, int maxResult);
	public int findid(String messagename);
	public boolean exsit(String messagename);
}
