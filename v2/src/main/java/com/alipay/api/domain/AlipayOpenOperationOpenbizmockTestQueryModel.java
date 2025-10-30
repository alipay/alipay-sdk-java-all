package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 测试openpai的openid自动补偿
 *
 * @author auto create
 * @since 1.0, 2024-04-19 16:32:02
 */
public class AlipayOpenOperationOpenbizmockTestQueryModel extends AlipayObject {

	private static final long serialVersionUID = 2493925573628894181L;

	/**
	 * 哈哈
	 */
	@ApiField("fuza")
	private TestDemoWzw fuza;

	/**
	 * 哈哈
	 */
	@ApiField("out_open_id")
	private String outOpenId;

	/**
	 * 哈哈
	 */
	@ApiField("u_test")
	private String uTest;

	public TestDemoWzw getFuza() {
		return this.fuza;
	}
	public void setFuza(TestDemoWzw fuza) {
		this.fuza = fuza;
	}

	public String getOutOpenId() {
		return this.outOpenId;
	}
	public void setOutOpenId(String outOpenId) {
		this.outOpenId = outOpenId;
	}

	public String getuTest() {
		return this.uTest;
	}
	public void setuTest(String uTest) {
		this.uTest = uTest;
	}

}
