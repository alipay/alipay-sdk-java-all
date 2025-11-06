package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.industry.careertraining.payment.modify response.
 * 
 * @author auto create
 * @since 1.0, 2025-10-13 16:27:40
 */
public class AlipayEbppIndustryCareertrainingPaymentModifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 5788253354833184671L;

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
