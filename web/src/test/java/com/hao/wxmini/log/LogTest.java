package com.hao.wxmini.log;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author hao
 * @create 2018/4/21
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class LogTest {
    private Logger logger = LoggerFactory.getLogger(LogTest.class);

    @Test
    public void test() throws Exception {
        logger.info("info log");
    }
}
