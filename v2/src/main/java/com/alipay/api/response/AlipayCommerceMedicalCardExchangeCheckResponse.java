package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.medical.card.exchange.check response.
 * 
 * @author auto create
 * @since 1.0, 2025-07-10 17:27:32
 */
public class AlipayCommerceMedicalCardExchangeCheckResponse extends AlipayResponse {

	private static final long serialVersionUID = 4434935363468854188L;

	/** 
	 * 该手机号已开通过支付宝健康会员
	 */
	@ApiField("content")
	private String content;

	/** 
	 * 是否使用
	 */
	@ApiField("used")
	private Boolean used;

	public void setContent(String content) {
		this.content = content;
	}
	public String getContent( ) {
		return this.content;
	}

	public void setUsed(Boolean used) {
		this.used = used;
	}
	public Boolean getUsed( ) {
		return this.used;
	}

}
