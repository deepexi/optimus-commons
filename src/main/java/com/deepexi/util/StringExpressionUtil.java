package com.deepexi.util;

import java.util.Map;

import org.apache.commons.jexl2.Expression;
import org.apache.commons.jexl2.JexlContext;
import org.apache.commons.jexl2.JexlEngine;
import org.apache.commons.jexl2.MapContext;

/**
 * java字符串表达式
 * @author yunzi7758
 *
 */
public class StringExpressionUtil {

	
	/**
	 * 执行java字符串表达式
	 * 
	 * @param jexlExp java字符串表达式
	 * @param map 参数
	 * @return
	 */
	public static Object exec(String jexlExp,Map<String,Object> map){  
        JexlEngine jexl=new JexlEngine();  
        Expression e = jexl.createExpression(jexlExp);  
        JexlContext jc = new MapContext();  
        for(String key:map.keySet()){  
            jc.set(key, map.get(key));  
        }  
        if(null==e.evaluate(jc)){  
            return "";  
        }  
        return e.evaluate(jc);  
	}  
}
