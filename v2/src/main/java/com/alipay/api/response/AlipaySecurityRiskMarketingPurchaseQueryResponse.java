package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.RiskpluscoreRiskQueryResult;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.security.risk.marketing.purchase.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-08-13 14:27:41
 */
public class AlipaySecurityRiskMarketingPurchaseQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3352362973381663517L;

	/** 
	 * risk_result:风险分析结果，类型为列表，包含风险分析结果和描述。分别是 risk_type:marketing_awarding_common; risk_value:(hasRisk,noRisk)/("rank1",...,"rank10"); risk_desc:是否有风险/风险等级; 每一次返回，根据配置的不同，可以返回同样的风险结果类型，也可以返回不同的风险结果类型。
	 */
	@ApiListField("risk_result")
	@ApiField("riskpluscore_risk_query_result")
	private List<RiskpluscoreRiskQueryResult> riskResult;

	public void setRiskResult(List<RiskpluscoreRiskQueryResult> riskResult) {
		this.riskResult = riskResult;
	}
	public List<RiskpluscoreRiskQueryResult> getRiskResult( ) {
		return this.riskResult;
	}

}
