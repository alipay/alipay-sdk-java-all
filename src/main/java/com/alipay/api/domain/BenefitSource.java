package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 权益发放来源
 *
 * @author auto create
 * @since 1.0, 2020-05-28 18:55:14
 */
public class BenefitSource extends AlipayObject {

	private static final long serialVersionUID = 6652495628517696517L;

	/**
	 * 来源类型，比如CAMPAIG
	 */
	@ApiField("benefit_source_type")
	private String benefitSourceType;

	/**
	 * 10000455203
	 */
	@ApiField("benefit_source_value")
	private String benefitSourceValue;

	public String getBenefitSourceType() {
		return this.benefitSourceType;
	}
	public void setBenefitSourceType(String benefitSourceType) {
		this.benefitSourceType = benefitSourceType;
	}

	public String getBenefitSourceValue() {
		return this.benefitSourceValue;
	}
	public void setBenefitSourceValue(String benefitSourceValue) {
		this.benefitSourceValue = benefitSourceValue;
	}

}
