package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.app.qrcode.temporary.create response.
 * 
 * @author auto create
 * @since 1.0, 2024-05-28 14:22:47
 */
public class AlipayOpenAppQrcodeTemporaryCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 2514122331144615585L;

	/** 
	 * 动态二维码的支付宝码值
	 */
	@ApiField("qr_code")
	private String qrCode;

	/** 
	 * 动态二维码图片URL
	 */
	@ApiField("qr_code_url")
	private String qrCodeUrl;

	public void setQrCode(String qrCode) {
		this.qrCode = qrCode;
	}
	public String getQrCode( ) {
		return this.qrCode;
	}

	public void setQrCodeUrl(String qrCodeUrl) {
		this.qrCodeUrl = qrCodeUrl;
	}
	public String getQrCodeUrl( ) {
		return this.qrCodeUrl;
	}

}
