package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.app.qrcode.create response.
 * 
 * @author auto create
 * @since 1.0, 2021-11-26 17:28:05
 */
public class AlipayOpenAppQrcodeCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 6254385139389162556L;

	/** 
	 * 二维码图片链接地址
	 */
	@ApiField("qr_code_url")
	private String qrCodeUrl;

	public void setQrCodeUrl(String qrCodeUrl) {
		this.qrCodeUrl = qrCodeUrl;
	}
	public String getQrCodeUrl( ) {
		return this.qrCodeUrl;
	}

}
