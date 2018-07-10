package com.deepexi.util;

public class DebugUtil {
	
	public static DebugUtil getDebugUtil(){
		return new DebugUtil();
	}
	
	private long begin = 0L;
	private long end = 0L;
	public void begin(){
		begin = System.currentTimeMillis();
	}
	
	public void end(String str){
		end = System.currentTimeMillis();
		System.out.println(str+"---->"+(end-begin));
	}
}
