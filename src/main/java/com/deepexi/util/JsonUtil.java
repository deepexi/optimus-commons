package com.deepexi.util;

import java.util.Map;
import java.util.TreeMap;

import com.alibaba.fastjson.JSON;

public class JsonUtil {

	/**
     * map转换成对象
	 * @param mapData
	 * @param t
	 * @return
	 */
    public <T> T map2Bean(Map<String, ?> mapData,T t) {
        return (T) JSON.parseObject(JSON.toJSONString(mapData), t.getClass());
    }
    
	/**
     * java对象转map
     * 
     * @param t
     * @return
     */
    public <T> Map<String, String> bean2Map(T t) {
        return JSON.parseObject(t.toString(), TreeMap.class);
    }
    
    /**
     * json 转java对象
     * 
     * @param jsonData
     * @param t
     * @return
     */
    public <T> T json2Bean(String jsonData , T t) {
        return (T) JSON.parseObject(jsonData, t.getClass());
    }
    
    /**
     * json字符串转map
     *
     * @param jsonData
     * @return
     */
    public Map<String, String> json2Map(String jsonData) {
        return JSON.parseObject(jsonData, TreeMap.class);
    }
}
