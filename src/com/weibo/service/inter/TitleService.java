package com.weibo.service.inter;

import com.weibo.bean.Title;

/**
 * @author liuwei
 *
 * �û�ҵ����
 */
public interface TitleService extends Dao<Title>{
	public void save(Title title);
	public void update(Title title);
	public void delete(Integer tid);
	public Title find(Integer tid);
	public int findid(String titlename);
	public boolean exsit(String titlename);
}
