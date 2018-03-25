package com.hao.wxmini.web;

import com.hao.wxmini.domain.User;
import com.hao.wxmini.repository.UserRepository;
import com.hao.wxmini.serivce.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author hao
 * @create 2018/3/25
 */
@RestController
@RequestMapping("/user")
public class UserController {
    private final UserService userService ;

    @Autowired
    public UserController(UserService userService){
        this.userService = userService;
    }

    @RequestMapping("/save")
    public User save(@RequestParam String name){
        return userService.save(name);
    }
}
