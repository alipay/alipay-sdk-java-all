package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * null
 *
 * @author auto create
 * @since 1.0, 2025-01-17 20:07:22
 */
public class RiskItemVO extends AlipayObject {

	private static final long serialVersionUID = 3444647231155681177L;

	/**
	 * 风险编码
	 */
	@ApiField("risk_code")
	private String riskCode;

	/**
	 * 风险等级
	 */
	@ApiField("risk_level")
	private String riskLevel;

	public String getRiskCode() {
		return this.riskCode;
	}
	public void setRiskCode(String riskCode) {
		this.riskCode = riskCode;
	}

	public String getRiskLevel() {
		return this.riskLevel;
	}
	public void setRiskLevel(String riskLevel) {
		this.riskLevel = riskLevel;
	}

}
