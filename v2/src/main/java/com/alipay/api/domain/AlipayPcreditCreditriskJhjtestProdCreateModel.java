package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 线上回归openapi
 *
 * @author auto create
 * @since 1.0, 2024-01-02 14:37:51
 */
public class AlipayPcreditCreditriskJhjtestProdCreateModel extends AlipayObject {

	private static final long serialVersionUID = 7255358785555424241L;

	/**
	 * 1
	 */
	@ApiField("complex")
	private PublicTestProd complex;

	/**
	 * 1
	 */
	@ApiField("test_a")
	private String testA;

	public PublicTestProd getComplex() {
		return this.complex;
	}
	public void setComplex(PublicTestProd complex) {
		this.complex = complex;
	}

	public String getTestA() {
		return this.testA;
	}
	public void setTestA(String testA) {
		this.testA = testA;
	}

}
