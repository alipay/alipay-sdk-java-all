package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.RiskpluscoreRiskQueryResult;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.security.risk.miniprogram.nsf.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-06-07 09:56:49
 */
public class AlipaySecurityRiskMiniprogramNsfQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5191167912392473737L;

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
