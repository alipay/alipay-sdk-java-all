package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: ant.merchant.expand.indirect.zft.quickcreate response.
 * 
 * @author auto create
 * @since 1.0, 2024-11-27 11:07:21
 */
public class AntMerchantExpandIndirectZftQuickcreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 6111583784865484452L;

	/** 
	 * 申请单id
	 */
	@ApiField("order_id")
	private String orderId;

	/** 
	 * 签约确认二维码链接
	 */
	@ApiField("sign_qr_code_url")
	private String signQrCodeUrl;

	/** 
	 * 签约确认生成的短链链接
	 */
	@ApiField("sign_short_chain_url")
	private String signShortChainUrl;

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	public String getOrderId( ) {
		return this.orderId;
	}

	public void setSignQrCodeUrl(String signQrCodeUrl) {
		this.signQrCodeUrl = signQrCodeUrl;
	}
	public String getSignQrCodeUrl( ) {
		return this.signQrCodeUrl;
	}

	public void setSignShortChainUrl(String signShortChainUrl) {
		this.signShortChainUrl = signShortChainUrl;
	}
	public String getSignShortChainUrl( ) {
		return this.signShortChainUrl;
	}

}
