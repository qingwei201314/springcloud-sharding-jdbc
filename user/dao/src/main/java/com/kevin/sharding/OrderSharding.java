package com.kevin.sharding;

import org.apache.shardingsphere.api.sharding.complex.ComplexKeysShardingAlgorithm;
import org.apache.shardingsphere.api.sharding.complex.ComplexKeysShardingValue;

import java.util.*;

public class OrderSharding implements ComplexKeysShardingAlgorithm {
    @Override
    public Collection<String> doSharding(Collection collection, ComplexKeysShardingValue complexKeysShardingValue) {
        Map<String, Collection<Long>> map = complexKeysShardingValue.getColumnNameAndShardingValuesMap();
        Set<String> keys =  map.keySet();
        List<Long> orderIds = new ArrayList<>();
        for(String key: keys){
            System.out.println("Key:" + key );
            Iterator<Long> it = map.get(key).iterator();
            while (it.hasNext()){
                Long orderId = it.next();
                orderIds.add(orderId);
                System.out.println(orderId);
            }
        }
        //打印Collection
        List<String> destDatasource = new ArrayList<>();
        Iterator<String> datasources = collection.iterator();
        System.out.println("datasources 如下：");
        while (datasources.hasNext()){
            String ds = datasources.next();
            System.out.println(ds + ",");
            for(Long orderId: orderIds){
                if(orderId >= 1000){
                    if(ds.equals("ds1")){
                        destDatasource.add(ds);
                    }
                } else {
                    Long dsSuffix = orderId % 2;
                    if(ds.endsWith(dsSuffix.toString())){
                        destDatasource.add(ds);
                    }
                }
            }
        }

        for(String resultDS: destDatasource){
            System.out.println("resultDS结果：" + resultDS);
        }
        return destDatasource;
    }
}
