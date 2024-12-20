package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: mybank.payment.trade.qrcode.create response.
 * 
 * @author auto create
 * @since 1.0, 2023-08-23 21:31:44
 */
public class MybankPaymentTradeQrcodeCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 6496898189238658242L;

	/** 
	 * 加密的token
	 */
	@ApiField("encrypt_token")
	private String encryptToken;

	/** 
	 * url地址
	 */
	@ApiField("url")
	private String url;

	public void setEncryptToken(String encryptToken) {
		this.encryptToken = encryptToken;
	}
	public String getEncryptToken( ) {
		return this.encryptToken;
	}

	public void setUrl(String url) {
		this.url = url;
	}
	public String getUrl( ) {
		return this.url;
	}

}
