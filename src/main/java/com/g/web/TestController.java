package com.g.web;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class TestController {
    @Value("${nacos.config.msg}")
    private String message;
    @GetMapping("/test")
    public void get() {
        System.out.println(message);
        System.out.println("test...");
    }
}
