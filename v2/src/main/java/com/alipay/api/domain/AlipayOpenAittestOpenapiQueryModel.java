package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * AIT集成测试OPENAPI
 *
 * @author auto create
 * @since 1.0, 2023-10-09 20:06:29
 */
public class AlipayOpenAittestOpenapiQueryModel extends AlipayObject {

	private static final long serialVersionUID = 5124256491756437897L;

	/**
	 * AIT测试demo
	 */
	@ApiField("ait_test_demo")
	private String aitTestDemo;

	/**
	 * AIT测试demo
	 */
	@ApiField("ait_test_field")
	private String aitTestField;

	/**
	 * AIT测试demo
	 */
	@ApiField("ait_test_value")
	private String aitTestValue;

	public String getAitTestDemo() {
		return this.aitTestDemo;
	}
	public void setAitTestDemo(String aitTestDemo) {
		this.aitTestDemo = aitTestDemo;
	}

	public String getAitTestField() {
		return this.aitTestField;
	}
	public void setAitTestField(String aitTestField) {
		this.aitTestField = aitTestField;
	}

	public String getAitTestValue() {
		return this.aitTestValue;
	}
	public void setAitTestValue(String aitTestValue) {
		this.aitTestValue = aitTestValue;
	}

}
