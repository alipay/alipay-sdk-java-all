package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.operation.promoter.qrcode.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-04-03 11:13:43
 */
public class AlipayCommerceOperationPromoterQrcodeQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2199676225713899661L;

	/** 
	 * 推广码链接
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
