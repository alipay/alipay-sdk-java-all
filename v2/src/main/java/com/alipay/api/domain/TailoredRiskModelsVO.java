package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * null
 *
 * @author auto create
 * @since 1.0, 2026-07-06 14:24:41
 */
public class TailoredRiskModelsVO extends AlipayObject {

	private static final long serialVersionUID = 3413577672852338811L;

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
