package com.banyear.member.dao;

import com.banyear.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author dp
 * @email dengpwork@163.com
 * @date 2023-09-07 00:11:36
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
