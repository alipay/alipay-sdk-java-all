package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: datadigital.fincloud.generalsaas.digitalcredential.vp.query response.
 * 
 * @author auto create
 * @since 1.0, 2026-09-07 17:12:52
 */
public class DatadigitalFincloudGeneralsaasDigitalcredentialVpQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1551963717245278957L;

	/** 
	 * 加密后的VP数据。
	 */
	@ApiField("cipher")
	private String cipher;

	/** 
	 * 客户用于定位解密私钥的密钥别名。
	 */
	@ApiField("key_alias")
	private String keyAlias;

	/** 
	 * 加密后的对称密钥。
	 */
	@ApiField("key_cipher")
	private String keyCipher;

	public void setCipher(String cipher) {
		this.cipher = cipher;
	}
	public String getCipher( ) {
		return this.cipher;
	}

	public void setKeyAlias(String keyAlias) {
		this.keyAlias = keyAlias;
	}
	public String getKeyAlias( ) {
		return this.keyAlias;
	}

	public void setKeyCipher(String keyCipher) {
		this.keyCipher = keyCipher;
	}
	public String getKeyCipher( ) {
		return this.keyCipher;
	}

}
