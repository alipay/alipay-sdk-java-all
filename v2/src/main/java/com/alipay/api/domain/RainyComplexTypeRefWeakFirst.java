package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * V1.3版本引用
 *
 * @author auto create
 * @since 1.0, 2025-08-18 23:02:31
 */
public class RainyComplexTypeRefWeakFirst extends AlipayObject {

	private static final long serialVersionUID = 4239743521594356534L;

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
