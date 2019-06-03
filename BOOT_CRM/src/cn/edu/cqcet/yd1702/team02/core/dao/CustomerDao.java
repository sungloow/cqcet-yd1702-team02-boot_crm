package cn.edu.cqcet.yd1702.team02.core.dao;
import java.util.List;
import cn.edu.cqcet.yd1702.team02.core.po.Customer;
/**  
* 创建时间：2019年6月3日 下午9:30:53  
* 项目名称：BOOT_CRM  
* @author 周圣龙
* @version 1.0   
* @since JDK 1.8.0_191
* 文件名称：CustomerDao.java  
* 类说明：  CustomerDao接口
*/
public interface CustomerDao {
	//客户列表
	public List<Customer> selectCustomerList(Customer customer);
	//客户数
	public Integer selectCustomerListCount(Customer customer);
}
