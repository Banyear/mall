package com.banyear.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.banyear.common.utils.PageUtils;
import com.banyear.order.entity.RefundInfoEntity;

import java.util.Map;

/**
 * 退款信息
 *
 * @author dp
 * @email dengpwork@163.com
 * @date 2023-09-07 00:18:41
 */
public interface RefundInfoService extends IService<RefundInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

