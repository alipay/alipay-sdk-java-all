package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.industry.offlinelabor.project.create response.
 * 
 * @author auto create
 * @since 1.0, 2025-09-17 10:02:39
 */
public class AlipayEbppIndustryOfflinelaborProjectCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 6541111398636716379L;

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
