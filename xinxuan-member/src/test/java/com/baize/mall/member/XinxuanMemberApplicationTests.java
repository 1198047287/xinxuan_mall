package com.baize.mall.member;

import com.baize.mall.member.service.MemberService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class XinxuanMemberApplicationTests {

    @Autowired
    MemberService memberService;
    @Test
    void contextLoads() {
        memberService.getById(1);
    }

}
