package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 架构升级-域内的复杂类型
 *
 * @author auto create
 * @since 1.0, 2026-08-21 14:58:50
 */
public class RainyPraviteTestForUploadComplexInfo extends AlipayObject {

	private static final long serialVersionUID = 6777731734297585391L;

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
