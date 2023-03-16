package com.baize.mall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.baize.common.utils.PageUtils;
import com.baize.mall.coupon.entity.CouponSpuRelationEntity;

import java.util.Map;

/**
 * 优惠券与产品关联
 *
 * @author baize
 * @email baize@gmail.com
 * @date 2023-03-16 09:30:25
 */
public interface CouponSpuRelationService extends IService<CouponSpuRelationEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

