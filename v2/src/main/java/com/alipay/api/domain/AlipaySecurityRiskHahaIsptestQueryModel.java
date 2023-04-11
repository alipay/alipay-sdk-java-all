package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * ISP场景验证
 *
 * @author auto create
 * @since 1.0, 2021-11-03 20:02:40
 */
public class AlipaySecurityRiskHahaIsptestQueryModel extends AlipayObject {

	private static final long serialVersionUID = 2221541847294449673L;

	/**
	 * 简单复杂类型
	 */
	@ApiField("test_five")
	private InsurancePeriod testFive;

	/**
	 * 高级复杂类型
	 */
	@ApiField("test_four")
	private RecomProduct testFour;

	/**
	 * 2088
	 */
	@ApiField("test_one")
	private String testOne;

	/**
	 * 入参3
	 */
	@ApiListField("test_three")
	@ApiField("string")
	private List<String> testThree;

	/**
	 * 123456
	 */
	@ApiField("test_two")
	private String testTwo;

	public InsurancePeriod getTestFive() {
		return this.testFive;
	}
	public void setTestFive(InsurancePeriod testFive) {
		this.testFive = testFive;
	}

	public RecomProduct getTestFour() {
		return this.testFour;
	}
	public void setTestFour(RecomProduct testFour) {
		this.testFour = testFour;
	}

	public String getTestOne() {
		return this.testOne;
	}
	public void setTestOne(String testOne) {
		this.testOne = testOne;
	}

	public List<String> getTestThree() {
		return this.testThree;
	}
	public void setTestThree(List<String> testThree) {
		this.testThree = testThree;
	}

	public String getTestTwo() {
		return this.testTwo;
	}
	public void setTestTwo(String testTwo) {
		this.testTwo = testTwo;
	}

}
