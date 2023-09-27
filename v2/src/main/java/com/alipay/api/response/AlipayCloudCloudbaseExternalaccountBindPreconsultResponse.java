package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.cloud.cloudbase.externalaccount.bind.preconsult response.
 * 
 * @author auto create
 * @since 1.0, 2023-08-22 15:41:41
 */
public class AlipayCloudCloudbaseExternalaccountBindPreconsultResponse extends AlipayResponse {

	private static final long serialVersionUID = 5279657558411471341L;

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
