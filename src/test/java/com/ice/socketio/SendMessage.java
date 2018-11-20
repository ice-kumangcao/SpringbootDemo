package com.ice.socketio;

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

    @Autowired
    private Socket socket;

    public boolean send(Message message) {
        try {
            socket.emit("message", message.toJSONObject());
            return true;
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return false;
    }
}
