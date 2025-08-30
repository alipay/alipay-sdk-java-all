package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.pay.app.transport.cardinfo.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-08-13 14:52:40
 */
public class AlipayPayAppTransportCardinfoQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6284742194641837987L;

	/** 
	 * 卡信息密文
	 */
	@ApiField("card_data_cipher")
	private String cardDataCipher;

	public void setCardDataCipher(String cardDataCipher) {
		this.cardDataCipher = cardDataCipher;
	}
	public String getCardDataCipher( ) {
		return this.cardDataCipher;
	}

}
