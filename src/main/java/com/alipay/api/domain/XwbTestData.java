package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * XwbTestData
 *
 * @author auto create
 * @since 1.0, 2018-08-06 15:21:00
 */
public class XwbTestData extends AlipayObject {

	private static final long serialVersionUID = 8228663613757174884L;

	/**
	 * 1
	 */
	@ApiField("s")
	private String s;

	public String getS() {
		return this.s;
	}
	public void setS(String s) {
		this.s = s;
	}

}
