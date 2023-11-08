package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.user.benefit.create response.
 * 
 * @author auto create
 * @since 1.0, 2023-08-21 02:15:27
 */
public class AlipayUserBenefitCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 1719867173261112625L;

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
