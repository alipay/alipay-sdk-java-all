package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 活动优惠券信息
 *
 * @author auto create
 * @since 1.0, 2025-04-22 21:56:32
 */
public class CouponInfo extends AlipayObject {

	private static final long serialVersionUID = 7426217356843131167L;

	/**
	 * 权益id
	 */
	@ApiField("benefit_id")
	private String benefitId;

	/**
	 * 权益类型
	 */
	@ApiField("benefit_type")
	private String benefitType;

	public String getBenefitId() {
		return this.benefitId;
	}
	public void setBenefitId(String benefitId) {
		this.benefitId = benefitId;
	}

	public String getBenefitType() {
		return this.benefitType;
	}
	public void setBenefitType(String benefitType) {
		this.benefitType = benefitType;
	}

}
