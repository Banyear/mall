package com.banyear.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.banyear.common.utils.PageUtils;
import com.banyear.product.entity.SkuImagesEntity;

import java.util.Map;

/**
 * sku图片
 *
 * @author dp
 * @email dengpwork@163.com
 * @date 2023-09-06 23:27:04
 */
public interface SkuImagesService extends IService<SkuImagesEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

