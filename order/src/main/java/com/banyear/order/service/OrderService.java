package com.banyear.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.banyear.common.utils.PageUtils;
import com.banyear.order.entity.OrderEntity;

import java.util.Map;

/**
 * 订单
 *
 * @author dp
 * @email dengpwork@163.com
 * @date 2023-09-07 00:18:41
 */
public interface OrderService extends IService<OrderEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

