package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.mapper.AccountMapper;
import com.example.demo.vo.Account;

@Service
public class AccountServiceImpl implements AccountService {
    @Autowired
    private AccountMapper acc;

    @Override
    public void addAccount(Account account) {
        acc.add(account);
    }

    @Override
    public Account login(String username, String password) {
        return acc.queryAccount(username, password);
    }

    @Override
    public boolean userNamerRepeat(String username) {
        Account m = acc.queryUsername(username);
        return m != null;
    }

    @Override
    public List<Account> queryAllAccount() {
        return acc.getAll();
    }

    @Override
    public Account queryAccountById(int id) {
        return acc.getId(id);
    }
}
