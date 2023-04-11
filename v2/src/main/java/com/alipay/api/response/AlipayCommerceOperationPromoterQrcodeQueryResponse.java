package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.operation.promoter.qrcode.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-04-03 08:03:27
 */
public class AlipayCommerceOperationPromoterQrcodeQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5156494972345521699L;

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
