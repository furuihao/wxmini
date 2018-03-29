package com.hao.wxmini.mapper;

import com.hao.wxmini.domain.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * Created by gcb on 2018/3/29.
 */
@Mapper
@Repository
public interface UserMapper {
    int insert(User user);
    User getById(Long id);
}
