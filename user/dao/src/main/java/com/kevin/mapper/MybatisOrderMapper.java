package com.kevin.mapper;

import com.kevin.dto.Order;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface MybatisOrderMapper extends CommonRepository<Order> {
}
