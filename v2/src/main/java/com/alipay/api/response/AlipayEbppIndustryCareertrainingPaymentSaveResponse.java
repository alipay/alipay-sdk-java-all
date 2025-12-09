package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.industry.careertraining.payment.save response.
 * 
 * @author auto create
 * @since 1.0, 2025-10-13 16:32:39
 */
public class AlipayEbppIndustryCareertrainingPaymentSaveResponse extends AlipayResponse {

	private static final long serialVersionUID = 7373421234377664154L;

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
