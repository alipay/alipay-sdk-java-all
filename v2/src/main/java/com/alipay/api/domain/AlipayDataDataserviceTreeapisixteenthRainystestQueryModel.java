package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * tree模型测试接口16_经典版_回归验证
 *
 * @author auto create
 * @since 1.0, 2025-04-15 20:17:56
 */
public class AlipayDataDataserviceTreeapisixteenthRainystestQueryModel extends AlipayObject {

	private static final long serialVersionUID = 5317313437787739118L;

	/**
	 * 用于标记支付宝用户在应用下的唯一标识
	 */
	@ApiField("demo")
	private String demo;

	public String getDemo() {
		return this.demo;
	}
	public void setDemo(String demo) {
		this.demo = demo;
	}

}
