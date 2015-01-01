package com.weibo.bean;

/**
 * @author liuwei
 *
 */
public enum Sex {
	man{
		public String getName(){
			return "男";
		}
	},
	woman{
		public String getName(){
			return "女";
		}
	};
	public abstract String getName();
}
