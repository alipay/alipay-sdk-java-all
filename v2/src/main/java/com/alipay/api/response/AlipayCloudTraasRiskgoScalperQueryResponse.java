package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.RiskImagePlusQueryResult;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.cloud.traas.riskgo.scalper.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-06-29 10:46:53
 */
public class AlipayCloudTraasRiskgoScalperQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7556399381153615682L;

	/** 
	 * risk_result:风险分析结果，类型为列表，包含风险分析结果和描述。分别是 risk_type:marketing_awarding_common; risk_value:(hasRisk,noRisk)/("rank1",...,"rank10"); risk_desc:是否有风险/风险等级; 每一次返回，根据配置的不同，可以返回同样的风险结果类型，也可以返回不同的风险结果类型。
	 */
	@ApiField("risk_result")
	private RiskImagePlusQueryResult riskResult;

	public void setRiskResult(RiskImagePlusQueryResult riskResult) {
		this.riskResult = riskResult;
	}
	public RiskImagePlusQueryResult getRiskResult( ) {
		return this.riskResult;
	}

}
