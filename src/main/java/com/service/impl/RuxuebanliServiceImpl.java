package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.RuxuebanliDao;
import com.entity.RuxuebanliEntity;
import com.service.RuxuebanliService;
import com.entity.vo.RuxuebanliVO;
import com.entity.view.RuxuebanliView;

@Service("ruxuebanliService")
public class RuxuebanliServiceImpl extends ServiceImpl<RuxuebanliDao, RuxuebanliEntity> implements RuxuebanliService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<RuxuebanliEntity> page = this.selectPage(
                new Query<RuxuebanliEntity>(params).getPage(),
                new EntityWrapper<RuxuebanliEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<RuxuebanliEntity> wrapper) {
		  Page<RuxuebanliView> page =new Query<RuxuebanliView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<RuxuebanliVO> selectListVO(Wrapper<RuxuebanliEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public RuxuebanliVO selectVO(Wrapper<RuxuebanliEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<RuxuebanliView> selectListView(Wrapper<RuxuebanliEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public RuxuebanliView selectView(Wrapper<RuxuebanliEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
