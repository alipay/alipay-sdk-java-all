package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 测试oB迁移
 *
 * @author auto create
 * @since 1.0, 2025-07-03 21:55:45
 */
public class AlipaySecurityTestmysqltoobQueryModel extends AlipayObject {

	private static final long serialVersionUID = 7445928288179445171L;

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
