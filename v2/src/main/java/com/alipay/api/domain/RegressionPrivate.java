package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 单个私有复杂类型
 *
 * @author auto create
 * @since 1.0, 2023-12-04 17:09:01
 */
public class RegressionPrivate extends AlipayObject {

	private static final long serialVersionUID = 4794449497811198287L;

	/**
	 * 1
	 */
	@ApiField("a")
	private String a;

	/**
	 * 11
	 */
	@ApiField("b")
	private Boolean b;

	/**
	 * sdfs
	 */
	@ApiField("cc")
	private Long cc;

	public String getA() {
		return this.a;
	}
	public void setA(String a) {
		this.a = a;
	}

	public Boolean getB() {
		return this.b;
	}
	public void setB(Boolean b) {
		this.b = b;
	}

	public Long getCc() {
		return this.cc;
	}
	public void setCc(Long cc) {
		this.cc = cc;
	}

}
