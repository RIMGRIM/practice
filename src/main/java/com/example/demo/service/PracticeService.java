package com.example.demo.service;

import java.util.List;

import com.example.demo.vo.Practice;

public interface PracticeService {
	void addPractice (Practice practice);
	List<Practice> queryAllPractice();
	Practice queryPracticeById(int id);
}
