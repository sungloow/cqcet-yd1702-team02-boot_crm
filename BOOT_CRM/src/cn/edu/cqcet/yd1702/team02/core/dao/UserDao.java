package cn.edu.cqcet.yd1702.team02.core.dao;

import org.apache.ibatis.annotations.Param;

import cn.edu.cqcet.yd1702.team02.core.po.User;

/**
 * @title: UserDao.java
 * @className: UserDao
 * @description: 用户DAO层接口
 * @author: 孙红兵
 * @studentId: 2017180243
 * @Date: 2019年5月28日 下午10:14:59
 */
public interface UserDao {
	/**
	 * 通过账号和密码查询用户
	 */
	
	public User findUser(@Param("usercode") String usercode, @Param("password") String password);
}
