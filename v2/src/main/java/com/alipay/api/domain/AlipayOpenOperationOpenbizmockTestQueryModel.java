package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 测试openpai的openid自动补偿
 *
 * @author auto create
 * @since 1.0, 2023-01-09 21:55:20
 */
public class AlipayOpenOperationOpenbizmockTestQueryModel extends AlipayObject {

	private static final long serialVersionUID = 7331465296965855463L;

	/**
	 * test
	 */
	@ApiField("fuza")
	private TestDemoWzw fuza;

	/**
	 * test
	 */
	@ApiField("out_open_id")
	private String outOpenId;

	/**
	 * test
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
