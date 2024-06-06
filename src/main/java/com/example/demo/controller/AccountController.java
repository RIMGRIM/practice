package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.AccountServiceImpl;
import com.example.demo.vo.Account;

/**
 * 跨域請求設定
 */
@CrossOrigin
@RestController
@RequestMapping("/account")
public class AccountController {
	/**
     * 自動注入 AccountServiceImpl 服務
     */
	@Autowired
    private AccountServiceImpl asi;

    @PostMapping("/add")
    public void add(@RequestBody Account account) {
        asi.addAccount(account);
    }

    @GetMapping("/queryAllAccount")
    public List<Account> getAll() {
        return asi.queryAllAccount();
    }

    @PostMapping("/login")
    public String login(@RequestBody Account loginAccount) {
        System.out.println("Received login request for username: " + loginAccount.getUsername());
        System.out.println("Received login request for password: " + loginAccount.getPassword());
        Account account = asi.login(loginAccount.getUsername(), loginAccount.getPassword());

        if (account != null) {
            return "Login successful";
        } else {
            return "Login failed";
        }
    }
}
