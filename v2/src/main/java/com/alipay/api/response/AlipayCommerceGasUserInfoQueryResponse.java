package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.gas.user.info.query response.
 * 
 * @author auto create
 * @since 1.0, 2026-09-18 13:32:31
 */
public class AlipayCommerceGasUserInfoQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2581376437187174951L;

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
