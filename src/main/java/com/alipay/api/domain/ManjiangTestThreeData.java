package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 用于测试三层的复杂结构
 *
 * @author auto create
 * @since 1.0, 2022-09-17 21:46:45
 */
public class ManjiangTestThreeData extends AlipayObject {

	private static final long serialVersionUID = 6273189887771474864L;

	/**
	 * 2
	 */
	@ApiField("test_complex")
	private ManjiangTestLevelTwoData testComplex;

	/**
	 * 3
	 */
	@ApiField("test_level_three")
	private String testLevelThree;

	public ManjiangTestLevelTwoData getTestComplex() {
		return this.testComplex;
	}
	public void setTestComplex(ManjiangTestLevelTwoData testComplex) {
		this.testComplex = testComplex;
	}

	public String getTestLevelThree() {
		return this.testLevelThree;
	}
	public void setTestLevelThree(String testLevelThree) {
		this.testLevelThree = testLevelThree;
	}

}
