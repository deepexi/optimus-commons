package com.deepexi.util;

import org.junit.Test;

/**
 * base64测试类
 * @author yunzi7758
 *
 */
public class Base64Test {

	@Test
	public void encodeString() {
		String encodeString = Base64.encodeString("1234145452");
		System.out.println(encodeString);
	}
	
	@Test
	public void decodeString() {
		
		String decodeString = Base64.decodeString(Base64.encodeString("143244324335"));
		System.out.println(decodeString);
	}
}
