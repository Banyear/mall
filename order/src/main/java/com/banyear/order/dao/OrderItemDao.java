package com.banyear.order.dao;

import com.banyear.order.entity.OrderItemEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单项信息
 * 
 * @author dp
 * @email dengpwork@163.com
 * @date 2023-09-07 00:18:41
 */
@Mapper
public interface OrderItemDao extends BaseMapper<OrderItemEntity> {
	
}
