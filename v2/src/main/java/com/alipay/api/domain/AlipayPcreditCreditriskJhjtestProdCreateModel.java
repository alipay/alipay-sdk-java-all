package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 线上回归openapi
 *
 * @author auto create
 * @since 1.0, 2024-04-11 14:50:32
 */
public class AlipayPcreditCreditriskJhjtestProdCreateModel extends AlipayObject {

	private static final long serialVersionUID = 8323419867799812694L;

	/**
	 * 1
	 */
	@ApiField("a_openid")
	private String aOpenid;

	/**
	 * 1
	 */
	@ApiField("b_openid")
	private String bOpenid;

	/**
	 * 1111
	 */
	@ApiField("complex")
	private PublicTestProd complex;

	/**
	 * 1
	 */
	@ApiField("test_a")
	private String testA;

	/**
	 * 11111 当前字段已废弃(1111)
	 */
	@ApiField("test_b")
	@Deprecated
	private String testB;

	public String getaOpenid() {
		return this.aOpenid;
	}
	public void setaOpenid(String aOpenid) {
		this.aOpenid = aOpenid;
	}

	public String getbOpenid() {
		return this.bOpenid;
	}
	public void setbOpenid(String bOpenid) {
		this.bOpenid = bOpenid;
	}

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

	public String getTestB() {
		return this.testB;
	}
	public void setTestB(String testB) {
		this.testB = testB;
	}

}
