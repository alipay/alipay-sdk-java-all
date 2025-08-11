package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * XwbTestData
 *
 * @author auto create
 * @since 1.0, 2018-10-26 19:27:40
 */
public class XwbTestData extends AlipayObject {

	private static final long serialVersionUID = 5494493858816535775L;

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
