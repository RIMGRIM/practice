package com.example.demo.service;

import java.util.List;

import com.example.demo.vo.Account;

public interface AccountService {
	Account login(String username,String password);
	boolean userNamerRepeat(String username);
	void addAccount (Account account);
	List<Account> queryAllAccount();
	Account queryAccountById(int id);
}
