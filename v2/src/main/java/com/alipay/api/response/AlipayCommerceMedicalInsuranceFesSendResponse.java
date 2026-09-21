package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.medical.insurance.fes.send response.
 * 
 * @author auto create
 * @since 1.0, 2026-09-15 16:42:56
 */
public class AlipayCommerceMedicalInsuranceFesSendResponse extends AlipayResponse {

	private static final long serialVersionUID = 3188221298324259378L;

	/** 
	 * 交易时间
	 */
	@ApiField("enc_content")
	private String encContent;

	public void setEncContent(String encContent) {
		this.encContent = encContent;
	}
	public String getEncContent( ) {
		return this.encContent;
	}

}
