package cn.edu.cqcet.yd1702.team02.core.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.edu.cqcet.yd1702.team02.core.dao.UserDao;
import cn.edu.cqcet.yd1702.team02.core.po.User;
import cn.edu.cqcet.yd1702.team02.core.service.UserService;

/**
 * @title: UserServiceImpl.java
 * @className: UserServiceImpl
 * @description: 用户Service接口实现类
 * @author: 孙红兵
 * @studentId: 2017180243
 * @Date: 2019年5月28日 下午10:13:33
 */
@Service("userService")
@Transactional
public class UserServiceImpl implements UserService {
	// 注入UserDao
	@Autowired
	private UserDao userDao;
	// 通过账号和密码查询用户
	@Override
	public User findUser(String usercode, String password) {
		User user = this.userDao.findUser(usercode, password);
		return user;
	}

}
