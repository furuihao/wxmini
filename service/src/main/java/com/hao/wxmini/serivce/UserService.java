package com.hao.wxmini.serivce;

import com.hao.wxmini.domain.User;

/**
 * @author {USER}
 * @create 2018/3/25
 */
public interface UserService {
    /**
     * 新增用户
     * @param name
     * @return
     */
    User save(String name);
}
