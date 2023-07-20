package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.operation.promoter.qrcode.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-29 22:52:56
 */
public class AlipayCommerceOperationPromoterQrcodeQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2888712921539711665L;

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
