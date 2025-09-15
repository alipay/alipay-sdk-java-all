package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 请求
 *
 * @author auto create
 * @since 1.0, 2025-08-06 16:18:17
 */
public class TestHq extends AlipayObject {

	private static final long serialVersionUID = 3358896759998671888L;

	/**
	 * 测试同步
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
