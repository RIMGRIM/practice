package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.PracticeServiceImpl;
import com.example.demo.vo.Practice;

@CrossOrigin
@RestController
@RequestMapping("/practice")
public class PracticeController {
	@Autowired
	private PracticeServiceImpl esi;
	
	@PostMapping("/add")
	public void add(@RequestBody Practice practice)
	{
		esi.addPractice(practice);
	}
	
	@GetMapping("/queryAllPractice")
	public List<Practice> getAll()
	{
		return esi.queryAllPractice();
	}
}
