package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 测试12212
 *
 * @author auto create
 * @since 1.0, 2022-12-14 14:30:42
 */
public class AlipayPcreditUserOpencoremodeltestXinghuiModifyModel extends AlipayObject {

	private static final long serialVersionUID = 3841579221952252895L;

	/**
	 * 12
	 */
	@ApiField("a")
	private String a;

	/**
	 * 12
	 */
	@ApiField("b")
	private String b;

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

}
