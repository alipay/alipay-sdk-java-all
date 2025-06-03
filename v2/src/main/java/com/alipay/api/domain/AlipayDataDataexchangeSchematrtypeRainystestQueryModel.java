package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 新模型测试tr类接口01
 *
 * @author auto create
 * @since 1.0, 2024-11-27 17:37:20
 */
public class AlipayDataDataexchangeSchematrtypeRainystestQueryModel extends AlipayObject {

	private static final long serialVersionUID = 3581293544451436492L;

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
