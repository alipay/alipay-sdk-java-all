package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.mall.scanpurchase.preorder.create response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-31 16:19:00
 */
public class KoubeiMallScanpurchasePreorderCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 3413856526834317233L;

	/** 
	 * 预订单编号
	 */
	@ApiField("advance_order_id")
	private String advanceOrderId;

	/** 
	 * 二维码code
	 */
	@ApiField("qr_code")
	private String qrCode;

	/** 
	 * 二维码链接地址
	 */
	@ApiField("qr_code_url")
	private String qrCodeUrl;

	public void setAdvanceOrderId(String advanceOrderId) {
		this.advanceOrderId = advanceOrderId;
	}
	public String getAdvanceOrderId( ) {
		return this.advanceOrderId;
	}

	public void setQrCode(String qrCode) {
		this.qrCode = qrCode;
	}
	public String getQrCode( ) {
		return this.qrCode;
	}

	public void setQrCodeUrl(String qrCodeUrl) {
		this.qrCodeUrl = qrCodeUrl;
	}
	public String getQrCodeUrl( ) {
		return this.qrCodeUrl;
	}

}
