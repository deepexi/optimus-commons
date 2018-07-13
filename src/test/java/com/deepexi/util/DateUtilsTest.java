package com.deepexi.util;

import java.util.Date;

import org.junit.Test;

public class DateUtilsTest {

	@Test
	public void format() {
		System.out.println(DateUtils.format(new Date()));
		System.out.println(DateUtils.format(new Date(), DateUtils.DEFAULT_DATE_TIME_FORMAT));
	}
	
	@Test
	public void parse() {
		System.out.println(DateUtils.parse(DateUtils.format(DateUtils.now())));
		System.out.println(DateUtils.parse(DateUtils.format(DateUtils.now(), DateUtils.DEFAULT_DATE_TIME_FORMAT)));
		System.out.println(DateUtils.parse(DateUtils.format(DateUtils.now(), DateUtils.DEFAULT_DATE_TIME_FORMAT)
				, DateUtils.DEFAULT_DATE_TIME_FORMAT));
	}
	
	@Test
	public void otherMethod() {
		System.out.println(DateUtils.now());
		
		System.out.println(DateUtils.nextYear(DateUtils.now(), 1));
		System.out.println(DateUtils.nextYear(DateUtils.now(), -2));
		
		System.out.println(DateUtils.getDayByInterval(DateUtils.now(), 1));
		System.out.println(DateUtils.getDayByInterval(DateUtils.now(), -3));
		
		System.out.println(DateUtils.getWeekStr(DateUtils.format(new Date())));
		
		
		System.out.println(DateUtils.getCurrenDate());
	}
}
