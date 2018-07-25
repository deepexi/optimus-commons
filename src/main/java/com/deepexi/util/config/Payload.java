package com.deepexi.util.config;

import org.codehaus.jackson.map.ObjectMapper;

import java.io.IOException;
import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.util.Map;
import java.util.UUID;

/**
 * Created by donh on 2018/6/12.
 */
public class Payload<T> implements Serializable {
    private static final long serialVersionUID = -1549643581827130116L;
    private T payload;
    private String request_id = UUID.randomUUID().toString();
    private JsonFilterConfig mapper;
    private ObjectMapper objectMapper = new ObjectMapper();

    public Payload() {
    }

    public Payload(T payload) {
        this.payload = payload;
    }

    public String getRequest_id() {
        return request_id;
    }

    public void setRequest_id(String request_id) {
        this.request_id = request_id;
    }

    public T getPayload() throws IOException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, NoSuchFieldException {
        JsonFilterConfig var10000 = this.mapper;
        return (T) JsonFilterConfig.filteredWriter(this.payload);
    }

    public void setPayload(T payload) {
        this.payload = payload;
    }

    public String toString() {
        try {
            String json = this.payload != null ? this.objectMapper.writeValueAsString(this) : "{payload=" + null + ",request_id=" + this.request_id + "}";
            return this.payload != null ? (this.objectMapper.readValue(json, Map.class)).toString() : json;
        } catch (IOException var2) {
            var2.printStackTrace();
            return this.getClass().getName() + "@" + Integer.toHexString(this.hashCode());
        }
    }
}