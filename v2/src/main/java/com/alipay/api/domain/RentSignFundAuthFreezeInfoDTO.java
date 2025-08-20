package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 预授权信息。不传表示当前订单不使用预授权及芝麻免押
 *
 * @author auto create
 * @since 1.0, 2025-07-31 15:35:45
 */
public class RentSignFundAuthFreezeInfoDTO extends AlipayObject {

	private static final long serialVersionUID = 5184615769541727763L;

	/**
	 * 免押风控评估金额，即租押分离能力的押金评估金额。单位：元，精确到小数点后两位
	 */
	@ApiField("risk_assessment_price")
	private String riskAssessmentPrice;

	/**
	 * 风险评估方案ID
	 */
	@ApiField("risk_scheme_id")
	private String riskSchemeId;

	public String getRiskAssessmentPrice() {
		return this.riskAssessmentPrice;
	}
	public void setRiskAssessmentPrice(String riskAssessmentPrice) {
		this.riskAssessmentPrice = riskAssessmentPrice;
	}

	public String getRiskSchemeId() {
		return this.riskSchemeId;
	}
	public void setRiskSchemeId(String riskSchemeId) {
		this.riskSchemeId = riskSchemeId;
	}

}
