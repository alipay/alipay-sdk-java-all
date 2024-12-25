package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * V1.3版本引用
 *
 * @author auto create
 * @since 1.0, 2024-12-03 15:07:22
 */
public class RainyComplexTypeRefWeakFirst extends AlipayObject {

	private static final long serialVersionUID = 8724114826731739959L;

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
