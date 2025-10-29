package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 权益基本信息
 *
 * @author auto create
 * @since 1.0, 2025-01-16 14:16:05
 */
public class BenefitInterestInfoResponse extends AlipayObject {

	private static final long serialVersionUID = 2611917967648446778L;

	/**
	 * 权益描述
	 */
	@ApiField("benefit_description")
	private String benefitDescription;

	/**
	 * 权益类型
	 */
	@ApiField("benefit_type")
	private String benefitType;

	/**
	 * 权益值，单位取决于类型，包含百分比等。
	 */
	@ApiField("benefit_value")
	private String benefitValue;

	public String getBenefitDescription() {
		return this.benefitDescription;
	}
	public void setBenefitDescription(String benefitDescription) {
		this.benefitDescription = benefitDescription;
	}

	public String getBenefitType() {
		return this.benefitType;
	}
	public void setBenefitType(String benefitType) {
		this.benefitType = benefitType;
	}

	public String getBenefitValue() {
		return this.benefitValue;
	}
	public void setBenefitValue(String benefitValue) {
		this.benefitValue = benefitValue;
	}

}
