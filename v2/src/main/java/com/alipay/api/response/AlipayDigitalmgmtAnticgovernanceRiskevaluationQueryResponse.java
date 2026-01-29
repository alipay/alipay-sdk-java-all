package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.RiskEvaluationResult;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.digitalmgmt.anticgovernance.riskevaluation.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-08-22 19:36:43
 */
public class AlipayDigitalmgmtAnticgovernanceRiskevaluationQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4892128987132751391L;

	/** 
	 * 业务风险结果
	 */
	@ApiField("risk_evaluation_result")
	private RiskEvaluationResult riskEvaluationResult;

	public void setRiskEvaluationResult(RiskEvaluationResult riskEvaluationResult) {
		this.riskEvaluationResult = riskEvaluationResult;
	}
	public RiskEvaluationResult getRiskEvaluationResult( ) {
		return this.riskEvaluationResult;
	}

}
