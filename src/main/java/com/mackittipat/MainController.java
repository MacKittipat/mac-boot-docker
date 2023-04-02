package com.mackittipat;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    private final Logger log = LoggerFactory.getLogger(MainController.class);

    // Env var.
    @Value("${app.name:World}")
    private String name;

    @GetMapping("/")
    public String index() {
        log.info("Hello " + name);
        return "Hello " + name;
    }

    @GetMapping("/hello")
    public String hello() {
        log.info("Hello");
        return "Hello";
    }

    @GetMapping("/api/mac")
    public String apiMac() {
        log.info("API Mac");
        return "API Mac";
    }

    @GetMapping("/api/mac/java")
    public String apiMacJava() {
        log.info("API Mac Java");
        return "API Mac Java";
    }

}
