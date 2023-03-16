package com.baize.mall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.baize.common.utils.PageUtils;
import com.baize.mall.coupon.entity.SeckillSessionEntity;

import java.util.Map;

/**
 * 秒杀活动场次
 *
 * @author baize
 * @email baize@gmail.com
 * @date 2023-03-16 09:30:25
 */
public interface SeckillSessionService extends IService<SeckillSessionEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

