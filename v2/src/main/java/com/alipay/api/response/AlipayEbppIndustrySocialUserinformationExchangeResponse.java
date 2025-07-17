package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.industry.social.userinformation.exchange response.
 * 
 * @author auto create
 * @since 1.0, 2025-05-15 18:17:27
 */
public class AlipayEbppIndustrySocialUserinformationExchangeResponse extends AlipayResponse {

	private static final long serialVersionUID = 3213746431618911755L;

	/** 
	 * 加密的用户Id。
	 */
	@ApiField("encrypt_id")
	private String encryptId;

	/** 
	 * 解密iv
	 */
	@ApiField("sm_4_iv")
	private String sm4Iv;

	public void setEncryptId(String encryptId) {
		this.encryptId = encryptId;
	}
	public String getEncryptId( ) {
		return this.encryptId;
	}

	public void setSm4Iv(String sm4Iv) {
		this.sm4Iv = sm4Iv;
	}
	public String getSm4Iv( ) {
		return this.sm4Iv;
	}

}
