package com.example.main;

import com.example.core.HelloDao;
import com.example.services.HelloService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloApp {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("main-spring.xml");
        HelloService helloService = context.getBean(HelloService.class);
        HelloDao helloDao = context.getBean(HelloDao.class);

        System.out.println(helloService.sayHello());
        System.out.println(helloDao.sayHello());
    }
}
