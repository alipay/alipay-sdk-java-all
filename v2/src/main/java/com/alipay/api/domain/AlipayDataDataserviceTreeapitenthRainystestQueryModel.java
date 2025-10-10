package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * tree模型测试接口10
 *
 * @author auto create
 * @since 1.0, 2025-02-27 14:37:55
 */
public class AlipayDataDataserviceTreeapitenthRainystestQueryModel extends AlipayObject {

	private static final long serialVersionUID = 1132731566488719392L;

	/**
	 * 测试数据
	 */
	@ApiField("demo")
	private String demo;

	/**
	 * 测试数据，无需关注
	 */
	@ApiField("demo_boolean")
	private Boolean demoBoolean;

	public String getDemo() {
		return this.demo;
	}
	public void setDemo(String demo) {
		this.demo = demo;
	}

	public Boolean getDemoBoolean() {
		return this.demoBoolean;
	}
	public void setDemoBoolean(Boolean demoBoolean) {
		this.demoBoolean = demoBoolean;
	}

}
