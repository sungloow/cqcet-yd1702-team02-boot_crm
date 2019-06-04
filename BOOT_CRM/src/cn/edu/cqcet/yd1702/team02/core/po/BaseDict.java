package cn.edu.cqcet.yd1702.team02.core.po;
import java.io.Serializable;
/**  
* 创建时间：2019年6月3日 下午9:19:20  
* 项目名称：BOOT_CRM  
* @author 周圣龙
* @version 1.0   
* @since JDK 1.8.0_191
* 文件名称：BaseDict.java  
* 类说明：  数据字典持久化
*/
public class BaseDict implements Serializable {
	private static final long serialVersionUID = 1L;
	private String dict_id;         // 数据字典id
	private String dict_type_code;  // 数据字典类别代码
	private String dict_type_name;  // 数据字典类别名称	
	private String dict_item_name;  // 数据字典项目代码
	private String dict_item_code;  // 数据字典项目名称
	private Integer dict_sort;      // 排序字段
	private String dict_enable;     // 是否可用
	private String dict_memo;       // 备注
	
	public String getDict_id() {
		return dict_id;
	}
	public void setDict_id(String dict_id) {
		this.dict_id = dict_id;
	}
	public String getDict_type_code() {
		return dict_type_code;
	}
	public void setDict_type_code(String dict_type_code) {
		this.dict_type_code = dict_type_code;
	}
	public String getDict_type_name() {
		return dict_type_name;
	}
	public void setDict_type_name(String dict_type_name) {
		this.dict_type_name = dict_type_name;
	}
	public String getDict_item_name() {
		return dict_item_name;
	}
	public void setDict_item_name(String dict_item_name) {
		this.dict_item_name = dict_item_name;
	}
	public String getDict_item_code() {
		return dict_item_code;
	}
	public void setDict_item_code(String dict_item_code) {
		this.dict_item_code = dict_item_code;
	}
	public Integer getDict_sort() {
		return dict_sort;
	}
	public void setDict_sort(Integer dict_sort) {
		this.dict_sort = dict_sort;
	}
	public String getDict_enable() {
		return dict_enable;
	}
	public void setDict_enable(String dict_enable) {
		this.dict_enable = dict_enable;
	}
	public String getDict_memo() {
		return dict_memo;
	}
	public void setDict_memo(String dict_memo) {
		this.dict_memo = dict_memo;
	}
}
