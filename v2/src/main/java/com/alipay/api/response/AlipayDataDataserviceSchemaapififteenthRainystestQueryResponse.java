package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.data.dataservice.schemaapififteenth.rainystest.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-03-05 14:57:25
 */
public class AlipayDataDataserviceSchemaapififteenthRainystestQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6346638282948788214L;

	/** 
	 * 测试数据，无需关注
	 */
	@ApiField("demo_res")
	private String demoRes;

	public void setDemoRes(String demoRes) {
		this.demoRes = demoRes;
	}
	public String getDemoRes( ) {
		return this.demoRes;
	}

}
