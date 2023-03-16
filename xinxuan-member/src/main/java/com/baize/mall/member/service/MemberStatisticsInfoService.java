package com.baize.mall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.baize.common.utils.PageUtils;
import com.baize.mall.member.entity.MemberStatisticsInfoEntity;

import java.util.Map;

/**
 * 会员统计信息
 *
 * @author baize
 * @email baize@gmail.com
 * @date 2023-03-16 09:37:21
 */
public interface MemberStatisticsInfoService extends IService<MemberStatisticsInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

