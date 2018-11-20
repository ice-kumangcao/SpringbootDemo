package com.ice.socketio;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.Set;

/**
 * 后台发送的消息格式
 * @author ice
 * @date 18-11-9 下午5:20
 */
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

    public Message() {}

    public Message(String businessName, Set<String> destinations,
                   boolean broadcast, Object message) {
        this.businessName = businessName;
        this.destinations = destinations;
        this.broadcast = broadcast;
        this.message = message;
    }

    public String getBusinessName() {
        return businessName;
    }

    public void setBusinessName(String businessName) {
        this.businessName = businessName;
    }

    public Set<String> getDestinations() {
        return destinations;
    }

    public void setDestinations(Set<String> destinations) {
        this.destinations = destinations;
    }

    public Object getMessage() {
        return message;
    }

    public void setMessage(Object message) {
        this.message = message;
    }

    public Boolean getBroadcast() {
        return broadcast;
    }

    public void setBroadcast(Boolean broadcast) {
        this.broadcast = broadcast;
    }

    public JSONObject toJSONObject() throws JSONException {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("businessName", this.businessName);
        jsonObject.put("destionations", this.destinations);
        jsonObject.put("message", this.message);
        jsonObject.put("broadcast", this.broadcast);
        return jsonObject;
    }
}
