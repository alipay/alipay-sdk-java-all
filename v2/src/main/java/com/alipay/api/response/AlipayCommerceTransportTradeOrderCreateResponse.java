package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.transport.trade.order.create response.
 * 
 * @author auto create
 * @since 1.0, 2026-01-26 17:52:42
 */
public class AlipayCommerceTransportTradeOrderCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 1478798456552418464L;

	/** 
	 * 代扣订单平台创建订单号
	 */
	@ApiField("bill_no")
	private String billNo;

	/** 
	 * 外部订单号
	 */
	@ApiField("out_no")
	private String outNo;

	/** 
	 * 代扣订单交易单号
	 */
	@ApiField("trade_no")
	private String tradeNo;

	public void setBillNo(String billNo) {
		this.billNo = billNo;
	}
	public String getBillNo( ) {
		return this.billNo;
	}

	public void setOutNo(String outNo) {
		this.outNo = outNo;
	}
	public String getOutNo( ) {
		return this.outNo;
	}

	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}
	public String getTradeNo( ) {
		return this.tradeNo;
	}

}
