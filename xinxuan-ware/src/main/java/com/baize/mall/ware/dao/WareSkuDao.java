package com.baize.mall.ware.dao;

import com.baize.mall.ware.entity.WareSkuEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品库存
 * 
 * @author baize
 * @email baize@gmail.com
 * @date 2023-03-16 09:48:30
 */
@Mapper
public interface WareSkuDao extends BaseMapper<WareSkuEntity> {
	
}
