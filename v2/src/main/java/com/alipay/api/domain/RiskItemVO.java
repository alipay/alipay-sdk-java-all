package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * null
 *
 * @author auto create
 * @since 1.0, 2025-02-27 10:44:36
 */
public class RiskItemVO extends AlipayObject {

	private static final long serialVersionUID = 5186321934812571555L;

	/**
	 * 风险编码
	 */
	@ApiField("risk_code")
	private String riskCode;

	/**
	 * 【订单维度共租风险】low / mid / high；
【小程序维度共租风险】P1 ~ P6；
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
