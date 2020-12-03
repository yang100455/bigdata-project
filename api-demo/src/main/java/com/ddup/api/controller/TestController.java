package com.ddup.api.controller;

import com.ddup.api.service.IApiRecordService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.stream.IntStream;

/**
 * @ClassName : TestController
 * @AUTHOR :  Yang XianWei
 * @DATE :    2020/12/2 14:23
 * @DESCRIPTION :
 * @since JDK 1.8
 */
@Controller
public class TestController {
    private static Logger logger = LoggerFactory.getLogger(TestController.class);
    @Autowired
    IApiRecordService service;

    @ResponseBody
    @RequestMapping("/test")
    public String test(@RequestParam(name = "pages", defaultValue = "1") Integer pages) {
        logger.info("pages: {}", pages);

        IntStream.range(0, pages).forEach(idx -> {
            //防止并发写重复读取数据，控制单线程读
            synchronized (this.getClass()) {
                service.writeRemoteToSzLibrary();
            }
        });

        return "success";
    }

}
