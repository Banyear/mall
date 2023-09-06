package com.banyear.coupon.dao;

import com.banyear.coupon.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author dp
 * @email dengpwork@163.com
 * @date 2023-09-07 00:03:57
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
