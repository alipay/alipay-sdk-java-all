package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 支付宝内券活动权益
 *
 * @author auto create
 * @since 1.0, 2021-10-11 11:03:01
 */
public class ActivityBenefit extends AlipayObject {

	private static final long serialVersionUID = 2324647613918343915L;

	/**
	 * 整体以{"key":[value1, value2]}的结构传参，通过K-V的形式传递，需要与开发人员指定规则code。
	 */
	@ApiField("benefit_rule")
	private String benefitRule;

	/**
	 * 为支付宝内券的活动id（activityId）
	 */
	@ApiField("out_benefit_id")
	private String outBenefitId;

	/**
	 * 权益的优先级，需要指定在1-20之间，优先级的值越小，权益展示越靠前
	 */
	@ApiField("priority")
	private Long priority;

	public String getBenefitRule() {
		return this.benefitRule;
	}
	public void setBenefitRule(String benefitRule) {
		this.benefitRule = benefitRule;
	}

	public String getOutBenefitId() {
		return this.outBenefitId;
	}
	public void setOutBenefitId(String outBenefitId) {
		this.outBenefitId = outBenefitId;
	}

	public Long getPriority() {
		return this.priority;
	}
	public void setPriority(Long priority) {
		this.priority = priority;
	}

}
