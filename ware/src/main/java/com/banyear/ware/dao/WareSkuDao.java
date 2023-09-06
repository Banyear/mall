package com.banyear.ware.dao;

import com.banyear.ware.entity.WareSkuEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品库存
 * 
 * @author dp
 * @email dengpwork@163.com
 * @date 2023-09-07 00:22:02
 */
@Mapper
public interface WareSkuDao extends BaseMapper<WareSkuEntity> {
	
}
