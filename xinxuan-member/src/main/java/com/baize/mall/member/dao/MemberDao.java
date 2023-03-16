package com.baize.mall.member.dao;

import com.baize.mall.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author baize
 * @email baize@gmail.com
 * @date 2023-03-16 09:37:21
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
