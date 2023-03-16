package com.baize.mall.member;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients(basePackages = "com.baize.mall.member.feign")
@SpringBootApplication
public class XinxuanMemberApplication {

    public static void main(String[] args) {
        SpringApplication.run(XinxuanMemberApplication.class, args);
    }

}
