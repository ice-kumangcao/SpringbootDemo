package com.ice.springaop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * @author ice
 * @date 18-11-6 上午10:04
 */
@Aspect
@Component
public class AdviceTest {

    @Pointcut("@annotation(com.ice.springaop.Timer)")
    public void pointcut() {}

    @Before("pointcut()")
    public void before() {
        System.out.println("before");
    }
}
