package com.example.core;

import junit.framework.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static junit.framework.TestCase.assertEquals;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:core-spring-config.xml")
public class SpringAppTests {
    @Autowired
    private HelloDao helloDao;

    @Test
    public void testSayHello() {
        assertEquals("Hello world! Dao", helloDao.sayHello());
    }
}
