package com.ice.socketio;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.HashSet;
import java.util.Set;

/**
 * @author ice
 * @date 18-11-12 下午2:48
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class SocketIoTest {

    @Autowired
    private SendMessage sendMessage;

    @Test
    public void test() {
        Set<String> dests = new HashSet<String>();
        dests.add("zhangsan");

        Message message = new Message();
        message.setMessage("hello");
        message.setBusinessName("warning");
        message.setBroadcast(true);
        message.setDestinations(dests);


        System.out.println(sendMessage.send(message));
    }
}
