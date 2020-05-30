package com.ice.rabbitmq;

import org.springframework.amqp.rabbit.connection.Connection;
import org.springframework.amqp.rabbit.connection.ConnectionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

/**
 * @author ice
 * @date 18-11-8 上午9:48
 */
//@Component
public class RabbitConfig {

    @Autowired
    ConnectionFactory connectionFactory;

    @Bean
    public Connection connection() {
        return connectionFactory.createConnection();
    }
}
