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
}
