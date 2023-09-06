package com.banyear.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.banyear.common.utils.PageUtils;
import com.banyear.ware.entity.PurchaseDetailEntity;

import java.util.Map;

/**
 * 
 *
 * @author dp
 * @email dengpwork@163.com
 * @date 2023-09-07 00:22:02
 */
public interface PurchaseDetailService extends IService<PurchaseDetailEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

