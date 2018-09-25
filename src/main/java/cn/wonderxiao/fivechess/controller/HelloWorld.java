package cn.wonderxiao.fivechess.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {
    Logger logger = LoggerFactory.getLogger(HelloWorld.class);
    @RequestMapping("/")
    public String index() {
        logger.info("hello world");
        return "Hello Docker!";
    }
}
