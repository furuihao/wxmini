package com.hao.wxmini.serivce.impl;

import com.hao.wxmini.domain.User;
import com.hao.wxmini.mapper.UserMapper;
import com.hao.wxmini.repository.UserRepository;
import com.hao.wxmini.serivce.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author hao
 * @create 2018/3/25
 */
@Service
public class UserServiceImpl implements UserService {
    @Resource
    private UserMapper userMapper;

    @Override
    public int save(User user) throws Exception {
        int num = userMapper.insert(user);
        throw new Exception("保存出错");
        /*return num;*/
    }

    @Override
    public User getById(Long id) throws Exception {
        return userMapper.getById(id);
    }

    @Override
    public List<User> search(){
        return userMapper.search(null);
    }
}
