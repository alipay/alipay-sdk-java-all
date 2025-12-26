package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.aipay.trade.precreate response.
 * 
 * @author auto create
 * @since 1.0, 2025-12-24 17:22:41
 */
public class AlipayAipayTradePrecreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 4435725935456121687L;

	/** 
	 * 商户外部订单号。 与入参一致
	 */
	@ApiField("out_trade_no")
	private String outTradeNo;

	/** 
	 * 支付页地址
用户点击后可跳转至支付页面
	 */
	@ApiField("pay_url")
	private String payUrl;

	/** 
	 * 支付页对应二维码图片地址。 用户扫码可跳转至支付页
	 */
	@ApiField("pic_url")
	private String picUrl;

	public void setOutTradeNo(String outTradeNo) {
		this.outTradeNo = outTradeNo;
	}
	public String getOutTradeNo( ) {
		return this.outTradeNo;
	}

	public void setPayUrl(String payUrl) {
		this.payUrl = payUrl;
	}
	public String getPayUrl( ) {
		return this.payUrl;
	}

	public void setPicUrl(String picUrl) {
		this.picUrl = picUrl;
	}
	public String getPicUrl( ) {
		return this.picUrl;
	}

}
