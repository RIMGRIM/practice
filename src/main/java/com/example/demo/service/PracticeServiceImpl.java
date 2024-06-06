package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.mapper.PracticeMapper;
import com.example.demo.vo.Practice;

@Service
public class PracticeServiceImpl implements PracticeService{
	@Autowired
	private PracticeMapper em;
	@Override
	public void addPractice(Practice practice) {
		em.add(practice);
	}
	
	@Override
	public List<Practice> queryAllPractice() {
		return em.getAll();
	}
	
	@Override
	public Practice queryPracticeById(int id) {
		return em.getId(id);
	}
	
}
