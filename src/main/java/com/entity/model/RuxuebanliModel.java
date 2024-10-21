package com.entity.model;

import com.entity.RuxuebanliEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 入学办理
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2021-05-06 17:48:13
 */
public class RuxuebanliModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 姓名
	 */
	
	private String xingming;
		
	/**
	 * 是否入学
	 */
	
	private String shifouruxue;
		
	/**
	 * 生活用品领取
	 */
	
	private String shenghuoyongpinlingqu;
		
	/**
	 * 宿舍报到
	 */
	
	private String sushebaodao;
				
	
	/**
	 * 设置：姓名
	 */
	 
	public void setXingming(String xingming) {
		this.xingming = xingming;
	}
	
	/**
	 * 获取：姓名
	 */
	public String getXingming() {
		return xingming;
	}
				
	
	/**
	 * 设置：是否入学
	 */
	 
	public void setShifouruxue(String shifouruxue) {
		this.shifouruxue = shifouruxue;
	}
	
	/**
	 * 获取：是否入学
	 */
	public String getShifouruxue() {
		return shifouruxue;
	}
				
	
	/**
	 * 设置：生活用品领取
	 */
	 
	public void setShenghuoyongpinlingqu(String shenghuoyongpinlingqu) {
		this.shenghuoyongpinlingqu = shenghuoyongpinlingqu;
	}
	
	/**
	 * 获取：生活用品领取
	 */
	public String getShenghuoyongpinlingqu() {
		return shenghuoyongpinlingqu;
	}
				
	
	/**
	 * 设置：宿舍报到
	 */
	 
	public void setSushebaodao(String sushebaodao) {
		this.sushebaodao = sushebaodao;
	}
	
	/**
	 * 获取：宿舍报到
	 */
	public String getSushebaodao() {
		return sushebaodao;
	}
			
}
