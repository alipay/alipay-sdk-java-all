package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 11123213
 *
 * @author auto create
 * @since 1.0, 2025-03-19 10:38:52
 */
public class AlipayOpenCccDedeCancelModel extends AlipayObject {

	private static final long serialVersionUID = 6748321562475375479L;

	/**
	 * 测试
	 */
	@ApiField("test")
	private String test;

	public String getTest() {
		return this.test;
	}
	public void setTest(String test) {
		this.test = test;
	}

}
