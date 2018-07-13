package com.deepexi.util;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

public class StringExpressionUtilTest {

	@Test
	public void stringExec() {
		TestBean bean = new TestBean();
		
		System.out.println(bean);
		
		Map<String,Object> map = new HashMap<>();
		map.put("bean", bean);
		map.put("strfield", "hah");
		map.put("intfield", 11);
		
		
		StringExpressionUtil.exec("bean.setStrfield(strfield)", map);
		StringExpressionUtil.exec("bean.setIntfield(intfield)", map);
		
		System.out.println(bean);
	}
}
