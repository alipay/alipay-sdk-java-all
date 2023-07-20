package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.user.aliyunbenefit.sync response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-29 21:31:53
 */
public class AlipayUserAliyunbenefitSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 3457772895144987951L;

	/** 
	 * 权益Id
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
