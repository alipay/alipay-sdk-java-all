package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.trade.precreate response.
 * 
 * @author auto create
 * @since 1.0, 2020-03-16 13:12:23
 */
public class AlipayTradePrecreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 5783223483565386935L;

	/** 
	 * 商户的订单号
	 */
	@ApiField("out_trade_no")
	private String outTradeNo;

	/** 
	 * 当前预下单请求生成的二维码码串，可以用二维码生成工具根据该码串值生成对应的二维码
	 */
	@ApiField("qr_code")
	private String qrCode;

	public void setOutTradeNo(String outTradeNo) {
		this.outTradeNo = outTradeNo;
	}
	public String getOutTradeNo( ) {
		return this.outTradeNo;
	}

	public void setQrCode(String qrCode) {
		this.qrCode = qrCode;
	}
	public String getQrCode( ) {
		return this.qrCode;
	}

}
