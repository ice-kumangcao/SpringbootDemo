package com.ice.springaop;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * SpringAOP两种代理方式的demo
 * JDK动态代理和CGLib动态代理
 * SpringBoot需配置 spring.aop.proxy-target-class:false 才能启动JDK代理
 * 如果代理类实现了接口，则使用JDK代理方式
 * 如果代理类没有实现接口，且不是final 类，则使用CGLib代理
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringAopApplicationTests {

    @Autowired
    private Person person;

    @Autowired
    private Cat cat;

    @Test
    public void contextLoads() {
        person.sayHello("Taylor");
        System.out.println(person.getClass());

        cat.cry();
        System.out.println(cat.getClass());
    }

}
