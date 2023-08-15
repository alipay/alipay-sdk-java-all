package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.iotbpaas.qrcode.create response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-29 23:26:32
 */
public class AlipayOpenIotbpaasQrcodeCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 2687365186733612252L;

	/** 
	 * 二维码图片url，存储在内部oss平台
	 */
	@ApiField("url")
	private String url;

	public void setUrl(String url) {
		this.url = url;
	}
	public String getUrl( ) {
		return this.url;
	}

}
