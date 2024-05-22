package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.InsurePlanDTO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ins.scene.ecommerce.insurequote.consult response.
 * 
 * @author auto create
 * @since 1.0, 2024-05-15 14:27:01
 */
public class AlipayInsSceneEcommerceInsurequoteConsultResponse extends AlipayResponse {

	private static final long serialVersionUID = 1354745266866791287L;

	/** 
	 * 投保方案
	 */
	@ApiField("insure_plan")
	private InsurePlanDTO insurePlan;

	public void setInsurePlan(InsurePlanDTO insurePlan) {
		this.insurePlan = insurePlan;
	}
	public InsurePlanDTO getInsurePlan( ) {
		return this.insurePlan;
	}

}
