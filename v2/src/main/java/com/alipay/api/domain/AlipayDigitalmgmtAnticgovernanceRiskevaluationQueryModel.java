package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 蚁树风险咨询接口
 *
 * @author auto create
 * @since 1.0, 2023-08-07 10:40:04
 */
public class AlipayDigitalmgmtAnticgovernanceRiskevaluationQueryModel extends AlipayObject {

	private static final long serialVersionUID = 8224441626886755761L;

	/**
	 * 风险咨询入参对象
	 */
	@ApiField("risk_evaluation_query_request")
	private RiskEvaluationQueryRequest riskEvaluationQueryRequest;

	public RiskEvaluationQueryRequest getRiskEvaluationQueryRequest() {
		return this.riskEvaluationQueryRequest;
	}
	public void setRiskEvaluationQueryRequest(RiskEvaluationQueryRequest riskEvaluationQueryRequest) {
		this.riskEvaluationQueryRequest = riskEvaluationQueryRequest;
	}

}
