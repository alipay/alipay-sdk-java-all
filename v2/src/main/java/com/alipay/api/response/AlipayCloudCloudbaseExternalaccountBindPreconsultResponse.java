package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.cloud.cloudbase.externalaccount.bind.preconsult response.
 * 
 * @author auto create
 * @since 1.0, 2024-11-22 14:41:38
 */
public class AlipayCloudCloudbaseExternalaccountBindPreconsultResponse extends AlipayResponse {

	private static final long serialVersionUID = 6749557617323273924L;

	/** 
	 * 二维码地址
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
