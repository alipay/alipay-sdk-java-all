package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.servicemarket.item.qrcode.create response.
 * 
 * @author auto create
 * @since 1.0, 2019-07-23 12:21:08
 */
public class AlipayOpenServicemarketItemQrcodeCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 2747179443793216564L;

	/** 
	 * 支付宝二维码code，可以自行生成二维码图片
	 */
	@ApiField("qr_code")
	private String qrCode;

	/** 
	 * 二维码图片url，可以直接展示
	 */
	@ApiField("qr_img_url")
	private String qrImgUrl;

	/** 
	 * 支付宝二维码token值，即qr_code字段的尾部字符串
	 */
	@ApiField("qr_token")
	private String qrToken;

	public void setQrCode(String qrCode) {
		this.qrCode = qrCode;
	}
	public String getQrCode( ) {
		return this.qrCode;
	}

	public void setQrImgUrl(String qrImgUrl) {
		this.qrImgUrl = qrImgUrl;
	}
	public String getQrImgUrl( ) {
		return this.qrImgUrl;
	}

	public void setQrToken(String qrToken) {
		this.qrToken = qrToken;
	}
	public String getQrToken( ) {
		return this.qrToken;
	}

}
