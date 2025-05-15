package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.medical.industrydata.im.add response.
 * 
 * @author auto create
 * @since 1.0, 2025-01-06 14:57:24
 */
public class AlipayCommerceMedicalIndustrydataImAddResponse extends AlipayResponse {

	private static final long serialVersionUID = 6495211834179514884L;

	/** 
	 * 支付宝im会话chatId
	 */
	@ApiField("alipay_chat_id")
	private String alipayChatId;

	public void setAlipayChatId(String alipayChatId) {
		this.alipayChatId = alipayChatId;
	}
	public String getAlipayChatId( ) {
		return this.alipayChatId;
	}

}
