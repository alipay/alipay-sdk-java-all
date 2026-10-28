package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.medical.medinqp.packagemateria.create response.
 * 
 * @author auto create
 * @since 1.0, 2026-10-21 13:57:58
 */
public class AlipayCommerceMedicalMedinqpPackagemateriaCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 7381529927874561542L;

	/** 
	 * 画眉渲染返回的海报图 URL
	 */
	@ApiField("poster_url")
	private String posterUrl;

	/** 
	 * 生成二维码后上传 AFTS 返回的公开访问 URL
	 */
	@ApiField("qr_image_url")
	private String qrImageUrl;

	/** 
	 * 二维码指向的服务包详情页 URL
	 */
	@ApiField("redirect_url")
	private String redirectUrl;

	public void setPosterUrl(String posterUrl) {
		this.posterUrl = posterUrl;
	}
	public String getPosterUrl( ) {
		return this.posterUrl;
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
