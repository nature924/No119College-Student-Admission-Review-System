package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 入学办理
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-05-06 17:48:13
 */
@TableName("ruxuebanli")
public class RuxuebanliEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public RuxuebanliEntity() {
		
	}
	
	public RuxuebanliEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 学号
	 */
					
	private String xuehao;
	
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
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：学号
	 */
	public void setXuehao(String xuehao) {
		this.xuehao = xuehao;
	}
	/**
	 * 获取：学号
	 */
	public String getXuehao() {
		return xuehao;
	}
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
