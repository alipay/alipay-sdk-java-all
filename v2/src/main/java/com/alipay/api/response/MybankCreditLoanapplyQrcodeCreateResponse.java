package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: mybank.credit.loanapply.qrcode.create response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-31 03:26:40
 */
public class MybankCreditLoanapplyQrcodeCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 2247539198476721658L;

	/** 
	 * 生成二维码的加密 token 字符串
	 */
	@ApiField("encrypt_token")
	private String encryptToken;

	/** 
	 * 生成的二维码的链接地址，拿这个地址生成二维码
	 */
	@ApiField("url")
	private String url;

	public void setEncryptToken(String encryptToken) {
		this.encryptToken = encryptToken;
	}
	public String getEncryptToken( ) {
		return this.encryptToken;
	}

	public void setUrl(String url) {
		this.url = url;
	}
	public String getUrl( ) {
		return this.url;
	}

}
