package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 新模型创建测试001
 *
 * @author auto create
 * @since 1.0, 2025-02-13 17:27:23
 */
public class AlipayDataAiserviceSchemacreattestRainystestQueryModel extends AlipayObject {

	private static final long serialVersionUID = 2587611847465443672L;

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
