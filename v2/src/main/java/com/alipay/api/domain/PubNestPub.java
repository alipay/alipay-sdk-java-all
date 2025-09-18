package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 公有嵌套其他复杂类型
 *
 * @author auto create
 * @since 1.0, 2024-01-02 13:15:51
 */
public class PubNestPub extends AlipayObject {

	private static final long serialVersionUID = 2214322267488638799L;

	/**
	 * 11
	 */
	@ApiField("comp_indomain")
	private RegressionInDomian compIndomain;

	/**
	 * 11
	 */
	@ApiField("comp_private")
	private RegressionPrivate compPrivate;

	/**
	 * 11
	 */
	@ApiField("complex")
	private RegressionPublic complex;

	public RegressionInDomian getCompIndomain() {
		return this.compIndomain;
	}
	public void setCompIndomain(RegressionInDomian compIndomain) {
		this.compIndomain = compIndomain;
	}

	public RegressionPrivate getCompPrivate() {
		return this.compPrivate;
	}
	public void setCompPrivate(RegressionPrivate compPrivate) {
		this.compPrivate = compPrivate;
	}

	public RegressionPublic getComplex() {
		return this.complex;
	}
	public void setComplex(RegressionPublic complex) {
		this.complex = complex;
	}

}
