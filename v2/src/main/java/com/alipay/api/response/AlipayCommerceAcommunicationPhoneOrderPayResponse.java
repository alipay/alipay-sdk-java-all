package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.acommunication.phone.order.pay response.
 * 
 * @author auto create
 * @since 1.0, 2024-05-13 14:27:01
 */
public class AlipayCommerceAcommunicationPhoneOrderPayResponse extends AlipayResponse {

	private static final long serialVersionUID = 4713882899582752987L;

	/** 
	 * 支付宝业务订单号，支付宝充值平台生成业务单号，用来查看业务成功与否
	 */
	@ApiField("alipay_biz_no")
	private String alipayBizNo;

	/** 
	 * 支付宝收单交易号，用于查看B站账单核对资金
	 */
	@ApiField("alipay_trade_no")
	private String alipayTradeNo;

	public void setAlipayBizNo(String alipayBizNo) {
		this.alipayBizNo = alipayBizNo;
	}
	public String getAlipayBizNo( ) {
		return this.alipayBizNo;
	}

	public void setAlipayTradeNo(String alipayTradeNo) {
		this.alipayTradeNo = alipayTradeNo;
	}
	public String getAlipayTradeNo( ) {
		return this.alipayTradeNo;
	}

}
