package com.ice.socketio;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.Set;

/**
 * 后台发送的消息格式
 * @author ice
 * @date 18-11-9 下午5:20
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Message {

    /**
     * 业务名称
     */
    private String businessName;

    /**
     * 目标id
     */
    private Set<String> destinations;

    /**
     * 是否为广播
     */
    private boolean broadcast;
    /**
     * 消息内容
     */
    private Object message;

}
