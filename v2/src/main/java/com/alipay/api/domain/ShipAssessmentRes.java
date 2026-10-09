package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 发货评估方案
 *
 * @author auto create
 * @since 1.0, 2026-10-09 11:17:52
 */
public class ShipAssessmentRes extends AlipayObject {

	private static final long serialVersionUID = 5147442825816125926L;

	/**
	 * D是商家在租安盾后台创建并获取
	 */
	@ApiField("risk_scheme_id")
	private String riskSchemeId;

	public String getRiskSchemeId() {
		return this.riskSchemeId;
	}
	public void setRiskSchemeId(String riskSchemeId) {
		this.riskSchemeId = riskSchemeId;
	}

}
