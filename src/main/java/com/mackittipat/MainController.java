package com.mackittipat;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    private final Logger log = LoggerFactory.getLogger(MainController.class);

    @RequestMapping(value = {"/", "/hello"})
    public String hello() {
        log.info("Received a request to /");
        return "Hello";
    }
}