package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.RentRiskResult;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.cloud.traas.cloudrisk.rentrisk.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-04-01 15:32:00
 */
public class AlipayCloudTraasCloudriskRentriskQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6677474542589548592L;

	/** 
	 * 风险查询结果
	 */
	@ApiField("risk_result")
	private RentRiskResult riskResult;

	public void setRiskResult(RentRiskResult riskResult) {
		this.riskResult = riskResult;
	}
	public RentRiskResult getRiskResult( ) {
		return this.riskResult;
	}

}
