package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.cloud.app.sec.create response.
 * 
 * @author auto create
 * @since 1.0, 2023-08-20 18:01:45
 */
public class AlipayOpenCloudAppSecCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 1894711163248479122L;

	/** 
	 * 支付宝公钥
	 */
	@ApiField("alipay_public_key")
	private String alipayPublicKey;

	public void setAlipayPublicKey(String alipayPublicKey) {
		this.alipayPublicKey = alipayPublicKey;
	}
	public String getAlipayPublicKey( ) {
		return this.alipayPublicKey;
	}

}
