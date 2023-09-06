package com.banyear.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.banyear.common.utils.PageUtils;
import com.banyear.member.entity.MemberReceiveAddressEntity;

import java.util.Map;

/**
 * 会员收货地址
 *
 * @author dp
 * @email dengpwork@163.com
 * @date 2023-09-07 00:11:36
 */
public interface MemberReceiveAddressService extends IService<MemberReceiveAddressEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

