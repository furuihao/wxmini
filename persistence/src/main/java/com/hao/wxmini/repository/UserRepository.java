package com.hao.wxmini.repository;

import com.hao.wxmini.domain.User;
import org.springframework.stereotype.Repository;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author hao
 * @create 2018/3/25
 * {@link User}
 */
@Repository
public class UserRepository {
    private final ConcurrentMap<Integer,User> repository = new ConcurrentHashMap<>();
    private final static AtomicInteger idGenerator = new AtomicInteger();

    public boolean save(User user){
        Integer id = idGenerator.get();
        user.setId(id);
        repository.put(id,user);
        System.out.println("save:"+user.getName());
        return true;
    }
}
