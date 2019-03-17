package com.mackittipat;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    private final Logger log = LoggerFactory.getLogger(MainController.class);

    // Env var.
    @Value("${app.name:World}")
    private String name;

    @GetMapping("/")
    public String hello() {
        log.info("Hello " + name);
        return "Hello " + name;
    }
}
