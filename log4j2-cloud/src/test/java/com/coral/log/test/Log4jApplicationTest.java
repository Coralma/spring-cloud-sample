package com.coral.log.test;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import com.coral.log.Application;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = Application.class)
public class Log4jApplicationTest {

    static final Logger logger = LogManager.getLogger(Log4jApplicationTest.class);

    @Test
    public void test() throws Exception {
        logger.info("输出info");
        logger.debug("输出debug");
        logger.error("输出error");
    }

}