package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 11123213
 *
 * @author auto create
 * @since 1.0, 2025-02-13 11:27:22
 */
public class AlipayOpenCccDedeCancelModel extends AlipayObject {

	private static final long serialVersionUID = 3633484561358633746L;

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
