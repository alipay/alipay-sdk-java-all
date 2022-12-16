package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.user.aliyunbenefit.sync response.
 * 
 * @author auto create
 * @since 1.0, 2022-12-08 11:14:55
 */
public class AlipayUserAliyunbenefitSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 5181886382929891363L;

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
