package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 新模型测试tr类接口01
 *
 * @author auto create
 * @since 1.0, 2025-08-18 23:03:02
 */
public class AlipayDataDataexchangeSchematrtypeRainystestQueryModel extends AlipayObject {

	private static final long serialVersionUID = 3585389239826841142L;

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
