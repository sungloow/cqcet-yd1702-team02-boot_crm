package cn.edu.cqcet.yd1702.team02.core.utils;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * @title: MD5.java
 * @className: MD5
 * @description: //TODO
 * @author: 孙红兵
 * @studentId: 2017180243
 * @Date: 2019年6月4日 上午12:12:30
 */
public class MD5 {
	    //静态方法，便于作为工具类
	        public static String getMd5(String string){
	            try {
	                //创建信息摘要对象实例
	                MessageDigest md = MessageDigest.getInstance("MD5");
	                //获取文本明文为字节
	                md.update(string.getBytes());
	                //创建字节摘要数组
	                byte b[] = md.digest();
	                //创建 int 类型变量i
	                int i;
	                //创建StringBuffer容器
	                StringBuffer buf = new StringBuffer("");
	                for (int j = 0; j < b.length; j++) {    
	                    i = b[j];
	                    if (i < 0)                  
	                        i += 256;   //md5加密最长32位字符.一个字符占8个字节.所以最长允许256个字节的字符串
	                    if (i < 16)     //一个字符=8个字节 0-15不足字符俩字符则补0拼接  
	                    buf.append("0"); 
	                    buf.append(Integer.toHexString(i));//int类型10进制转16进制                     
	                }
	                //32位加密
	                return buf.toString();
	                // 16位的加密  
	                //return buf.toString().substring(8, 24);   
	            } catch (NoSuchAlgorithmException e) {
	                e.printStackTrace();
	                return null;
	            }

	        }
}
