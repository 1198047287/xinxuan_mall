package com.baize.mall.coupon.dao;

import com.baize.mall.coupon.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author baize
 * @email baize@gmail.com
 * @date 2023-03-16 09:30:25
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
