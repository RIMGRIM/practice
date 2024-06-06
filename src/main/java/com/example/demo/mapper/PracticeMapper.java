package com.example.demo.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.example.demo.vo.Practice;

@Mapper
public interface PracticeMapper {
	@Insert("insert into em(name,address,phone,destination)"
			+"values(#{name},#{address},#{phone},#{destination})")
	public void add(Practice practice);
	
	@Select("select * from em")
	List<Practice> getAll();
	
	@Select("select * from em where id=#{id}")
	Practice getId(int id);
	
}
