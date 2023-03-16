package com.baize.mall.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.baize.common.utils.PageUtils;
import com.baize.mall.ware.entity.PurchaseEntity;

import java.util.Map;

/**
 * 采购信息
 *
 * @author baize
 * @email baize@gmail.com
 * @date 2023-03-16 09:48:30
 */
public interface PurchaseService extends IService<PurchaseEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

