package com.baize.mall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.baize.common.utils.PageUtils;
import com.baize.mall.product.entity.AttrEntity;

import java.util.Map;

/**
 * 商品属性
 *
 * @author baize
 * @email baize@gmail.com
 * @date 2023-03-16 09:16:25
 */
public interface AttrService extends IService<AttrEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

