package com.baize.mall.product;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author dinner
 * @description
 * @create 2021/7/27
 */
//@EnableDiscoveryClient
@SpringBootApplication
//@EnableFeignClients
public class XinxuanProductApplication {
    public static void main(String[] args) {
        SpringApplication.run(com.baize.mall.product.XinxuanProductApplication.class, args);
    }
}