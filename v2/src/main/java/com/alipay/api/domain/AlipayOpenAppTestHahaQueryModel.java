package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * HAHA测试ISP
 *
 * @author auto create
 * @since 1.0, 2021-08-16 18:44:31
 */
public class AlipayOpenAppTestHahaQueryModel extends AlipayObject {

	private static final long serialVersionUID = 7696369825398464127L;

	/**
	 * 2088
	 */
	@ApiField("test_one")
	private String testOne;

	/**
	 * 复杂类型
	 */
	@ApiField("test_three")
	private LogisticsAccountStatusDTO testThree;

	/**
	 * 2088000
	 */
	@ApiField("test_two")
	private String testTwo;

	public String getTestOne() {
		return this.testOne;
	}
	public void setTestOne(String testOne) {
		this.testOne = testOne;
	}

	public LogisticsAccountStatusDTO getTestThree() {
		return this.testThree;
	}
	public void setTestThree(LogisticsAccountStatusDTO testThree) {
		this.testThree = testThree;
	}

	public String getTestTwo() {
		return this.testTwo;
	}
	public void setTestTwo(String testTwo) {
		this.testTwo = testTwo;
	}

}
