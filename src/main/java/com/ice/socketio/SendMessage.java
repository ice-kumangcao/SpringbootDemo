package com.ice.socketio;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.socket.client.Socket;
import org.json.JSONException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author ice
 * @date 18-11-12 下午2:44
 */
@Service
public class SendMessage {

    private final Socket socket;

    public SendMessage(Socket socket) {
        this.socket = socket;
    }

    public boolean send(Message message) {
        try {
            socket.emit("message", message);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
}
