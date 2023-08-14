package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.eco.cityservice.industry.energy.check response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-30 22:17:00
 */
public class AlipayEcoCityserviceIndustryEnergyCheckResponse extends AlipayResponse {

	private static final long serialVersionUID = 8584152414642191377L;

	/** 
	 * 返回场景下的额度检查结果，有额度limited=false，无额度limited=true
	 */
	@ApiField("limited")
	private Boolean limited;

	public void setLimited(Boolean limited) {
		this.limited = limited;
	}
	public Boolean getLimited( ) {
		return this.limited;
	}

}
