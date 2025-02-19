package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 新模型参数校验接口测试03
 *
 * @author auto create
 * @since 1.0, 2025-01-15 14:22:22
 */
public class AlipayDataDataserviceSchemaapithirdRainystestQueryModel extends AlipayObject {

	private static final long serialVersionUID = 1656821987919492937L;

	/**
	 * 基础参数
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
