package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.security.risk.customerrisk.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-04-01 14:38:34
 */
public class AlipaySecurityRiskCustomerriskQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4148936216115739642L;

	/** 
	 * risk_result:风险分析结果，主要有三种类型，分别为是否有风险（has_risk,no_risk)，风险等级（"rank_1"...,"rank_10")，归一化的风险评分（0-100），每一次返回，根据配置的不同，可以返回样的风险类型，也可以返回不同的风险结果类型
	 */
	@ApiField("risk_result")
	private String riskResult;

	/** 
	 * risk_result_desc:风险结果的返回值描述，因为每次返回值不一样，因此需要给出返回值说明，避免接入方维护这种对应关系
	 */
	@ApiField("risk_result_desc")
	private String riskResultDesc;

	public void setRiskResult(String riskResult) {
		this.riskResult = riskResult;
	}
	public String getRiskResult( ) {
		return this.riskResult;
	}

	public void setRiskResultDesc(String riskResultDesc) {
		this.riskResultDesc = riskResultDesc;
	}
	public String getRiskResultDesc( ) {
		return this.riskResultDesc;
	}

}
