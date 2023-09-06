package com.banyear.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.banyear.common.utils.PageUtils;
import com.banyear.ware.entity.PurchaseEntity;

import java.util.Map;

/**
 * 采购信息
 *
 * @author dp
 * @email dengpwork@163.com
 * @date 2023-09-07 00:22:02
 */
public interface PurchaseService extends IService<PurchaseEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

