package cn.edu.cqcet.yd1702.team02.core.service;
import cn.edu.cqcet.yd1702.team02.common.utils.Page;
import cn.edu.cqcet.yd1702.team02.core.po.Customer;
/**  
* 创建时间：2019年6月3日 下午10:38:43  
* 项目名称：BOOT_CRM  
* @author 周圣龙
* @version 1.0   
* @since JDK 1.8.0_191
* 文件名称：CustomerService.java  
* 类说明：  
*/
public interface CustomerService {
	//查询客户列表
	public Page<Customer> findCustomerList(Integer page,Integer rows,String custName,String custSource,String custIndustry,String custLevle);
	/**
	 *  * @author 康峰
	 * 2017180208
	 * @time 2019年6月4日
	 * 
	 */
	public int createCustomer (Customer customer);
	//通过id查询客户
	public Customer getCustomerById(Integer id);
	//更新客户
	public int updateCustomer(Customer customer);
	//删除客户
	public int deleteCustomer(Integer id);
}
