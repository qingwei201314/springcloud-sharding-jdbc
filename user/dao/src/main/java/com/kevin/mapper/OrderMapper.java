package com.kevin.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.kevin.entity.Order;
import java.util.List;

public interface OrderMapper extends BaseMapper<Order> {
    void add(Order order);
    List<Order> queryList();
}
