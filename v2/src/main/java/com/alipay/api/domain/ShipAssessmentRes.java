package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 发货评估方案
 *
 * @author auto create
 * @since 1.0, 2026-10-26 09:37:55
 */
public class ShipAssessmentRes extends AlipayObject {

	private static final long serialVersionUID = 7283965651695399915L;

	/**
	 * 在租安盾发货评估后台获取
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
