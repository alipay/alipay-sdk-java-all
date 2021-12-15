package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.user.newbenefit.create response.
 * 
 * @author auto create
 * @since 1.0, 2020-08-17 21:20:13
 */
public class AlipayUserNewbenefitCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 5251969737841981545L;

	/** 
	 * 权益的ID，可以根据此ID对权益进行操作
	 */
	@ApiField("benefit_id")
	private String benefitId;

	public void setBenefitId(String benefitId) {
		this.benefitId = benefitId;
	}
	public String getBenefitId( ) {
		return this.benefitId;
	}

}
