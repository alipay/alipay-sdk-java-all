package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 渠道商家直接开通会员
 *
 * @author auto create
 * @since 1.0, 2025-07-14 14:57:54
 */
public class AlipayCommerceMedicalExchangeRedirectVerifyModel extends AlipayObject {

	private static final long serialVersionUID = 6695927819789836117L;

	/**
	 * 会员卡权益ID
	 */
	@ApiField("benefit_id")
	private String benefitId;

	/**
	 * 用于同一请求的幂等校验
	 */
	@ApiField("biz_no")
	private String bizNo;

	/**
	 * 电话号码
	 */
	@ApiField("phone")
	private String phone;

	public String getBenefitId() {
		return this.benefitId;
	}
	public void setBenefitId(String benefitId) {
		this.benefitId = benefitId;
	}

	public String getBizNo() {
		return this.bizNo;
	}
	public void setBizNo(String bizNo) {
		this.bizNo = bizNo;
	}

	public String getPhone() {
		return this.phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}

}
