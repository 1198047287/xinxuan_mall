package com.baize.mall.product.dao;

import com.baize.mall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author baize
 * @email baize@gmail.com
 * @date 2023-03-16 09:16:25
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
