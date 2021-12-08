package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.security.prod.edge.color.query response.
 * 
 * @author auto create
 * @since 1.0, 2021-07-14 10:12:42
 */
public class AlipaySecurityProdEdgeColorQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7893441759762848556L;

	/** 
	 * 服务端解析后的风险等级信息
	 */
	@ApiField("risk_result")
	private String riskResult;

	public void setRiskResult(String riskResult) {
		this.riskResult = riskResult;
	}
	public String getRiskResult( ) {
		return this.riskResult;
	}

}
