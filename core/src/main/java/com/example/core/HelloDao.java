package com.example.core;

import org.springframework.stereotype.Component;

@Component
public class HelloDao {
    public String sayHello() {
        return "Hello world! Dao";
    }
}
