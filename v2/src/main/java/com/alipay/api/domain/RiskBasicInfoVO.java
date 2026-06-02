package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 风控基础信息
 *
 * @author auto create
 * @since 1.0, 2026-04-23 15:37:45
 */
public class RiskBasicInfoVO extends AlipayObject {

	private static final long serialVersionUID = 7326648187823673211L;

	/**
	 * 风控策略
	 */
	@ApiField("risk_policy_value")
	private String riskPolicyValue;

	/**
	 * 订单风控评估ID
	 */
	@ApiField("risk_scheme_id")
	private String riskSchemeId;

	public String getRiskPolicyValue() {
		return this.riskPolicyValue;
	}
	public void setRiskPolicyValue(String riskPolicyValue) {
		this.riskPolicyValue = riskPolicyValue;
	}

	public String getRiskSchemeId() {
		return this.riskSchemeId;
	}
	public void setRiskSchemeId(String riskSchemeId) {
		this.riskSchemeId = riskSchemeId;
	}

}
