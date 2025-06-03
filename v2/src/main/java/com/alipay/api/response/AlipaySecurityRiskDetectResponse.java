package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.security.risk.detect response.
 * 
 * @author auto create
 * @since 1.0, 2025-04-27 14:51:07
 */
public class AlipaySecurityRiskDetectResponse extends AlipayResponse {

	private static final long serialVersionUID = 3531758224931748721L;

	/** 
	 * 结果码
	 */
	@ApiField("risk_code")
	private String riskCode;

	/** 
	 * 风险等级
	 */
	@ApiField("risk_level")
	private Long riskLevel;

	public void setRiskCode(String riskCode) {
		this.riskCode = riskCode;
	}
	public String getRiskCode( ) {
		return this.riskCode;
	}

	public void setRiskLevel(Long riskLevel) {
		this.riskLevel = riskLevel;
	}
	public Long getRiskLevel( ) {
		return this.riskLevel;
	}

}
