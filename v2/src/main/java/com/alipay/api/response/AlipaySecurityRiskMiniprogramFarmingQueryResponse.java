package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.RiskpluscoreRiskQueryResult;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.security.risk.miniprogram.farming.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-03-01 16:29:15
 */
public class AlipaySecurityRiskMiniprogramFarmingQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1512917281197952146L;

	/** 
	 * risk_result:风险分析结果，类型为列表，包含风险分析结果和描述。分别是 risk_type:marketing_awarding_common; risk_value:(hasRisk,noRisk)/("rank1",...,"rank10"); risk_desc:是否有风险/风险等级; 每一次返回，根据配置的不同，可以返回同样的风险结果类型，也可以返回不同的风险结果类型。
	 */
	@ApiField("risk_result")
	private RiskpluscoreRiskQueryResult riskResult;

	public void setRiskResult(RiskpluscoreRiskQueryResult riskResult) {
		this.riskResult = riskResult;
	}
	public RiskpluscoreRiskQueryResult getRiskResult( ) {
		return this.riskResult;
	}

}
