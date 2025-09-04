package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.industry.careertraining.usercertificate.save response.
 * 
 * @author auto create
 * @since 1.0, 2025-08-18 14:22:36
 */
public class AlipayEbppIndustryCareertrainingUsercertificateSaveResponse extends AlipayResponse {

	private static final long serialVersionUID = 7565397698457688773L;

	/** 
	 * 编码
	 */
	@ApiField("biz_code")
	private String bizCode;

	public void setBizCode(String bizCode) {
		this.bizCode = bizCode;
	}
	public String getBizCode( ) {
		return this.bizCode;
	}

}
