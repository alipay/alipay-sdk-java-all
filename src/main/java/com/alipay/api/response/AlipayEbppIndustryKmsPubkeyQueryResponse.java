package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.industry.kms.pubkey.query response.
 * 
 * @author auto create
 * @since 1.0, 2019-08-29 16:50:57
 */
public class AlipayEbppIndustryKmsPubkeyQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5356942841845165223L;

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
