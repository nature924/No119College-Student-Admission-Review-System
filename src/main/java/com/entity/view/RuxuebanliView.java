package com.entity.view;

import com.entity.RuxuebanliEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 入学办理
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-05-06 17:48:13
 */
@TableName("ruxuebanli")
public class RuxuebanliView  extends RuxuebanliEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public RuxuebanliView(){
	}
 
 	public RuxuebanliView(RuxuebanliEntity ruxuebanliEntity){
 	try {
			BeanUtils.copyProperties(this, ruxuebanliEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
