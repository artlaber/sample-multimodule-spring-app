package com.example.services;

import com.example.core.HelloDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class HelloService {

    @Autowired
    private HelloDao helloDao;

    public String sayHello() {
        return "Hello world! Service " + helloDao.sayHello();
    }
}
