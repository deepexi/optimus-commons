package com.deepexi.util;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class ArrayUtilsTest {

	
	@Test
	public void toString1() {

		Integer[] array = {1,3,34,4};
		String string = ArrayUtils.toString(array);
		System.out.println(string);
	}
	@Test
	public void toString2() {

		Integer[] array = {1,3,34,4};
		String string = ArrayUtils.toString(array,"+");
		System.out.println(string);
	}
	@Test
	public void toArray1() {
		System.out.println(ArrayUtils.toArray("1,3,34,4"));
	}

	@Test
	public void toArray2() {
		System.out.println(ArrayUtils.toArray("1a3a4","a"));
	}
	/**
	 * 检查数组是否为<code>null</code>或空数组<code>[]</code>。
	 * <p/>
	 * 
	 * <pre>
	 * ArrayUtil.isEmpty(null)              = true
	 * ArrayUtil.isEmpty(new int[0])        = true
	 * ArrayUtil.isEmpty(new int[10])       = false
	 * </pre>
	 * 
	 * @param array
	 *            要检查的数组
	 * @return 如果为空, 则返回<code>true</code>
	 */
	@Test
	public  void isEmpty() {
		 Integer[] array = {1,3,34,4};
		 System.out.println(ArrayUtils.isEmpty(array));
	}

	/**
	 * 循环实现未知纬度的笛卡尔积
	 * 
	 * @param dimValue
	 *            返回组合后的list
	 * @return
	 */
	 @Test
	public  void descartes() {

		 List<List<String>> dimValue = new ArrayList<>();
		 
		 List<String> list1 = new ArrayList<>();
		 
		 List<String> list2 = new ArrayList<>();
		 
		 list1.add("a");
		 list1.add("b");
		 
		 list2.add("b");
		 list2.add("c");
		 
		 dimValue.add(list1);
		 dimValue.add(list2);
		 
		 System.out.println(ArrayUtils.descartes(dimValue));
		
	}
}
