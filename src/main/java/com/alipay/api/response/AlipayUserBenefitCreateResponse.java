package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.user.benefit.create response.
 * 
 * @author auto create
 * @since 1.0, 2021-11-05 15:03:20
 */
public class AlipayUserBenefitCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 3646445794966665742L;

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
