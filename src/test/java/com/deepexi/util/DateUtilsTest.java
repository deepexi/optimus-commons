package com.deepexi.util;

import java.util.Date;

import org.junit.Test;

public class DateUtilsTest {

	@Test
	public void format() {
		System.out.println(DateUtils.format(new Date()));
		System.out.println(DateUtils.format(new Date(), DateUtils.DEFAULT_DATE_TIME_FORMAT));
	}
}
