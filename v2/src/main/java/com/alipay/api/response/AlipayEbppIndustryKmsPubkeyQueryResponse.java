package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.industry.kms.pubkey.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-30 23:18:03
 */
public class AlipayEbppIndustryKmsPubkeyQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1168997535835466695L;

	/** 
	 * 使用调用方公钥加密过的用户公钥
	 */
	@ApiField("user_encrypt_pubkey")
	private String userEncryptPubkey;

	public void setUserEncryptPubkey(String userEncryptPubkey) {
		this.userEncryptPubkey = userEncryptPubkey;
	}
	public String getUserEncryptPubkey( ) {
		return this.userEncryptPubkey;
	}

}
