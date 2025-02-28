package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 参数校验为关闭的测试接口
 *
 * @author auto create
 * @since 1.0, 2025-01-22 14:57:24
 */
public class AlipayDataDataserviceSchemaapiseventhRainystestQueryModel extends AlipayObject {

	private static final long serialVersionUID = 7716634218821466419L;

	/**
	 * 测试参数，无需关注
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
