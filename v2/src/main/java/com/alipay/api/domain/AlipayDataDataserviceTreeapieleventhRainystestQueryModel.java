package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * tree模型测试接口11
 *
 * @author auto create
 * @since 1.0, 2025-04-15 19:46:58
 */
public class AlipayDataDataserviceTreeapieleventhRainystestQueryModel extends AlipayObject {

	private static final long serialVersionUID = 8535328592424263993L;

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
