package com.deepexi.util;


/**
 * 测试bean
 * @author yunzi7758
 *
 */
public class TestBean {

	private String strfield;
	private Integer intfield;
	public String getStrfield() {
		return strfield;
	}
	public void setStrfield(String strfield) {
		this.strfield = strfield;
	}
	public Integer getIntfield() {
		return intfield;
	}
	public void setIntfield(Integer intfield) {
		this.intfield = intfield;
	}
	@Override
	public String toString() {
		return "TestBean [strfield=" + strfield + ", intfield=" + intfield + "]";
	}
	public TestBean(String strfield, Integer intfield) {
		super();
		this.strfield = strfield;
		this.intfield = intfield;
	}
	public TestBean() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
