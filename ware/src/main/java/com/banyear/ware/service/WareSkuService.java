package com.banyear.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.banyear.common.utils.PageUtils;
import com.banyear.ware.entity.WareSkuEntity;

import java.util.Map;

/**
 * 商品库存
 *
 * @author dp
 * @email dengpwork@163.com
 * @date 2023-09-07 00:22:02
 */
public interface WareSkuService extends IService<WareSkuEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

