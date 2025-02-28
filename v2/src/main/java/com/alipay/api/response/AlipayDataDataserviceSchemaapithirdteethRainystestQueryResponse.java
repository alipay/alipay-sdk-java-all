package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.data.dataservice.schemaapithirdteeth.rainystest.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-02-13 17:17:23
 */
public class AlipayDataDataserviceSchemaapithirdteethRainystestQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1645647592656395316L;

	/** 
	 * 测试数据，无需关注
	 */
	@ApiField("demo_response")
	private String demoResponse;

	public void setDemoResponse(String demoResponse) {
		this.demoResponse = demoResponse;
	}
	public String getDemoResponse( ) {
		return this.demoResponse;
	}

}
