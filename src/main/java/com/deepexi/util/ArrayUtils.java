package com.deepexi.util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayUtils {
	
	public static String toString(Integer[] array){
		StringBuffer sb = new StringBuffer();
		for(Object obj:array){
			sb.append(obj.toString()).append(",");
		}
		return sb.toString();
	}
	
	public static Integer[] toArray(String str){
		String[] tmps = str.split(",");
		Integer[] result = new Integer[tmps.length];
		for(int i=0;i<tmps.length;i++){
			result[i] = Integer.parseInt(tmps[i]);
		}
		return result;
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
    public static boolean isEmpty(Object[] array) {
        if (array == null || array.length == 0) {
            return true;
        }
        return false;
    }
    
    /**
     * 循环实现未知纬度的笛卡尔积
     * @param dimValue  返回组合后的list
     * @return
     */
    public static List<List<String>> descartes(List<List<String>> dimValue) {  
		
        List<List<String>> result = new ArrayList<List<String>>();
		
        int total = 1;  
        for (List<String> list : dimValue) {  
            total *= list.size();  
        }  
        String[] myResult = new String[total];  
  
        int itemLoopNum = 1;  
        int loopPerItem = 1;  
        int now = 1;  
        for (List<String> list : dimValue) {  
            now *= list.size();  
  
            int index = 0;  
            int currentSize = list.size();  
  
            itemLoopNum = total / now;  
            loopPerItem = total / (itemLoopNum * currentSize);  
            int myIndex = 0;  
  
            for (String string : list) {  
                for (int i = 0; i < loopPerItem; i++) {  
                    if (myIndex == list.size()) {  
                        myIndex = 0;  
                    }  
  
                    for (int j = 0; j < itemLoopNum; j++) {  
                        myResult[index] = (myResult[index] == null? "" : myResult[index] + ",") + list.get(myIndex);  
                        index++;  
                    }  
                    myIndex++;  
                }  
  
            }  
        }  
  
        List<String> stringResult = Arrays.asList(myResult);  
        for (String string : stringResult) {  
            String[] stringArray = string.split(",");  
            result.add(Arrays.asList(stringArray));  
        }  
        return result;
    }  
}
