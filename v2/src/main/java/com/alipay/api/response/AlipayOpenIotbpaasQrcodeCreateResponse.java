package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.iotbpaas.qrcode.create response.
 * 
 * @author auto create
 * @since 1.0, 2023-03-13 04:45:48
 */
public class AlipayOpenIotbpaasQrcodeCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 3192529471831594946L;

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
