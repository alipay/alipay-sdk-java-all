package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.medical.sms.shorturl.get response.
 * 
 * @author auto create
 * @since 1.0, 2025-07-10 14:47:30
 */
public class AlipayCommerceMedicalSmsShorturlGetResponse extends AlipayResponse {

	private static final long serialVersionUID = 1875957163744391165L;

	/** 
	 * 短链
	 */
	@ApiField("msg_url")
	private String msgUrl;

	public void setMsgUrl(String msgUrl) {
		this.msgUrl = msgUrl;
	}
	public String getMsgUrl( ) {
		return this.msgUrl;
	}

}
