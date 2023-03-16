package com.baize.mall.ware;

import com.baize.mall.ware.service.WareInfoService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class XinxuanWareApplicationTests {

    @Autowired
    WareInfoService wareInfoService;

    @Test
    void contextLoads() {
        wareInfoService.getById(1);
    }

}
