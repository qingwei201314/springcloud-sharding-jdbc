package com.kevin.controller;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.kevin.entity.Order;
import com.kevin.entity.User;
import com.kevin.mapper.OrderMapper;
import com.kevin.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class SpringBootController {
	@Autowired
	private UserMapper userMapper;
	@Autowired
	private OrderMapper orderMapper;

	@RequestMapping("/w")
	public void w(long orderId, int userId){
		Order order = new Order();
		order.setOrderId(orderId);
		order.setUserId(userId);
		order.setStatus("status");
		orderMapper.add(order);
	}

	@RequestMapping("/query")
	public List<Order> query(){
		List<Order> list = orderMapper.queryList();
		return list;
	}

	@RequestMapping("/r")
	public IPage<User> r() {
		IPage<User> page = new Page<>(1, 3);
		IPage<User> userPage = userMapper.selectPageVo(page, 40);
		List<User> userList = userPage.getRecords();
		return page;
	}
}
