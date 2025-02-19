package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * tree模型测试接口10
 *
 * @author auto create
 * @since 1.0, 2025-02-13 16:43:01
 */
public class AlipayDataDataserviceTreeapitenthRainystestQueryModel extends AlipayObject {

	private static final long serialVersionUID = 4184551115436719218L;

	/**
	 * 测试数据
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
