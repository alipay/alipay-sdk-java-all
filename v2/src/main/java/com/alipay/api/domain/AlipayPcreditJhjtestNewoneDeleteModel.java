package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 迭代内测试用接口
 *
 * @author auto create
 * @since 1.0, 2023-12-08 17:39:18
 */
public class AlipayPcreditJhjtestNewoneDeleteModel extends AlipayObject {

	private static final long serialVersionUID = 4688954276676264735L;

	/**
	 * a下普通字段a
	 */
	@ApiField("a_test_a")
	private String aTestA;

	/**
	 * 金额
	 */
	@ApiField("add_openid")
	private String addOpenid;

	/**
	 * 详细地址
	 */
	@ApiField("address")
	private String address;

	/**
	 * 啊阿萨
	 */
	@ApiField("complex")
	private RegressionPublic complex;

	/**
	 * 111
	 */
	@ApiField("complex_a")
	private JhjTestNew complexA;

	/**
	 * 1
	 */
	@ApiField("para_a")
	private String paraA;

	public String getaTestA() {
		return this.aTestA;
	}
	public void setaTestA(String aTestA) {
		this.aTestA = aTestA;
	}

	public String getAddOpenid() {
		return this.addOpenid;
	}
	public void setAddOpenid(String addOpenid) {
		this.addOpenid = addOpenid;
	}

	public String getAddress() {
		return this.address;
	}
	public void setAddress(String address) {
		this.address = address;
	}

	public RegressionPublic getComplex() {
		return this.complex;
	}
	public void setComplex(RegressionPublic complex) {
		this.complex = complex;
	}

	public JhjTestNew getComplexA() {
		return this.complexA;
	}
	public void setComplexA(JhjTestNew complexA) {
		this.complexA = complexA;
	}

	public String getParaA() {
		return this.paraA;
	}
	public void setParaA(String paraA) {
		this.paraA = paraA;
	}

}
