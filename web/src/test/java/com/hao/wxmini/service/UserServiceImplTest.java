package com.hao.wxmini.service;

import com.hao.wxmini.domain.User;
import com.hao.wxmini.serivce.UserService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserServiceImplTest {
    @Resource
    private UserService userService;

    @Test
    public void save() throws Exception {
        User u = new User();
        u.setName("hao");
        u.setAge(36);
        int num = userService.save(u);
        Assert.assertEquals(1, num);
    }

    @Test
    public void search() throws  Exception{
        Assert.assertEquals(20, userService.search().size());
    }

}