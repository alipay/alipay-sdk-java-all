package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.security.info.analysis response.
 * 
 * @author auto create
 * @since 1.0, 2021-07-14 10:12:42
 */
public class AlipaySecurityInfoAnalysisResponse extends AlipayResponse {

	private static final long serialVersionUID = 3156652859946626136L;

	/** 
	 * 风险标签
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
