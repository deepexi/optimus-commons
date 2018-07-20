package com.deepexi.util;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

/**
 * 字符串表达式执行工具测试类
 * @author yunzi7758
 *
 */
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
	
	@Test
	public void stringInvokeclazz() {
		Object invoke = StringExpressionUtil.invoke(StringUtil.class, "toUpperCaseFirstOne", "adfd");
		System.out.println(invoke);
		Object invoke2 = StringExpressionUtil.invoke(TestBean.class, "getIntfield");
		System.out.println(invoke2+"==");
	}
	@Test
	public void stringInvokeobj() {
		
		TestBean testBean = new TestBean("aaa", 22);
		
		Object invoke = StringExpressionUtil.invoke(testBean, "getIntfield");
		System.out.println(invoke);
		
	}
}
