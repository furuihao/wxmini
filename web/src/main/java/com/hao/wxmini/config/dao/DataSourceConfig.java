package com.hao.wxmini.config.dao;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

/**
 * @author hao
 * @create 2018/4/2
 */
@Configuration
public class DataSourceConfig {
    /**
     * 配置数据源
     * @return
     */
    @Bean
    @ConfigurationProperties(prefix = "spring.datasource")
    public DataSource dataSource() {
        return new com.alibaba.druid.pool.DruidDataSource();
    }
}
