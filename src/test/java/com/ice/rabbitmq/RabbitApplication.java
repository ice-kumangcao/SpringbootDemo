package com.ice.rabbitmq;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author ice
 * @date 18-11-7 下午4:08
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class RabbitApplication {

    @Autowired
    private RabbitMQServer rabbitMQServer;

    @Autowired
    private ApplicationContext context;

    @Test
    public void test() {
        showBeans();
        rabbitMQServer.send("test", "hello");
    }

    /**
     * show springboot中内置beans
     */
    private void showBeans() {
        String[] beanNames = context.getBeanDefinitionNames();

        System.out.println("bean个数：" + beanNames.length);

        for (String beanName : beanNames) {
            // 获取bean的class
            String className = context.getBean(beanName).getClass().toString();
            System.out.println(className);
            // 获取bean的名字
            System.out.println(beanName);
        }
    }
}
