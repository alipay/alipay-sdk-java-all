package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 参数校验为关闭的测试接口
 *
 * @author auto create
 * @since 1.0, 2025-04-16 09:47:29
 */
public class AlipayDataDataserviceSchemaapiseventhRainystestQueryModel extends AlipayObject {

	private static final long serialVersionUID = 5482393497588766284L;

	/**
	 * 测试参数，无需关注
	 */
	@ApiField("demo")
	private String demo;

	/**
	 * 测试
	 */
	@ApiField("demo_price")
	private String demoPrice;

	public String getDemo() {
		return this.demo;
	}
	public void setDemo(String demo) {
		this.demo = demo;
	}

	public String getDemoPrice() {
		return this.demoPrice;
	}
	public void setDemoPrice(String demoPrice) {
		this.demoPrice = demoPrice;
	}

}
