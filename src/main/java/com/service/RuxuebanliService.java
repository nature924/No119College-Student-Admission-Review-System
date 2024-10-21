package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.RuxuebanliEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.RuxuebanliVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.RuxuebanliView;


/**
 * 入学办理
 *
 * @author 
 * @email 
 * @date 2021-05-06 17:48:13
 */
public interface RuxuebanliService extends IService<RuxuebanliEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<RuxuebanliVO> selectListVO(Wrapper<RuxuebanliEntity> wrapper);
   	
   	RuxuebanliVO selectVO(@Param("ew") Wrapper<RuxuebanliEntity> wrapper);
   	
   	List<RuxuebanliView> selectListView(Wrapper<RuxuebanliEntity> wrapper);
   	
   	RuxuebanliView selectView(@Param("ew") Wrapper<RuxuebanliEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<RuxuebanliEntity> wrapper);
   	
}

