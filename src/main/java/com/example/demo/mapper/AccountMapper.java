package com.example.demo.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.example.demo.vo.Account;

@Mapper
public interface AccountMapper {
	@Insert("insert into acc(username,password)"
			+"values(#{username},#{password})")
	public void add(Account acc);
	
	@Select("select * from acc")
	List<Account> getAll();
	
	@Select("select * from acc where id=#{id}")
	Account getId(int id);
	
	//read
			@Select("select * from acc where "
					+ "username=#{username} and password=#{password}")
			Account queryAccount(String username,String password);
			
			@Select("select * from acc")
			List<Account> query();
			
			@Select("select * from acc where username=#{username}")
			Account queryUsername(String username);
			
			@Select("select * from acc where id=#{id}")
			Account queryId(int id);
	
}
