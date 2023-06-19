package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 臻晨测试专用，他人勿动
 *
 * @author auto create
 * @since 1.0, 2023-06-15 15:36:06
 */
public class AlipayOpenOperationOpenbizmockTestdcQueryModel extends AlipayObject {

	private static final long serialVersionUID = 8534511988214444417L;

	/**
	 * 详细地址
	 */
	@ApiField("a")
	private String a;

	/**
	 * 1
	 */
	@ApiField("b")
	private String b;

	/**
	 * 1
	 */
	@ApiField("c")
	private String c;

	/**
	 * 1
	 */
	@ApiField("d")
	private String d;

	public String getA() {
		return this.a;
	}
	public void setA(String a) {
		this.a = a;
	}

	public String getB() {
		return this.b;
	}
	public void setB(String b) {
		this.b = b;
	}

	public String getC() {
		return this.c;
	}
	public void setC(String c) {
		this.c = c;
	}

	public String getD() {
		return this.d;
	}
	public void setD(String d) {
		this.d = d;
	}

}
