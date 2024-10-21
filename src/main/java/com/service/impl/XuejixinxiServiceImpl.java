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


import com.dao.XuejixinxiDao;
import com.entity.XuejixinxiEntity;
import com.service.XuejixinxiService;
import com.entity.vo.XuejixinxiVO;
import com.entity.view.XuejixinxiView;

@Service("xuejixinxiService")
public class XuejixinxiServiceImpl extends ServiceImpl<XuejixinxiDao, XuejixinxiEntity> implements XuejixinxiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<XuejixinxiEntity> page = this.selectPage(
                new Query<XuejixinxiEntity>(params).getPage(),
                new EntityWrapper<XuejixinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<XuejixinxiEntity> wrapper) {
		  Page<XuejixinxiView> page =new Query<XuejixinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<XuejixinxiVO> selectListVO(Wrapper<XuejixinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public XuejixinxiVO selectVO(Wrapper<XuejixinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<XuejixinxiView> selectListView(Wrapper<XuejixinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public XuejixinxiView selectView(Wrapper<XuejixinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
