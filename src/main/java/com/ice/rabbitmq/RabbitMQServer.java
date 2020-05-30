package com.ice.rabbitmq;

import com.rabbitmq.client.Channel;

import org.springframework.amqp.rabbit.connection.Connection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author ice
 * @date 18-11-7 下午3:55
 */
//@Component
public class RabbitMQServer {

    @Autowired
    private Connection connection;

    /**
     * 发送message到queueName队列中
     * @param queueName 队列名字
     * @param message   消息内容
     * @return 是否添加成功
     */
    boolean send(String queueName, String message) {
        try {
            Channel channel = connection.createChannel(false);
            // 声明一个队列
            channel.queueDeclare(queueName, true, false, false, null);
            // 发送消息到队列中
            channel.basicPublish("", queueName,
                    null, message.getBytes("UTF-8"));
            System.out.println("Send '" + message + "' to " + queueName);
            channel.close();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
}
