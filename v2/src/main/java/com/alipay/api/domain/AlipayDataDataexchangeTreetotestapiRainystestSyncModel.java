package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * tree模型的toAnt测试接口260128
 *
 * @author auto create
 * @since 1.0, 2026-01-28 15:57:11
 */
public class AlipayDataDataexchangeTreetotestapiRainystestSyncModel extends AlipayObject {

	private static final long serialVersionUID = 5676636949812275652L;

	/**
	 * 支付宝用户的demo。
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
