package com.example.boot.demo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

@RestController
public class HelloWorldController {

    @Value("${server.port}")
    private String port;
    @RequestMapping("/hello")
    public String index() {
        ConcurrentHashMap m =new ConcurrentHashMap();
        AtomicInteger i;
        int i2=2;
        int i3=3;

        AtomicReference<String> a;
        return port;
    }
}
