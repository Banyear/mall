package com.banyear.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.banyear.common.utils.PageUtils;
import com.banyear.product.entity.BrandEntity;

import java.util.Map;

/**
 * 品牌
 *
 * @author dp
 * @email dengpwork@163.com
 * @date 2023-09-06 23:27:04
 */
public interface BrandService extends IService<BrandEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

