package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 线上接口问题复现
 *
 * @author auto create
 * @since 1.0, 2024-12-19 11:20:06
 */
public class AlipayDataDataserviceOnlinetestRainyQueryModel extends AlipayObject {

	private static final long serialVersionUID = 2657979393587589497L;

	/**
	 * a下普通字段a
	 */
	@ApiField("a_test_a")
	private String aTestA;

	/**
	 * 基础参数
	 */
	@ApiField("demo_case")
	private String demoCase;

	public String getaTestA() {
		return this.aTestA;
	}
	public void setaTestA(String aTestA) {
		this.aTestA = aTestA;
	}

	public String getDemoCase() {
		return this.demoCase;
	}
	public void setDemoCase(String demoCase) {
		this.demoCase = demoCase;
	}

}
