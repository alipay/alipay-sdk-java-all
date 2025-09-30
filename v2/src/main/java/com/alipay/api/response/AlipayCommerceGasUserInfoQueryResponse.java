package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.gas.user.info.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-07-01 16:02:29
 */
public class AlipayCommerceGasUserInfoQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5873987138424282963L;

	/** 
	 * 加密后数据，具体数据格式与支付宝小二对接
	 */
	@ApiField("encrypted_data")
	private String encryptedData;

	public void setEncryptedData(String encryptedData) {
		this.encryptedData = encryptedData;
	}
	public String getEncryptedData( ) {
		return this.encryptedData;
	}

}
