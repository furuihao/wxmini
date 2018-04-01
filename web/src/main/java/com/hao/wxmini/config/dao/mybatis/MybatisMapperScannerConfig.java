package com.hao.wxmini.config.dao.mybatis;

import org.mybatis.spring.annotation.MapperScan;
import org.mybatis.spring.mapper.MapperScannerConfigurer;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.AutoConfigureAfter;
import org.springframework.context.annotation.Configuration;

/**
 * 配置扫描mapper包
 * @author hao
 * @create 2018/4/2
 */

@Configuration
//TODO 注意，由于MapperScannerConfigurer执行的比较早，所以必须有下面的注解
@AutoConfigureAfter(MybatisConfig.class)
public class MybatisMapperScannerConfig {
    @Value("${mybatis.mapper-locations}")
    private String mybatisMapperLocation;

    public MapperScannerConfigurer mapperScannerConfigurer(){
        MapperScannerConfigurer mapperScannerConfigurer = new MapperScannerConfigurer();
        mapperScannerConfigurer.setSqlSessionFactoryBeanName("mybatisSqlSessionFactory");
        mapperScannerConfigurer.setBasePackage(mybatisMapperLocation);
        return mapperScannerConfigurer;
    }
}