package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 新模型接口测试13
 *
 * @author auto create
 * @since 1.0, 2025-02-13 17:17:23
 */
public class AlipayDataDataserviceSchemaapithirdteethRainystestQueryModel extends AlipayObject {

	private static final long serialVersionUID = 5281916219237983866L;

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
