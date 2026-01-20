package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.RiskDetectionResultOpenApiDTO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.boss.fnc.gfcreditcontrol.riskdetectionservice.query response.
 * 
 * @author auto create
 * @since 1.0, 2026-01-15 13:52:41
 */
public class AlipayBossFncGfcreditcontrolRiskdetectionserviceQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7323273311287887254L;

	/** 
	 * 风险检测结果
	 */
	@ApiField("result_set")
	private RiskDetectionResultOpenApiDTO resultSet;

	public void setResultSet(RiskDetectionResultOpenApiDTO resultSet) {
		this.resultSet = resultSet;
	}
	public RiskDetectionResultOpenApiDTO getResultSet( ) {
		return this.resultSet;
	}

}
