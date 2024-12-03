package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 强引用复杂类型
 *
 * @author auto create
 * @since 1.0, 2024-12-02 15:56:10
 */
public class RainyComplexTypesTheSecond extends AlipayObject {

	private static final long serialVersionUID = 6627441995987239549L;

	/**
	 * boolean
	 */
	@ApiField("test_a")
	private Boolean testA;

	/**
	 * String
	 */
	@ApiField("test_b")
	private String testB;

	public Boolean getTestA() {
		return this.testA;
	}
	public void setTestA(Boolean testA) {
		this.testA = testA;
	}

	public String getTestB() {
		return this.testB;
	}
	public void setTestB(String testB) {
		this.testB = testB;
	}

}
