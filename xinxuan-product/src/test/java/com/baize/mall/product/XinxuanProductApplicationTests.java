package com.baize.mall.product;

import com.baize.mall.product.service.BrandService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;



@SpringBootTest
class XinxuanProductApplicationTests {
    @Autowired
    BrandService brandService;

    @Test
    public void test(){
        brandService.getById(1);
    }
}
