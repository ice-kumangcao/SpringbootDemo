package com.ice.socketio;

import io.socket.client.IO;
import io.socket.client.Socket;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.net.URISyntaxException;

/**
 * netty-socketio 服务端发送消息到前端
 * @author ice
 * @date 18-11-12 下午2:37
 */
@Component
public class SocketConfig {

    public static String serverUrl = "http://localhost:9092";

    @Bean
    public Socket socket() {
        try {
            Socket socket = IO.socket(serverUrl, null);
            socket.connect();
            return socket;
        } catch (URISyntaxException e) {
            e.printStackTrace();
            return null;
        }

    }
}
