package com.kevin.controller;

import com.kevin.dto.Order;
import com.kevin.mapper.MybatisOrderItemMapper;
import com.kevin.mapper.MybatisOrderMapper;
import com.kevin.service.CommonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class SpringBootController {
//	@Resource
//	private CityMapper cityMapper;
	@Resource
	private MybatisOrderMapper mybatisOrderMapper;
	@Resource
	private MybatisOrderItemMapper mybatisOrderItemMapper;
	@Resource
	private CommonService commonService;
	@Autowired
	private com.kevin.service.OrderService orderService;

	@RequestMapping("/wr")
	public List<Order> wr() {
		List<Order> list = orderService.masterSlave();
		return list;
	}

	@RequestMapping("/r")
	public List<Order> r() {
		List<Order> list =  mybatisOrderMapper.selectAll();
		return list;
	}
}
