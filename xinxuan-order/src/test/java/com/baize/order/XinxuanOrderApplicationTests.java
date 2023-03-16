package com.baize.order;

import com.baize.order.service.OrderService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class XinxuanOrderApplicationTests {

    @Autowired
    OrderService orderService;
    @Test
    void contextLoads() {
        orderService.getById(1);
    }

}
