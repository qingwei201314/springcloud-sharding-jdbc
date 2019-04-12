package com.kevin.mapper;

import com.kevin.dto.City;
import com.kevin.mapper.common.CommonMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface CityMapper extends CommonMapper<City> {

	City selectCity(@Param("id") Integer id);

}
