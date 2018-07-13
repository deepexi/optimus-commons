package com.deepexi.util;

import org.junit.Test;

public class IdGeneratorTest1 {

	@Test
	public void getid() {
		System.out.println(IdGenerator.getObjectId());
		System.out.println(IdGenerator.getUuId());
	}
}
