package com.ice.springaop;

import org.springframework.stereotype.Component;

/**
 * @author ice
 * @date 18-11-6 上午10:00
 */
@Component
public class Chinese implements Person{

    @Timer
    @Override
    public String sayHello(String name) {
        System.out.println("-- sayHello() --");
        return "hello, " + name;
    }

    public void eat(String food) {
        System.out.println("eat: " + food);
    }
}
