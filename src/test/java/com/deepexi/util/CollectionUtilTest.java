package com.deepexi.util;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;

public class CollectionUtilTest {

	@Test
	public void empty() {
		System.out.println(CollectionUtil.isEmpty(new HashMap<>()));
		System.out.println(CollectionUtil.isNotEmpty(new HashMap<>()));
	}
	
	@Test
	public void createArrayList() {
		ArrayList<String> list = CollectionUtil.createArrayList(2);
		list.add("aa");
		for (String string : list) {
			System.out.println(string);
		}
		ArrayList<Integer> list2 = CollectionUtil.createArrayList();
		list2.add(1);
	}
	
	@Test
	public void createHashMap() {
		Map<String,Object> map = CollectionUtil.createHashMap();
		HashMap<Object,Object> map2 = CollectionUtil.createHashMap(32);
		HashMap<String,Object> map3 = CollectionUtil.createHashMap(4, 0.5f);
		map3.put("a", 1);
	}
	
	@Test
	public void convertList() {
		List<List<Integer>> list = new ArrayList<>();
		ArrayList<Integer> list2 = new ArrayList<>();
		List<Integer> list3 = new ArrayList<>();
		
		list.add(list3);
		list.add(list2);
		
		list2.add(1);
		list3.add(2);
		
		List<Integer> convertList = CollectionUtil.convertList(list);
		for (Integer integer : convertList) {
			System.out.println(integer);
		}
		
	}
}
