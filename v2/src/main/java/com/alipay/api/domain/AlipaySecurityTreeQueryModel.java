package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 老模型测试极速版
 *
 * @author auto create
 * @since 1.0, 2026-06-08 16:29:51
 */
public class AlipaySecurityTreeQueryModel extends AlipayObject {

	private static final long serialVersionUID = 8176183962419354764L;

	/**
	 * 测试3
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
