package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.auth.app.aes.set response.
 * 
 * @author auto create
 * @since 1.0, 2024-08-30 11:16:35
 */
public class AlipayOpenAuthAppAesSetResponse extends AlipayResponse {

	private static final long serialVersionUID = 7336877377949494636L;

	/** 
	 * 商家应用AES KEY密文，需要ISV使用三方应用配置的AES密钥内容进行解密。详情参见 <a href="https://opendocs.alipay.com/isv/grefvl/getaes">应用AES密钥管理</a>。
	 */
	@ApiField("aes_key")
	private String aesKey;

	public void setAesKey(String aesKey) {
		this.aesKey = aesKey;
	}
	public String getAesKey( ) {
		return this.aesKey;
	}

}
