package com.baize.mall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.baize.common.utils.PageUtils;
import com.baize.mall.product.entity.BrandEntity;

import java.util.Map;

/**
 * 品牌
 *
 * @author baize
 * @email baize@gmail.com
 * @date 2023-03-16 09:16:25
 */
public interface BrandService extends IService<BrandEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

