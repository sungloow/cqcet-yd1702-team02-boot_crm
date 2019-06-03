package cn.edu.cqcet.yd1702.team02.core.service.impl;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import cn.edu.cqcet.yd1702.team02.core.dao.BaseDictDao;
import cn.edu.cqcet.yd1702.team02.core.po.BaseDict;
import cn.edu.cqcet.yd1702.team02.core.service.BaseDictService;
/**  
* 创建时间：2019年6月3日 下午10:56:42  
* 项目名称：BOOT_CRM  
* @author 周圣龙
* @version 1.0   
* @since JDK 1.8.0_191
* 文件名称：BaseDictServiceImpl.java  
* 类说明：  数据字典Service接口实现类
*/
@Service("baseDictService")
public class BaseDictServiceImpl implements BaseDictService{
	@Autowired
	private BaseDictDao baseDictDao;
	//根据类别代码查询数据字典
	public List<BaseDict> findBaseDictByTypeCode(String typecode){
		return baseDictDao.selectBaseDictByTypeCode(typecode);
	}
}