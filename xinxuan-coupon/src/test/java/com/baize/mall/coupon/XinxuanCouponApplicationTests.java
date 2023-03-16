package com.baize.mall.coupon;

import com.baize.mall.coupon.service.HomeAdvService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class XinxuanCouponApplicationTests {

    @Autowired
    HomeAdvService homeAdvService;

    @Test
    void contextLoads() {
        homeAdvService.getById(1);
    }

}
