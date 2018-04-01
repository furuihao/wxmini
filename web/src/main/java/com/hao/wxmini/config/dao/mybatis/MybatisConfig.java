package com.hao.wxmini.config.dao.mybatis;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;

import javax.annotation.Resource;
import javax.sql.DataSource;

/**
 * @author hao
 * @create 2018/4/1
 */
@Configuration
@MapperScan("com.hao.wxmini.mapper")
public class MybatisConfig {
    @Value("${mybatis.config-locations}")
    private String mybatisConfigLocation;
    @Value("${mybatis.mapper-locations}")
    private String mybatisMapperLocation;
    @Value("${mybatis.type-aliases-package}")
    private String entityPackage;

    @Resource
    private DataSource dataSource;

    /**
     * 配置sqlSessionFactory
     * @return
     * @throws Exception
     */
    @Bean(name = "mybatisSqlSessionFactory")
    public SqlSessionFactory sqlSessionFactory() throws Exception {
        SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
        //设置mybatis配置文件
        sqlSessionFactoryBean.setConfigLocation(new ClassPathResource(mybatisConfigLocation));
        PathMatchingResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();
        //设置mapper文件路径
        sqlSessionFactoryBean.setMapperLocations(resolver.getResources(mybatisMapperLocation));
        //设置实体类包的路径
        sqlSessionFactoryBean.setTypeAliasesPackage(entityPackage);
        //设置数据源
        sqlSessionFactoryBean.setDataSource(dataSource);
        return sqlSessionFactoryBean.getObject();
    }
}
