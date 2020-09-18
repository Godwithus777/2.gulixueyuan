package com.atguigu.mybatis_plus.mapper;

import com.atguigu.mybatis_plus.entity.Product;
import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import org.springframework.stereotype.Repository;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;
import java.util.Map;

@Repository
public interface ProductMapper extends BaseMapper<Product> {

}