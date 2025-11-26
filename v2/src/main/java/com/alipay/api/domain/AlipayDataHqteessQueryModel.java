package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 老模型测试极速版
 *
 * @author auto create
 * @since 1.0, 2025-08-06 16:18:57
 */
public class AlipayDataHqteessQueryModel extends AlipayObject {

	private static final long serialVersionUID = 5814892173469994933L;

	/**
	 * 测试
	 */
	@ApiField("test")
	private TestHq test;

	public TestHq getTest() {
		return this.test;
	}
	public void setTest(TestHq test) {
		this.test = test;
	}

}
