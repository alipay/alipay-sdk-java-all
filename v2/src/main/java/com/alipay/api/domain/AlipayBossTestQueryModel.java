package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 测试预发切换只读
 *
 * @author auto create
 * @since 1.0, 2025-06-26 18:07:30
 */
public class AlipayBossTestQueryModel extends AlipayObject {

	private static final long serialVersionUID = 8283428282723166251L;

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
