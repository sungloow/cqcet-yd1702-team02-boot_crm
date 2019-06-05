package cn.edu.cqcet.yd1702.team02.core.service.impl;

import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.edu.cqcet.yd1702.team02.common.utils.Page;
import cn.edu.cqcet.yd1702.team02.core.dao.CustomerDao;
import cn.edu.cqcet.yd1702.team02.core.po.Customer;
import cn.edu.cqcet.yd1702.team02.core.service.CustomerService;

/**
 * 创建时间：2019年6月3日 下午11:01:37 项目名称：BOOT_CRM
 * 
 * @author 周圣龙
 * @version 1.0
 * @since JDK 1.8.0_191 文件名称：CustomerServiceImpl.java 类说明： 客户管理
 */
@Service("customerService")
@Transactional
public class CustomerServiceImpl implements CustomerService {
	// 声明DAO属性并注入
	@Autowired
	private CustomerDao customerDao;

	// 客户列表
	public Page<Customer> findCustomerList(Integer page, Integer rows, String custName, String custSource,
			String custIndustry, String custLevel) {
		// 创建客户对象
		Customer customer = new Customer();
		// 判断客户名称
		if (StringUtils.isNotBlank(custName)) {
			customer.setCust_name(custName);
		}
		// 判断客户信息来源
		if (StringUtils.isNotBlank(custSource)) {
			customer.setCust_source(custSource);
		}
		// 判断客户所属行业
		if (StringUtils.isNotBlank(custIndustry)) {
			customer.setCust_industry(custIndustry);
		}
		// 判断客户级别
		if (StringUtils.isNotBlank(custLevel)) {
			customer.setCust_level(custLevel);
		}
		//当前页
		customer.setStart((page-1) * rows);
		//每页数
		customer.setRows(rows);
		//查询客户列表
		List<Customer> customers = customerDao.selectCustomerList(customer);
		//查询客户列表总记录数
		Integer count = customerDao.selectCustomerListCount(customer);
		//创建Page返回对象
		Page<Customer> result = new Page<>();
		result.setPage(page);
		result.setRows(customers);
		result.setSize(rows);
		result.setTotal(count);
		return result;
	}
	/**
	 *  * @author 康峰
	 * 2017180208
	 * @time 2019年6月4日
	 * 
	 */
	@Override
	public int  createCustomer (Customer customer){
	return customerDao.createCustomer(customer);
	}


	/**
	*通过id查询客户
	*/
	@Override
	public Customer  getCustomerById (Integer id){
	Customer customer = customerDao.getCustomerById(id);
	return customer;
	}
	/**
	*更新客户
	*/
	@Override
	public int updateCustomer (Customer customer){
	return customerDao.updateCustomer(customer);
	}

	/**
	*删除客户
	*/
	@Override
	public int deleteCustomer (Integer id){
	return customerDao.deleteCustomer(id);
	}
}
