package com.kevin.service;

import com.kevin.dto.Order;
import com.kevin.mapper.MybatisOrderMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Service
public class OrderService {
    @Resource
    private MybatisOrderMapper mybatisOrderMapper;

    @Transactional
    public List<Order> masterSlave(){
        Order order = new Order();
        order.setUserId(33);
        order.setStatus("master");
        mybatisOrderMapper.insert(order);

        List<Order> list =  mybatisOrderMapper.selectAll();
        return list;
    }
}
