package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * tree模型测试接口05
 *
 * @author auto create
 * @since 1.0, 2025-03-06 19:56:41
 */
public class AlipayDataDataserviceTreeapififthRainystestQueryModel extends AlipayObject {

	private static final long serialVersionUID = 4816931299521561166L;

	/**
	 * 测试数据，无需关注
	 */
	@ApiField("demo_case")
	private String demoCase;

	public String getDemoCase() {
		return this.demoCase;
	}
	public void setDemoCase(String demoCase) {
		this.demoCase = demoCase;
	}

}
