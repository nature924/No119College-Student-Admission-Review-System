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
 * 学籍信息
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-05-06 17:48:13
 */
@TableName("xuejixinxi")
public class XuejixinxiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public XuejixinxiEntity() {
		
	}
	
	public XuejixinxiEntity(T t) {
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
	 * 性别
	 */
					
	private String xingbie;
	
	/**
	 * 年龄
	 */
					
	private Integer nianling;
	
	/**
	 * 出生日期
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
	@DateTimeFormat 		
	private Date chushengriqi;
	
	/**
	 * 身份证号
	 */
					
	private String shenfenzhenghao;
	
	/**
	 * 现读学校
	 */
					
	private String xianduxuexiao;
	
	/**
	 * 最高学历
	 */
					
	private String zuigaoxueli;
	
	/**
	 * 体检表
	 */
					
	private String tijianbiao;
	
	/**
	 * 学生成绩表
	 */
					
	private String xueshengchengjibiao;
	
	/**
	 * 党籍关系
	 */
					
	private String dangjiguanxi;
	
	/**
	 * 荣誉证书
	 */
					
	private String rongyuzhengshu;
	
	/**
	 * 照片
	 */
					
	private String zhaopian;
	
	
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
	 * 设置：性别
	 */
	public void setXingbie(String xingbie) {
		this.xingbie = xingbie;
	}
	/**
	 * 获取：性别
	 */
	public String getXingbie() {
		return xingbie;
	}
	/**
	 * 设置：年龄
	 */
	public void setNianling(Integer nianling) {
		this.nianling = nianling;
	}
	/**
	 * 获取：年龄
	 */
	public Integer getNianling() {
		return nianling;
	}
	/**
	 * 设置：出生日期
	 */
	public void setChushengriqi(Date chushengriqi) {
		this.chushengriqi = chushengriqi;
	}
	/**
	 * 获取：出生日期
	 */
	public Date getChushengriqi() {
		return chushengriqi;
	}
	/**
	 * 设置：身份证号
	 */
	public void setShenfenzhenghao(String shenfenzhenghao) {
		this.shenfenzhenghao = shenfenzhenghao;
	}
	/**
	 * 获取：身份证号
	 */
	public String getShenfenzhenghao() {
		return shenfenzhenghao;
	}
	/**
	 * 设置：现读学校
	 */
	public void setXianduxuexiao(String xianduxuexiao) {
		this.xianduxuexiao = xianduxuexiao;
	}
	/**
	 * 获取：现读学校
	 */
	public String getXianduxuexiao() {
		return xianduxuexiao;
	}
	/**
	 * 设置：最高学历
	 */
	public void setZuigaoxueli(String zuigaoxueli) {
		this.zuigaoxueli = zuigaoxueli;
	}
	/**
	 * 获取：最高学历
	 */
	public String getZuigaoxueli() {
		return zuigaoxueli;
	}
	/**
	 * 设置：体检表
	 */
	public void setTijianbiao(String tijianbiao) {
		this.tijianbiao = tijianbiao;
	}
	/**
	 * 获取：体检表
	 */
	public String getTijianbiao() {
		return tijianbiao;
	}
	/**
	 * 设置：学生成绩表
	 */
	public void setXueshengchengjibiao(String xueshengchengjibiao) {
		this.xueshengchengjibiao = xueshengchengjibiao;
	}
	/**
	 * 获取：学生成绩表
	 */
	public String getXueshengchengjibiao() {
		return xueshengchengjibiao;
	}
	/**
	 * 设置：党籍关系
	 */
	public void setDangjiguanxi(String dangjiguanxi) {
		this.dangjiguanxi = dangjiguanxi;
	}
	/**
	 * 获取：党籍关系
	 */
	public String getDangjiguanxi() {
		return dangjiguanxi;
	}
	/**
	 * 设置：荣誉证书
	 */
	public void setRongyuzhengshu(String rongyuzhengshu) {
		this.rongyuzhengshu = rongyuzhengshu;
	}
	/**
	 * 获取：荣誉证书
	 */
	public String getRongyuzhengshu() {
		return rongyuzhengshu;
	}
	/**
	 * 设置：照片
	 */
	public void setZhaopian(String zhaopian) {
		this.zhaopian = zhaopian;
	}
	/**
	 * 获取：照片
	 */
	public String getZhaopian() {
		return zhaopian;
	}

}
