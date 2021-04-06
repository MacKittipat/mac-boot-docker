package com.mackittipat;

import com.amazonaws.regions.Regions;
import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.AmazonS3ClientBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

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

    @GetMapping("/greeting")
    public String greeting() {
        log.info("Greeting");
        return "Greeting";
    }

    @PostMapping("/hi")
    public String hi() {
        log.info("Hi");
        return "Hi";
    }

    @GetMapping("/upload")
    public String upload() {
        log.info("Uploading ...");
        String uuid = UUID.randomUUID().toString();
        AmazonS3 s3 = AmazonS3ClientBuilder.standard().withRegion(Regions.AP_SOUTHEAST_1).build();
        s3.putObject("mac-file-bucket", uuid, uuid);
        return "OK. Upload success";
    }
}
