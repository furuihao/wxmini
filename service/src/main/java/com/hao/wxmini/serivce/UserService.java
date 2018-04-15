package com.hao.wxmini.serivce;

import com.hao.wxmini.domain.User;

import java.util.List;

/**
 * @author {USER}
 * @create 2018/3/25
 */
public interface UserService {
    /**
     * 保存用户
     * @param user
     * @return
     */
    int save(User user) throws Exception;

    User getById(Long id) throws Exception;

    /**
     * 搜索
     * @return
     */
    List<User> search();
}
