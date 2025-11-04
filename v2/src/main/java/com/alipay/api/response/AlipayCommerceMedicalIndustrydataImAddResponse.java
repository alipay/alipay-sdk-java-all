package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.medical.industrydata.im.add response.
 * 
 * @author auto create
 * @since 1.0, 2025-10-23 17:50:16
 */
public class AlipayCommerceMedicalIndustrydataImAddResponse extends AlipayResponse {

	private static final long serialVersionUID = 4299174622447796425L;

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
