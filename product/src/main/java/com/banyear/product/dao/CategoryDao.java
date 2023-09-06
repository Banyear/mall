package com.banyear.product.dao;

import com.banyear.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author dp
 * @email dengpwork@163.com
 * @date 2023-09-06 23:27:04
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
