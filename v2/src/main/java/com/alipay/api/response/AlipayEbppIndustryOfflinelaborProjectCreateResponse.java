package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.industry.offlinelabor.project.create response.
 * 
 * @author auto create
 * @since 1.0, 2025-08-29 13:40:00
 */
public class AlipayEbppIndustryOfflinelaborProjectCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 4779239154819211646L;

	/** 
	 * 登记记录跳转地址
	 */
	@ApiField("register_url")
	private String registerUrl;

	public void setRegisterUrl(String registerUrl) {
		this.registerUrl = registerUrl;
	}
	public String getRegisterUrl( ) {
		return this.registerUrl;
	}

}
