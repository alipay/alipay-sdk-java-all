package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * tree模型openApi测试接口_260127
 *
 * @author auto create
 * @since 1.0, 2026-03-11 17:52:46
 */
public class AlipayDataDataexchangeTreetestapiRainystestQueryModel extends AlipayObject {

	private static final long serialVersionUID = 8716615821855349761L;

	/**
	 * 支付宝用户的userId。
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
