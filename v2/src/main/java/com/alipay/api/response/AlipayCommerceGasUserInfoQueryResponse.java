package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.gas.user.info.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-12-03 14:48:32
 */
public class AlipayCommerceGasUserInfoQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1124893269928636951L;

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
