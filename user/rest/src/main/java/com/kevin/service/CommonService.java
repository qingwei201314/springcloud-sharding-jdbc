package com.kevin.service;

import com.kevin.dto.Order;
import com.kevin.dto.OrderItem;
import com.kevin.mapper.MybatisOrderItemMapper;
import com.kevin.mapper.MybatisOrderMapper;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@Service
public  class CommonService{
    @Resource
    private MybatisOrderMapper mybatisOrderMapper;
    @Resource
    private MybatisOrderItemMapper mybatisOrderItemMapper;

    public void initEnvironment() {
//        getOrderRepository().createTableIfNotExists();
//        getOrderItemRepository().createTableIfNotExists();
//        getOrderRepository().truncateTable();
//        getOrderItemRepository().truncateTable();
    }
    
    public void cleanEnvironment() {
//        getOrderItemRepository().dropTable();
//        getOrderItemRepository().dropTable();
    }
    
    public void processSuccess() {
        System.out.println("-------------- Process Success Begin ---------------");
//        List<Long> orderIds = insertData();
        printData();
//        deleteData(orderIds);
//        printData();
        System.out.println("-------------- Process Success Finish --------------");
    }
    
    public void processFailure() {
        System.out.println("-------------- Process Failure Begin ---------------");
        insertData();
        System.out.println("-------------- Process Failure Finish --------------");
        throw new RuntimeException("Exception occur for transaction test.");
    }
    
    private List<Long> insertData() {
        System.out.println("---------------------------- Insert Data ----------------------------");
        List<Long> result = new ArrayList<>(10);
        for (int i = 1; i <= 10; i++) {
            Order order = new Order();
            order.setUserId(i);
            order.setStatus("INSERT_TEST");
            mybatisOrderMapper.insert(order);

            OrderItem item = new OrderItem();
            item.setOrderId(order.getOrderId());
            item.setUserId(i);
            item.setStatus("INSERT_TEST");
            mybatisOrderItemMapper.insert(item);
            result.add(order.getOrderId());
        }
        return result;
    }
    
    private void deleteData(final List<Long> orderIds) {
        System.out.println("---------------------------- Delete Data ----------------------------");
        for (Long each : orderIds) {
            mybatisOrderMapper.delete(each);
            mybatisOrderItemMapper.delete(each);
        }
    }
    
    public void printData() {
        System.out.println("---------------------------- Print Order Data -----------------------");
        System.out.println(mybatisOrderMapper.selectAll());
        System.out.println("---------------------------- Print OrderItem Data -------------------");
//        System.out.println(mybatisOrderItemMapper.selectAll());
    }

}
