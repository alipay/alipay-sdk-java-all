package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.OpenApiCustomerAnalysisResult;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.cloud.cloudpromo.analysiscustomer.tradefunnel.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-09-20 17:42:10
 */
public class AlipayCloudCloudpromoAnalysiscustomerTradefunnelQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2225689835614843175L;

	/** 
	 * {"rows":[{"tapp_trd_user_cnt_visit_rate_xox":-0.1846,"pv_xox_lastValue":165,"spu_cnt_xox":0.0671},{"pv":85,"isv_pid":"","spu_buyer_retention_1m_rate_xox_lastValue":null,"tapp_refund_cnt":40}]}
	 */
	@ApiField("items")
	private OpenApiCustomerAnalysisResult items;

	public void setItems(OpenApiCustomerAnalysisResult items) {
		this.items = items;
	}
	public OpenApiCustomerAnalysisResult getItems( ) {
		return this.items;
	}

}
