package com.deepexi.util;

import org.junit.Test;

/**
 * id生成工具测试类
 * @author yunzi7758
 *
 */
public class IdGeneratorTest1 {

	@Test
	public void getid() {
		System.out.println(IdGenerator.getObjectId());
		System.out.println(IdGenerator.getUuId());
	}
}
