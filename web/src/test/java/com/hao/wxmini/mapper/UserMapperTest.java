package com.hao.wxmini.mapper;

import com.hao.wxmini.WxminiApplication;
import com.hao.wxmini.domain.User;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

import java.util.List;

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
    public void insertTest() throws Exception {
        User u = new User();
        u.setName("hao");
        u.setAge(36);
        int num = userMapper.insert(u);
        assertEquals(1, num);
    }

    @Test
    public void updateTest() throws Exception {
        User u = userMapper.getById(1L);
        u.setName("kk");
        u.setAge(38);
        int num = userMapper.update(u);
        assertEquals(1, num);
    }


    @Test
    public void getByIdTest() throws Exception {
        User user = userMapper.getById(1L);
        assertEquals(36, user.getAge().intValue());

    }

    @Test
    public void deleteByIdTest() throws Exception {
        int num = userMapper.deleteById(1L);
        assertEquals(1, num);
    }

    @Test
    public void deleteTest() throws Exception {
        User user = userMapper.getById(2L);
        int num = userMapper.delete(user);
        assertEquals(1, num);
    }

    @Test
    public void searchTest() throws Exception {
        User u = new User();
        u.setName("kk");
      /*  u.setAge(36);*/
        List<User> list = userMapper.search(u);
        assertEquals(1, list.size());
    }
}