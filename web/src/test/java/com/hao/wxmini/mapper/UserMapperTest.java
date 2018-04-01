package com.hao.wxmini.mapper;

import com.hao.wxmini.WxminiApplication;
import com.hao.wxmini.domain.User;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

import static org.junit.Assert.*;

/**
 * Created by gcb on 2018/3/29.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class UserMapperTest {
    @Resource
    private UserMapper userMapper;

    @Test
    public void insert() throws Exception {
        User u = new User();
        u.setName("hao");
        u.setAge(36);
        int num = userMapper.insert(u);
        Assert.assertEquals(1,num);
    }

    @Test
    public void getById() throws Exception {

    }

}