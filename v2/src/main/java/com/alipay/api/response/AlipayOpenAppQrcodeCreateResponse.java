package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.app.qrcode.create response.
 * 
 * @author auto create
 * @since 1.0, 2023-04-03 13:03:59
 */
public class AlipayOpenAppQrcodeCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 3467584657628343485L;

	/** 
	 * 方形二维码图片链接地址
	 */
	@ApiField("qr_code_url")
	private String qrCodeUrl;

	/** 
	 * 圆形二维码地址，蓝色slogan
	 */
	@ApiField("qr_code_url_circle_blue")
	private String qrCodeUrlCircleBlue;

	/** 
	 * 圆形二维码地址，白色slogan
	 */
	@ApiField("qr_code_url_circle_white")
	private String qrCodeUrlCircleWhite;

	public void setQrCodeUrl(String qrCodeUrl) {
		this.qrCodeUrl = qrCodeUrl;
	}
	public String getQrCodeUrl( ) {
		return this.qrCodeUrl;
	}

	public void setQrCodeUrlCircleBlue(String qrCodeUrlCircleBlue) {
		this.qrCodeUrlCircleBlue = qrCodeUrlCircleBlue;
	}
	public String getQrCodeUrlCircleBlue( ) {
		return this.qrCodeUrlCircleBlue;
	}

	public void setQrCodeUrlCircleWhite(String qrCodeUrlCircleWhite) {
		this.qrCodeUrlCircleWhite = qrCodeUrlCircleWhite;
	}
	public String getQrCodeUrlCircleWhite( ) {
		return this.qrCodeUrlCircleWhite;
	}

}
