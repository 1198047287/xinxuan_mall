package com.baize.mall.member.feign;

import com.baize.common.utils.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient("xinxuan-coupon")
public interface CouponFeign {

    @RequestMapping("/coupon/coupon/memeber/list")
    public R memeberList();

}
