package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 测试to蚂蚁消息
 *
 * @author auto create
 * @since 1.0, 2023-07-19 14:03:03
 */
public class AlipayBossProdDateTestSendModel extends AlipayObject {

	private static final long serialVersionUID = 8422177828294549121L;

	/**
	 * test
	 */
	@ApiField("test_a")
	private String testA;

	public String getTestA() {
		return this.testA;
	}
	public void setTestA(String testA) {
		this.testA = testA;
	}

}
