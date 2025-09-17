package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * Schema模型的测试接口14
 *
 * @author auto create
 * @since 1.0, 2025-02-13 17:37:23
 */
public class AlipayDataDataserviceSchemaapiforteenthRainystestQueryModel extends AlipayObject {

	private static final long serialVersionUID = 6781968643195379157L;

	/**
	 * 测试数据
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
