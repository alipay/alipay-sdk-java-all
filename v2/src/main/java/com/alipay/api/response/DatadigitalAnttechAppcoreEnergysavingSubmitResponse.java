package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: datadigital.anttech.appcore.energysaving.submit response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-22 14:22:05
 */
public class DatadigitalAnttechAppcoreEnergysavingSubmitResponse extends AlipayResponse {

	private static final long serialVersionUID = 5718335833964582342L;

	/** 
	 * 节能申请信息，节能申请的相关信息给到用户，如用户的申请后的实际节能信息，不是成功或失败
	 */
	@ApiField("energy_saving_apply")
	private String energySavingApply;

	public void setEnergySavingApply(String energySavingApply) {
		this.energySavingApply = energySavingApply;
	}
	public String getEnergySavingApply( ) {
		return this.energySavingApply;
	}

}
