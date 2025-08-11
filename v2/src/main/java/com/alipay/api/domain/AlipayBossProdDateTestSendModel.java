package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 测试to蚂蚁消息
 *
 * @author auto create
 * @since 1.0, 2024-07-19 10:21:51
 */
public class AlipayBossProdDateTestSendModel extends AlipayObject {

	private static final long serialVersionUID = 1614997859453336811L;

	/**
	 * test
	 */
	@ApiField("a_open_id")
	private String aOpenId;

	/**
	 * test
	 */
	@ApiField("b_open_id")
	private String bOpenId;

	/**
	 * test修改文档
	 */
	@ApiField("test_a")
	private String testA;

	/**
	 * test
	 */
	@ApiField("test_b")
	private String testB;

	public String getaOpenId() {
		return this.aOpenId;
	}
	public void setaOpenId(String aOpenId) {
		this.aOpenId = aOpenId;
	}

	public String getbOpenId() {
		return this.bOpenId;
	}
	public void setbOpenId(String bOpenId) {
		this.bOpenId = bOpenId;
	}

	public String getTestA() {
		return this.testA;
	}
	public void setTestA(String testA) {
		this.testA = testA;
	}

	public String getTestB() {
		return this.testB;
	}
	public void setTestB(String testB) {
		this.testB = testB;
	}

}
