package cn.edu.cqcet.yd1702.team02.core.controller;

import java.sql.SQLException;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import cn.edu.cqcet.yd1702.team02.core.po.User;
import cn.edu.cqcet.yd1702.team02.core.service.UserService;
import cn.edu.cqcet.yd1702.team02.core.utils.MD5;

/**
 * @title: UserController.java
 * @className: UserController
 * @description: 用户控制器类
 * @author: 孙红兵
 * @studentId: 2017180243
 * @Date: 2019年5月28日 下午10:04:15
 */

@Controller
public class UserController {
	// 依赖注入
		@Autowired
		private UserService userService;
		/**
		 * 用户登录
		 */
		@RequestMapping(value = "/login.action", method = RequestMethod.POST)
		public String login(String usercode,String password, Model model, HttpSession session) throws SQLException {
			// 通过账号和密码查询用户
//			User user = userService.findUser(usercode, password);
//			将获取的密码进行MD5加密
			String passwordMd5 = MD5.getMd5(password);
						
			
			try {
				User user = userService.findUser(usercode, passwordMd5);
				if(user != null){
					// 将用户对象添加到Session
					session.setAttribute("USER_SESSION", user);
					// 跳转到主页面
					return "customer";
//						return "redirect:customer/list.action";
				}
				model.addAttribute("msg", "账号或密码错误，请重新输入！");
			} catch (Exception e) {
				System.out.println("数据库连接异常" + e.getMessage());
				model.addAttribute("msg", "当前网络环境无法登录！");
			}
			
	         // 返回到登录页面
			return "login";
		}
		
		/**
		 * 模拟其他类中跳转到客户管理页面的方法
		 */
		@RequestMapping(value = "/toCustomer.action")
		public String toCustomer() {
		    return "customer";
		}
		
		/**
		 * 退出登录
		 */
		@RequestMapping(value = "/logout.action")
		public String logout(HttpSession session) {
		    // 清除Session
		    session.invalidate();
		    // 重定向到登录页面的跳转方法
		    return "redirect:login.action";
		}
		/**
		 * 向用户登陆页面跳转
		 */
		@RequestMapping(value = "/login.action", method = RequestMethod.GET)
		public String toLogin() {
		    return "login";
		}


}
