package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.medical.hdf.followupimg.create response.
 * 
 * @author auto create
 * @since 1.0, 2026-06-17 19:12:56
 */
public class AlipayCommerceMedicalHdfFollowupimgCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 2718324291192351881L;

	/** 
	 * 图片链接
	 */
	@ApiField("image_url")
	private String imageUrl;

	/** 
	 * 图片链接
	 */
	@ApiField("qr_image_url")
	private String qrImageUrl;

	/** 
	 * 跳转链接
	 */
	@ApiField("redirect_url")
	private String redirectUrl;

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}
	public String getImageUrl( ) {
		return this.imageUrl;
	}

	public void setQrImageUrl(String qrImageUrl) {
		this.qrImageUrl = qrImageUrl;
	}
	public String getQrImageUrl( ) {
		return this.qrImageUrl;
	}

	public void setRedirectUrl(String redirectUrl) {
		this.redirectUrl = redirectUrl;
	}
	public String getRedirectUrl( ) {
		return this.redirectUrl;
	}

}
