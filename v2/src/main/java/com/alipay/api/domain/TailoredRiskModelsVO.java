package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * null
 *
 * @author auto create
 * @since 1.0, 2026-10-09 11:17:52
 */
public class TailoredRiskModelsVO extends AlipayObject {

	private static final long serialVersionUID = 6851949233732326427L;

	/**
	 * 长租定制综合风险等级 (D1-D10)
	 */
	@ApiField("tailored_risk_level")
	private String tailoredRiskLevel;

	public String getTailoredRiskLevel() {
		return this.tailoredRiskLevel;
	}
	public void setTailoredRiskLevel(String tailoredRiskLevel) {
		this.tailoredRiskLevel = tailoredRiskLevel;
	}

}
