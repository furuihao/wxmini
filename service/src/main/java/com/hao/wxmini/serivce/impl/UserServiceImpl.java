package com.hao.wxmini.serivce.impl;

import com.hao.wxmini.domain.User;
import com.hao.wxmini.repository.UserRepository;
import com.hao.wxmini.serivce.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author hao
 * @create 2018/3/25
 */
@Service
public class UserServiceImpl implements UserService {
    @Resource
    private UserRepository userRepository;

    @Override
    public User save(String name) {
        User user = new User();
        user.setName(name);
        userRepository.save(user);
        return user;
    }
}
