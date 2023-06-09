package com.baize.mall.member.controller;

import java.util.Arrays;
import java.util.Map;


import com.baize.mall.member.feign.CouponFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.baize.mall.member.entity.MemberEntity;
import com.baize.mall.member.service.MemberService;
import com.baize.common.utils.PageUtils;
import com.baize.common.utils.R;



/**
 * 会员
 *
 * @author baize
 * @email baize@gmail.com
 * @date 2023-03-16 09:37:21
 */
@RestController
@RequestMapping("member/member")
public class MemberController {
    @Autowired
    private MemberService memberService;
    @Autowired
    CouponFeign couponFeign;
    @RequestMapping("/coupons")
    public R coupons(){
        MemberEntity member = new MemberEntity();
        member.setNickname("baize");
        R r = couponFeign.memeberList();
        return R.ok().put("memeber",member).put("coupons",r.get("coupons"));
    }

    /**
     * 列表
     */
    @RequestMapping("/list")
    ////@RequiresPermissions("member:member:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = memberService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    ////@RequiresPermissions("member:member:info")
    public R info(@PathVariable("id") Long id){
		MemberEntity member = memberService.getById(id);

        return R.ok().put("member", member);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    ////@RequiresPermissions("member:member:save")
    public R save(@RequestBody MemberEntity member){
		memberService.save(member);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    ////@RequiresPermissions("member:member:update")
    public R update(@RequestBody MemberEntity member){
		memberService.updateById(member);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    ////@RequiresPermissions("member:member:delete")
    public R delete(@RequestBody Long[] ids){
		memberService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
