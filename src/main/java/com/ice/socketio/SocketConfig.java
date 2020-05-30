package com.ice.socketio;

import io.socket.client.IO;
import io.socket.client.Socket;
import org.springframework.beans.factory.annotation.Value;
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

    @Value("${socket-server.url:http://localhost:9092}")
    private String serverUrl;

    @Bean
    public Socket socket() {
        try {
            Socket socket = IO.socket(serverUrl);
            socket.connect();
            return socket;
        } catch (URISyntaxException e) {
            e.printStackTrace();
            return null;
        }

    }
}
