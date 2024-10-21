package com.entity.view;

import com.entity.XuejixinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 学籍信息
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-05-06 17:48:13
 */
@TableName("xuejixinxi")
public class XuejixinxiView  extends XuejixinxiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public XuejixinxiView(){
	}
 
 	public XuejixinxiView(XuejixinxiEntity xuejixinxiEntity){
 	try {
			BeanUtils.copyProperties(this, xuejixinxiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
