package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.medical.payment.preconsult response.
 * 
 * @author auto create
 * @since 1.0, 2024-09-24 10:20:42
 */
public class AlipayCommerceMedicalPaymentPreconsultResponse extends AlipayResponse {

	private static final long serialVersionUID = 7625441812582314535L;

	/** 
	 * 建议的推进策略；商家可参考建议推进业务动作
	 */
	@ApiField("suggestion")
	private String suggestion;

	public void setSuggestion(String suggestion) {
		this.suggestion = suggestion;
	}
	public String getSuggestion( ) {
		return this.suggestion;
	}

}
