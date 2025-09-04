package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.industry.careertraining.payment.modify response.
 * 
 * @author auto create
 * @since 1.0, 2025-08-18 14:17:36
 */
public class AlipayEbppIndustryCareertrainingPaymentModifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 5294759785187854996L;

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
