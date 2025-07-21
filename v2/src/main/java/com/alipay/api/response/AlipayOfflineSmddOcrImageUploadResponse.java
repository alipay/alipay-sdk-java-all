package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.offline.smdd.ocr.image.upload response.
 * 
 * @author auto create
 * @since 1.0, 2025-04-08 16:27:26
 */
public class AlipayOfflineSmddOcrImageUploadResponse extends AlipayResponse {

	private static final long serialVersionUID = 5488994171192918446L;

	/** 
	 * 该地址用于OCR识别
	 */
	@ApiField("afts_url")
	private String aftsUrl;

	public void setAftsUrl(String aftsUrl) {
		this.aftsUrl = aftsUrl;
	}
	public String getAftsUrl( ) {
		return this.aftsUrl;
	}

}
