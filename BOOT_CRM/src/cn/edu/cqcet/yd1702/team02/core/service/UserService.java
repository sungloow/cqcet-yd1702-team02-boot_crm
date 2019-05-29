package cn.edu.cqcet.yd1702.team02.core.service;

import cn.edu.cqcet.yd1702.team02.core.po.User;

/**
 * @title: UserService.java
 * @className: UserService
 * @description: 用户Service层接口
 * @author: 孙红兵
 * @studentId: 2017180243
 * @Date: 2019年5月28日 下午10:12:30
 */
public interface UserService {
	// 通过账号和密码查询用户
	public User findUser(String usercode,String password);
}
