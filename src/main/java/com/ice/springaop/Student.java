package com.ice.springaop;

import org.springframework.stereotype.Component;

/**
 * @author ice
 * @date 18-11-6 上午10:00
 */
@Component
public class Student implements Person{

    @Timer
    @Override
    public void sayHello(String name) {
        System.out.println("-- sayHello() --");
    }

    public void eat(String food) {
        System.out.println("eat: " + food);
    }
}
