package com.ice.springaop;

import org.springframework.stereotype.Component;

/**
 * @author ice
 * @date 18-11-6 下午6:25
 */
@Component
public class Cat {

    @Timer
    public void cry() {
        System.out.println("meow.");
    }
}
