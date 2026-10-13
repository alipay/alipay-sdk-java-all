package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.aipay.agent.payment.precreate response.
 * 
 * @author auto create
 * @since 1.0, 2026-09-24 13:47:56
 */
public class AlipayAipayAgentPaymentPrecreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 8584821366665746249L;

	/** 
	 * 按量付费预下单订单号，用于后续支付
	 */
	@ApiField("amt_pre_pay_id")
	private String amtPrePayId;

	/** 
	 * 支付二维码链接，仅接入商户通知的返回
	 */
	@ApiField("qr_code_url")
	private String qrCodeUrl;

	public void setAmtPrePayId(String amtPrePayId) {
		this.amtPrePayId = amtPrePayId;
	}
	public String getAmtPrePayId( ) {
		return this.amtPrePayId;
	}

	public void setQrCodeUrl(String qrCodeUrl) {
		this.qrCodeUrl = qrCodeUrl;
	}
	public String getQrCodeUrl( ) {
		return this.qrCodeUrl;
	}

}
