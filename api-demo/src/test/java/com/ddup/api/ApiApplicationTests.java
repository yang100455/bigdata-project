package com.ddup.api;

import org.junit.jupiter.api.Test;
import org.junit.platform.commons.logging.Logger;
import org.junit.platform.commons.logging.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ApiApplicationTests {


    Logger logger = LoggerFactory.getLogger(ApiApplicationTests.class);

    @Test
    void contextLoads() {
        logger.info(() -> "123123123123");
    }

}
