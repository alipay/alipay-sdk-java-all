package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.eco.signflows.url.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-09-11 18:47:42
 */
public class AlipayEcoSignflowsUrlQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3868199451851899297L;

	/** 
	 * 预览短链地址（30天有效）
	 */
	@ApiField("preview_short_url")
	private String previewShortUrl;

	/** 
	 * 预览长链地址(永久有效)
	 */
	@ApiField("preview_url")
	private String previewUrl;

	/** 
	 * 签署短链地址（30天有效）
	 */
	@ApiField("sign_short_url")
	private String signShortUrl;

	/** 
	 * 签署长链地址(永久有效)
	 */
	@ApiField("sign_url")
	private String signUrl;

	public void setPreviewShortUrl(String previewShortUrl) {
		this.previewShortUrl = previewShortUrl;
	}
	public String getPreviewShortUrl( ) {
		return this.previewShortUrl;
	}

	public void setPreviewUrl(String previewUrl) {
		this.previewUrl = previewUrl;
	}
	public String getPreviewUrl( ) {
		return this.previewUrl;
	}

	public void setSignShortUrl(String signShortUrl) {
		this.signShortUrl = signShortUrl;
	}
	public String getSignShortUrl( ) {
		return this.signShortUrl;
	}

	public void setSignUrl(String signUrl) {
		this.signUrl = signUrl;
	}
	public String getSignUrl( ) {
		return this.signUrl;
	}

}
