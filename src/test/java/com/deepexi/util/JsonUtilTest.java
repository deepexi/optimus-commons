package com.deepexi.util;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

public class JsonUtilTest {

	@Test
	public void map2bean() {
		HashMap<String,Object> hashMap = new HashMap<>();
		
		hashMap.put("strfield", "strfield");
		hashMap.put("intfield", 1);
		
		TestBean bean = new TestBean();
		
		System.out.println(bean);
		
		bean = JsonUtil.map2Bean(hashMap, bean);
		
		System.out.println(bean);
	}
	@Test
	public void bean2map() {
		
		TestBean bean = new TestBean("123", 123);
		
		Map<String, String> map = JsonUtil.bean2Map(bean);
		
		System.out.println(map);
	}
	
	@Test
	public void bean2JsonString() {
		
		TestBean bean = new TestBean("123", 123);
		
		String jsonString = JsonUtil.bean2JsonString(bean);
		
		System.out.println(jsonString);
	}
	
	@Test
	public void json2Bean() {
		
		TestBean bean = new TestBean("123", 123);
		
		String jsonString = JsonUtil.bean2JsonString(bean);
		
		TestBean testBean = new TestBean();
		testBean = JsonUtil.json2Bean(jsonString, testBean);
		
		System.out.println(testBean);
	}
	
	@Test
	public void json2Map() {
		
		TestBean bean = new TestBean("123", 123);
		
		String jsonString = JsonUtil.bean2JsonString(bean);
		
		Map<String, String> json2Map = JsonUtil.json2Map(jsonString);
		
		System.out.println(json2Map);
	}
	
}
