package com.baize.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.baize.common.utils.PageUtils;
import com.baize.mall.order.entity.OrderEntity;

import java.util.Map;

/**
 * 订单
 *
 * @author baize
 * @email baize@gmail.com
 * @date 2023-03-16 09:43:55
 */
public interface OrderService extends IService<OrderEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

