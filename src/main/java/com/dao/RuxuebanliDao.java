package com.dao;

import com.entity.RuxuebanliEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.RuxuebanliVO;
import com.entity.view.RuxuebanliView;


/**
 * 入学办理
 * 
 * @author 
 * @email 
 * @date 2021-05-06 17:48:13
 */
public interface RuxuebanliDao extends BaseMapper<RuxuebanliEntity> {
	
	List<RuxuebanliVO> selectListVO(@Param("ew") Wrapper<RuxuebanliEntity> wrapper);
	
	RuxuebanliVO selectVO(@Param("ew") Wrapper<RuxuebanliEntity> wrapper);
	
	List<RuxuebanliView> selectListView(@Param("ew") Wrapper<RuxuebanliEntity> wrapper);

	List<RuxuebanliView> selectListView(Pagination page,@Param("ew") Wrapper<RuxuebanliEntity> wrapper);
	
	RuxuebanliView selectView(@Param("ew") Wrapper<RuxuebanliEntity> wrapper);
	
}
