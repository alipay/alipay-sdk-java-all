package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.mini.ampe.qrcode.create response.
 * 
 * @author auto create
 * @since 1.0, 2022-12-08 06:40:10
 */
public class AlipayOpenMiniAmpeQrcodeCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 5282768286799884772L;

	/** 
	 * 生成的二维码图片地址
	 */
	@ApiField("qrcode_img_url")
	private String qrcodeImgUrl;

	public void setQrcodeImgUrl(String qrcodeImgUrl) {
		this.qrcodeImgUrl = qrcodeImgUrl;
	}
	public String getQrcodeImgUrl( ) {
		return this.qrcodeImgUrl;
	}

}
