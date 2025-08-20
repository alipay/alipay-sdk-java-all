package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 新模型测试sdk类接口01
 *
 * @author auto create
 * @since 1.0, 2025-08-18 23:03:02
 */
public class AlipayDataDataexchangeSchemasdktypeRainystestQueryModel extends AlipayObject {

	private static final long serialVersionUID = 6294855524829657698L;

	/**
	 * 测试
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
