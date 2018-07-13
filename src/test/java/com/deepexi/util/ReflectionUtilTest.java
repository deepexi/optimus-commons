package com.deepexi.util;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.junit.Test;

/**
 * 反射测试类
 * @author yunzi7758
 *
 */
public class ReflectionUtilTest {

	
	@Test
	public void getAnnotation(){
		Test annotation = ReflectionUtil.getAnnotation(ReflectionUtilTest.class, Test.class);
		System.out.println(annotation);
	}
	
	@Test
	public void getAllInstanceMethods(){
		Method[] allInstanceMethods = ReflectionUtil.getAllInstanceMethods(ReflectionUtilTest.class);
		for (Method method : allInstanceMethods) {
			System.out.println(method);
		}
	}
	
	@Test
	public void getAllConstructorsOfClass(){
		Constructor<?>[] allConstructorsOfClass = ReflectionUtil.getAllConstructorsOfClass(ReflectionUtilTest.class, true);
		for (Constructor<?> constructor : allConstructorsOfClass) {
			System.out.println(constructor);
		}
	}
	
	@Test
	public void newInstance(){
		ReflectionUtilTest reflectionUtilTest = ReflectionUtil.newInstance(ReflectionUtilTest.class);
		System.out.println(reflectionUtilTest);
		TestBean testBean = ReflectionUtil.newInstance(TestBean.class);
		System.out.println(testBean);
	}
	
}
