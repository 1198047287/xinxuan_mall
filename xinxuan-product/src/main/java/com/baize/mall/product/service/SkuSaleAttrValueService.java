package com.baize.mall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.baize.common.utils.PageUtils;
import com.baize.mall.product.entity.SkuSaleAttrValueEntity;

import java.util.Map;

/**
 * sku销售属性&值
 *
 * @author baize
 * @email baize@gmail.com
 * @date 2023-03-16 09:16:29
 */
public interface SkuSaleAttrValueService extends IService<SkuSaleAttrValueEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

