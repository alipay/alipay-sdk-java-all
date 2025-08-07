package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * Schema模型的测试接口15
 *
 * @author auto create
 * @since 1.0, 2025-03-05 14:57:25
 */
public class AlipayDataDataserviceSchemaapififteenthRainystestQueryModel extends AlipayObject {

	private static final long serialVersionUID = 3782565438199447684L;

	/**
	 * 测试数据，无需关注
	 */
	@ApiField("demo_req")
	private String demoReq;

	public String getDemoReq() {
		return this.demoReq;
	}
	public void setDemoReq(String demoReq) {
		this.demoReq = demoReq;
	}

}
