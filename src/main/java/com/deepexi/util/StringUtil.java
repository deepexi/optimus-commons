package com.deepexi.util;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.Set;


public class StringUtil {

	/**
	 * 将类似id1,id2,id3字符串改成'id1','id2','id3'字符串 即sql内的in子句内容
	 * 
	 * @param str
	 * @return
	 */
	public static String addSQuote(String str) {
		String result = "'";
		if (str.indexOf(",") > 0) {
			String tmp = str.replace(",", "','");
			result = result + tmp + "'";
		} else {
			result = result + str + "'";
		}
		return result;
	}

	public static String setToString(Set<?> set, String split) {
		if (set != null && !set.isEmpty()) {
			return listToString(Collections.list(Collections.enumeration(set)),
					split);
		} else {
			return "";
		}
	}

	/**
	 * List转换String
	 * 
	 * @param list
	 *            :需要转换的List
	 * @return String转换后的字符串
	 */
	public static String listToString(List<?> list, String split) {
		StringBuffer sb = new StringBuffer("");
		if (list != null && list.size() > 0) {
			for (int i = 0; i < list.size(); i++) {
				if (list.get(i) == null || list.get(i) == "") {
					continue;
				}
				// 如果值是list类型则调用自己
				if (list.get(i) instanceof List) {
					sb.append(listToString((List<?>) list.get(i), split));
					sb.append(split);
				} else {
					sb.append(list.get(i));
					sb.append(split);
				}
			}
		}
		return sb.toString();
	}

	/**
	 * 过滤查询条件值，避免sql注入
	 * 
	 * @param str
	 * @return
	 */
	public static String filterQueryValue(String str) {
		return str.replaceAll(".*([';]+|(--)+).*", " ");
	}
	
	public static String parseFromException(Exception e){
		String result = "";
		ByteArrayOutputStream out = new ByteArrayOutputStream();
		PrintStream ps = new PrintStream(out);
		e.printStackTrace(ps);
		result = new String(out.toByteArray());
		return result;
	}
	
	public static String getRandomString(int length) { //length表示生成字符串的长度  
	    String base = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";     
	    Random random = new Random();     
	    StringBuffer sb = new StringBuffer();     
	    for (int i = 0; i < length; i++) {     
	        int number = random.nextInt(base.length());     
	        sb.append(base.charAt(number));     
	    }     
	    return sb.toString();     
	 }     

	public static void main(String[] args) {
		try{
			System.out.println(getRandomString(12));
		}catch(Exception e){
			System.out.println(parseFromException(e));
		}
	}
}
