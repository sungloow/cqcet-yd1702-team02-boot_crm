package cn.edu.cqcet.yd1702.team02.core.dao;
import java.util.List;
import cn.edu.cqcet.yd1702.team02.core.po.BaseDict;
/**  
* 创建时间：2019年6月3日 下午10:12:07  
* 项目名称：BOOT_CRM  
* @author 周圣龙
* @version 1.0   
* @since JDK 1.8.0_191
* 文件名称：BaseDictDao.java  
* 类说明：  数据字典
*/
public interface BaseDictDao {
	// 根据类别代码查询数据字典
    public List<BaseDict> selectBaseDictByTypeCode(String typecode);
}