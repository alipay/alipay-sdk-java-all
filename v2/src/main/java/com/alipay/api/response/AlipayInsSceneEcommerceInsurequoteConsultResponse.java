package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.InsurePlanDTO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ins.scene.ecommerce.insurequote.consult response.
 * 
 * @author auto create
 * @since 1.0, 2024-09-10 14:47:09
 */
public class AlipayInsSceneEcommerceInsurequoteConsultResponse extends AlipayResponse {

	private static final long serialVersionUID = 4265314374239446582L;

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
