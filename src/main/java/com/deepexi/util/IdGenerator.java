package com.deepexi.util;

import java.util.UUID;

/** 
 * id生成器
 */
public class IdGenerator {

	/**
	 * 获取getObjectId
	 * @return
	 */
	public static String getObjectId() {
		return ObjectId.get().toHexString();
	}
	
	/**
	 * 获取getUuId
	 * @return
	 */
	public static String getUuId() {
		return UUID.randomUUID().toString().replace("-", "");
	}
	
	public static void main(String[] args) {
		System.out.println(IdGenerator.getObjectId());
		System.out.println(IdGenerator.getUuId());
	}
	
}
