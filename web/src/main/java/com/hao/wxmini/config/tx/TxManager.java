package com.hao.wxmini.config.tx;

import org.springframework.aop.framework.autoproxy.BeanNameAutoProxyCreator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.interceptor.TransactionInterceptor;

import java.util.Properties;

/**
 * 事务管理
 *
 * @author hao
 * @create 2018/4/3
 */
@Configuration
public class TxManager {

    @Bean(name = "txInterceptor")
    public TransactionInterceptor transactionInterceptor(
            PlatformTransactionManager platformTransactionManager) {

        Properties transactionAttributes = new Properties();

        // 新增
        transactionAttributes.setProperty("insert*","PROPAGATION_REQUIRED,-Exception");
        transactionAttributes.setProperty("save*","PROPAGATION_REQUIRED,-Exception");
        // 修改
        transactionAttributes.setProperty("update*","PROPAGATION_REQUIRED,-Exception");
        // 删除
        transactionAttributes.setProperty("delete*","PROPAGATION_REQUIRED,-Exception");
        //查询
        transactionAttributes.setProperty("select*","PROPAGATION_REQUIRED,-Exception,readOnly");
        transactionAttributes.setProperty("query*","PROPAGATION_REQUIRED,-Exception,readOnly");
        transactionAttributes.setProperty("search*","PROPAGATION_REQUIRED,-Exception,readOnly");

        // 事物管理器
        TransactionInterceptor transactionInterceptor = new TransactionInterceptor(platformTransactionManager,transactionAttributes);
        /*TransactionInterceptor transactionInterceptor = new TransactionInterceptor();
        transactionInterceptor
                .setTransactionManager(platformTransactionManager);
        transactionInterceptor.setTransactionAttributes(transactionAttributes);*/
        return transactionInterceptor;
    }

    //代理到ServiceImpl的Bean
    @Bean
    public BeanNameAutoProxyCreator transactionAutoProxy() {
        BeanNameAutoProxyCreator transactionAutoProxy = new BeanNameAutoProxyCreator();
        transactionAutoProxy.setProxyTargetClass(true);
        /*transactionAutoProxy.setBeanNames("*ServiceImpl");*/
        transactionAutoProxy.setBeanNames("*Service", "*ServiceImpl");
        transactionAutoProxy.setInterceptorNames("txInterceptor");
        return transactionAutoProxy;
    }




}
