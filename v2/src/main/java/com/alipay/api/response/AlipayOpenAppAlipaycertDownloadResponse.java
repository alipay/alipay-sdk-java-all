package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.app.alipaycert.download response.
 * 
 * @author auto create
 * @since 1.0, 2023-08-21 05:25:21
 */
public class AlipayOpenAppAlipaycertDownloadResponse extends AlipayResponse {

	private static final long serialVersionUID = 8899138549532177271L;

	/** 
	 * 公钥证书Base64后的字符串
	 */
	@ApiField("alipay_cert_content")
	private String alipayCertContent;

	public void setAlipayCertContent(String alipayCertContent) {
		this.alipayCertContent = alipayCertContent;
	}
	public String getAlipayCertContent( ) {
		return this.alipayCertContent;
	}

}
