package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 测试文档
 *
 * @author auto create
 * @since 1.0, 2025-02-13 16:22:24
 */
public class AlipaySecurityQqqQueryModel extends AlipayObject {

	private static final long serialVersionUID = 5727428639617367695L;

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
