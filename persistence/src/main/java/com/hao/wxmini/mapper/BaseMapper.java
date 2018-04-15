package com.hao.wxmini.mapper;

import java.util.List;

/**
 * @author {USER}
 * @create 2018/4/14
 */
public interface BaseMapper<T> {
    /**
     * 插入一条数据
     *
     * @param t
     * @return
     */
    int insert(T t);

    /**
     * 更新
     *
     * @param t
     * @return
     */
    int update(T t);

    /**
     * 删除
     *
     * @param t
     * @return
     */
    int delete(T t);

    /**
     * 根据ID删除
     *
     * @param id
     * @return
     */
    int deleteById(Long id);

    /**
     * 根据Id 查找
     *
     * @param id
     * @return
     */
    T getById(Long id);

    /**
     * 搜索
     *
     * @return
     */
    List<T> search(T t);
}
