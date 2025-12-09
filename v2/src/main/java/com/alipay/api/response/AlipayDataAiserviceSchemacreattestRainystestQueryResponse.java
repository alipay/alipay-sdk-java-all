package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.data.aiservice.schemacreattest.rainystest.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-02-13 17:27:23
 */
public class AlipayDataAiserviceSchemacreattestRainystestQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7818157884736628462L;

	/** 
	 * 测试数据
	 */
	@ApiField("demo_case_res")
	private String demoCaseRes;

	public void setDemoCaseRes(String demoCaseRes) {
		this.demoCaseRes = demoCaseRes;
	}
	public String getDemoCaseRes( ) {
		return this.demoCaseRes;
	}

}
