package com.banyear.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.banyear.common.utils.PageUtils;
import com.banyear.coupon.entity.HomeAdvEntity;

import java.util.Map;

/**
 * 首页轮播广告
 *
 * @author dp
 * @email dengpwork@163.com
 * @date 2023-09-07 00:03:57
 */
public interface HomeAdvService extends IService<HomeAdvEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

