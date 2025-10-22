package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * V1.3新增的
 *
 * @author auto create
 * @since 1.0, 2025-08-18 23:02:31
 */
public class RainyComplexTypeRefWeakSecond extends AlipayObject {

	private static final long serialVersionUID = 2364986685935762245L;

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
